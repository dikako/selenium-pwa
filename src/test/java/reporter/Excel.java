package reporter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Excel {

	private XSSFWorkbook book;
	
	@Test
	public void generateExcelReport(String destFilename)
			throws ParserConfigurationException, SAXException, IOException {
		String path = Excel.class.getClassLoader().getResource("./").getPath();

		System.out.println(path);
		path = path.replaceAll("target/test-classes/", "src/test/java/reporter/");

		File xmlFile = new File("./test-output/testng-results.xml");
		System.out.println(xmlFile.isFile());

		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		DocumentBuilder build = fact.newDocumentBuilder();
		Document doc = build.parse(xmlFile);
		doc.getDocumentElement().normalize();

		book = new XSSFWorkbook();
		XSSFCellStyle fail = book.createCellStyle();
		XSSFCellStyle pass = book.createCellStyle();

		NodeList test_list = doc.getElementsByTagName("test");
		for (int i = 0; i < test_list.getLength(); i++) {
			int row = 0;
			Node test_node = test_list.item(i);
			String test_name = ((Element) test_node).getAttribute("name");
			XSSFSheet sheet = book.createSheet(test_name);
			NodeList class_list = ((Element) test_node).getElementsByTagName("class");
			System.err.println(test_name);

			for (int j = 0; j < class_list.getLength(); j++) {
				Node class_node = class_list.item(j);
				String class_name = ((Element) class_node).getAttribute("name");
				System.out.println(class_name);
				NodeList test_method_list = ((Element) class_node).getElementsByTagName("test-method");

				for (int k = 0; k < test_method_list.getLength(); k++) {
					Node test_method_node = test_method_list.item(k);
					String test_method_name = ((Element) test_method_node).getAttribute("name");
					System.out.println(test_method_name);
					String test_method_status = ((Element) test_method_node).getAttribute("status");
					System.out.println(test_method_status);
					String test_method_duration = ((Element) test_method_node).getAttribute("duration-ms");
					System.out.println(test_method_duration);
					String test_method_start = ((Element) test_method_node).getAttribute("started-at");
					System.out.println(test_method_start);
					String test_method_finish = ((Element) test_method_node).getAttribute("finished-at");
					System.out.println(test_method_finish);

					fail.setFillForegroundColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
					pass.setFillForegroundColor(HSSFColor.HSSFColorPredefined.BRIGHT_GREEN.getIndex());

					fail.setFillPattern(FillPatternType.SOLID_FOREGROUND);
					pass.setFillPattern(FillPatternType.SOLID_FOREGROUND);

					XSSFRow rows = sheet.createRow(row++);
					XSSFCell cell_name = rows.createCell(0);
					cell_name.setCellValue(class_name + "." + test_method_name);

					XSSFCell cell_status = rows.createCell(1);
					cell_status.setCellValue(test_method_status);

					XSSFCell cell_duration = rows.createCell(2);
					cell_duration.setCellValue(test_method_duration);

					XSSFCell cell_start = rows.createCell(3);
					cell_start.setCellValue(test_method_start);

					XSSFCell cell_finish = rows.createCell(4);
					cell_finish.setCellValue(test_method_finish);

					if ("FAIL".equalsIgnoreCase(test_method_status))
						cell_status.setCellStyle(fail);
					else
						cell_status.setCellStyle(pass);

					XSSFCell cell_exp;
					String exp_msg;

					if ("FAIL".equalsIgnoreCase(test_method_status)) {
						NodeList exp_list = ((Element) test_method_node).getElementsByTagName("exception");
						Node exp_node = exp_list.item(0);
						exp_msg = ((Element) exp_node).getAttribute("class");

						cell_exp = rows.createCell(5);
						cell_exp.setCellValue(exp_msg);
					}
				}
			}
		}

		FileOutputStream fout = new FileOutputStream(path + destFilename);
		book.write(fout);
		fout.close();
		System.out.println("Excel Report is Generate Successfully!");
	}

	public static void main(String[] args) {
		try {
			new Excel().generateExcelReport("report.xlsx");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
