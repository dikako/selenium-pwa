package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import object.LiveTvs;
import object.Menus;

public class LiveTv {
	WebDriver driver;

	public LiveTv(WebDriver driver) {
		this.driver = driver;
	}

	public void validateCountChannel() {
		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);

		System.out.println("Test Live TV - Validate Count of Tv Channel");

		menu.liveTv();
		livetv.validateCountChannel(4);
	}

	public void validateChannelActived() {
		String name = "RCTI";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);

		System.out.println("Test Live TV - Validate Channel Actived");

		menu.liveTv();
		livetv.validateChannelActived(name, true);
	}

	public void validateNameChannelRcti() {
		String channelName = "RCTI";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);

		System.out.println("Test Live TV - Validate Channel Name RCTI");

		menu.liveTv();
		livetv.validateListChannelName(channelName, 0);
	}
	
	public void validateNameChannelMnctv() {
		String channelName = "MNCTV";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);

		System.out.println("Test Live TV - Validate Channel Name MNCTV");

		menu.liveTv();
		livetv.validateListChannelName(channelName, 1);
	}
	
	public void validateNameChannelGtv() {
		String channelName = "GTV";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);

		System.out.println("Test Live TV - Validate Channel Name GTV");

		menu.liveTv();
		livetv.validateListChannelName(channelName, 2);
	}
	
	public void validateNameChannelInews() {
		String channelName = "INEWS";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);

		System.out.println("Test Live TV - Validate Channel Name INEWS");

		menu.liveTv();
		livetv.validateListChannelName(channelName, 3);
	}
	
	public void validateKlikChannelRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Klik Chanel " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validatePlayerFormIsDisplayed(true);
	}
	
	public void validateKlikChannelMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Klik Chanel " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validatePlayerFormIsDisplayed(true);
	}
	
	public void validateKlikChannelGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Klik Chanel " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validatePlayerFormIsDisplayed(true);
	}
	
	public void validateKlikChannelInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Klik Chanel " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validatePlayerFormIsDisplayed(true);
	}
	
	public void validateListEpgNotNullRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate List EPG Not Null " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateListEpgNotNull();
	}
	
	public void validateListEpgNotNullMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate List EPG Not Null " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validateListEpgNotNull();
	}
	
	public void validateListEpgNotNullGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate List EPG Not Null " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validateListEpgNotNull();
	}
	
	public void validateListEpgNotNullInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate List EPG Not Null " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validateListEpgNotNull();
	}
	
	public void validateEpgIsDisplayedRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Epg Displayed " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateEpgIsDisplayed(true);
	}
	
	public void validateEpgIsDisplayedMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Epg Displayed " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validateEpgIsDisplayed(true);
	}
	
	public void validateEpgIsDisplayedGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Epg Displayed " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validateEpgIsDisplayed(true);
	}
	
	public void validateEpgIsDisplayedInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Epg Displayed " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validateEpgIsDisplayed(true);
	}
	
	public void validateCountNavTabsRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Count " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateCountNavTabs(2);
	}
	
	public void validateCountNavTabsMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Count " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validateCountNavTabs(2);
	}
	
	public void validateCountNavTabsGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Count " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validateCountNavTabs(2);
	}
	
	public void validateCountNavTabsInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Count " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validateCountNavTabs(2);
	}
	
	public void validateNavTabsNameLiveRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";
		String name = "Live";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(0, name);
	}
	
	public void validateNavTabsNameCacthUpRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";
		String name = "Catch Up TV";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(1, name);
	}
	
	public void validateNavTabsNameLiveMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";
		String name = "Live";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(0, name);
	}
	
	public void validateNavTabsNameCacthUpMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";
		String name = "Catch Up TV";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(1, name);
	}
	
	public void validateNavTabsNameLiveGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";
		String name = "Live";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(0, name);
	}
	
	public void validateNavTabsNameCacthUpGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";
		String name = "Catch Up TV";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(1, name);
	}
	
	public void validateNavTabsNameLiveInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";
		String name = "Live";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(0, name);
	}
	
	public void validateNavTabsNameCacthUpInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";
		String name = "Catch Up TV";

		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Nav Name " + name + " "  + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validateNameNavTabsList(1, name);
	}
	
	public void validateKlikQualityVideo() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";
		String titleName = "Quality";
		
		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Quality Video " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateKlikQualityVideo(titleName);
	}
	
	public void validateTabChatRcti() throws InterruptedException {
		String channelName = "RCTI";
		String urls = "/tv/rcti";
		
		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Quality Video " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 0);
		livetv.validateUrl(urls);
		livetv.validateTabChatIsDisplayed(true);
	}
	
	public void validateTabChatGtv() throws InterruptedException {
		String channelName = "GTV";
		String urls = "/tv/gtv";
		
		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Chat " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 2);
		livetv.validateUrl(urls);
		livetv.validateTabChatIsDisplayed(true);
	}
	
	public void validateTabChatMnctv() throws InterruptedException {
		String channelName = "MNCTV";
		String urls = "/tv/mnctv";
		
		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Chat " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 1);
		livetv.validateUrl(urls);
		livetv.validateTabChatIsDisplayed(true);
	}
	
	public void validateTabChatInews() throws InterruptedException {
		String channelName = "INEWS";
		String urls = "/tv/inews";
		
		Menus menu = PageFactory.initElements(driver, Menus.class);
		LiveTvs livetv = PageFactory.initElements(driver, LiveTvs.class);
		
		System.out.println("Test Live TV - Validate Tab Chat " + channelName);
		
		menu.liveTv();
		livetv.validateKlikChannel(channelName, 3);
		livetv.validateUrl(urls);
		livetv.validateTabChatIsDisplayed(true);
	}
	
}
