package test;

import org.testng.annotations.Test;

import config.Setup;
import config.Url;
import testcases.LiveTv;

@Test
public class Test_LiveTv extends Setup {
	@Test(priority = 0)
	public void livetv_validateCountChannel() {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateCountChannel();
	}
	
	@Test(priority = 1)
	public void livetv_validateChannelActived() {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateChannelActived();
	}
	
	@Test(priority = 2)
	public void livetv_validateChannelNameRCTI() {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNameChannelRcti();
	}
	
	@Test(priority = 2)
	public void livetv_validateChannelNameMNCTV() {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNameChannelMnctv();
	}
	
	@Test(priority = 2)
	public void livetv_validateChannelNameGTV() {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNameChannelGtv();
	}
	
	@Test(priority = 2)
	public void livetv_validateChannelNameINEWS() {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNameChannelInews();
	}
	
	@Test(priority = 3)
	public void livetv_validateKlikChannelNameRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateKlikChannelRcti();
	}
	
	@Test(priority = 3)
	public void livetv_validateKlikChannelNameMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateKlikChannelMnctv();
	}
	
	@Test(priority = 3)
	public void livetv_validateKlikChannelNameGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateKlikChannelGtv();
	}
	
	@Test(priority = 3)
	public void livetv_validateKlikChannelNameINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateKlikChannelInews();
	}
	
	
	@Test(priority = 4)
	public void livetv_validateListEpgNotNullRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateListEpgNotNullRcti();
	}
	
	@Test(priority = 4)
	public void livetv_validateListEpgNotNullMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateListEpgNotNullMnctv();
	}
	
	@Test(priority = 4)
	public void livetv_validateListEpgNotNullGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateListEpgNotNullGtv();
	}
	
	@Test(priority = 4)
	public void livetv_validateListEpgNotNullINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateListEpgNotNullInews();
	}
	
	@Test(priority = 5)
	public void livetv_validateListEpgIsDisplayedRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateEpgIsDisplayedRcti();
	}
	
	@Test(priority = 5)
	public void livetv_validateListEpgIsDisplayedMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateEpgIsDisplayedMnctv();
	}
	
	@Test(priority = 5)
	public void livetv_validateListEpgIsDisplayedGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateEpgIsDisplayedGtv();
	}
	
	@Test(priority = 5)
	public void livetv_validateListEpgIsDisplayedINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateEpgIsDisplayedInews();
	}
	
	@Test(priority = 6)
	public void livetv_validateNavTabRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateCountNavTabsRcti();
	}
	
	@Test(priority = 6)
	public void livetv_validateNavTabMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateCountNavTabsMnctv();
	}
	
	@Test(priority = 6)
	public void livetv_validateNavTabGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateCountNavTabsGtv();
	}
	
	@Test(priority = 6)
	public void livetv_validateNavTabINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateCountNavTabsInews();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameLiveRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameLiveRcti();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameCacthUpRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameCacthUpRcti();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameLiveMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameLiveMnctv();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameCacthUpMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameCacthUpMnctv();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameLiveGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameLiveGtv();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameCacthUpGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameCacthUpGtv();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameLiveINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameLiveInews();
	}
	
	@Test(priority = 7)
	public void livetv_validateNavTabNameCacthUpINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateNavTabsNameCacthUpInews();
	}
	
	@Test(priority = 8)
	public void livetv_validateKlikQualityVideo() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateKlikQualityVideo();
	}
	
	
	@Test(priority = 9)
	public void livetv_validateTabChatRCTI() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateTabChatRcti();
	}
	
	@Test(priority = 9)
	public void livetv_validateTabChatMNCTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateTabChatMnctv();
	}
	
	@Test(priority = 9)
	public void livetv_validateTabChatGTV() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateTabChatGtv();
	}
	
	@Test(priority = 9)
	public void livetv_validateTabChatINEWS() throws InterruptedException {
		LiveTv page = new LiveTv(driver);
		Url url = new Url(driver);
		url.defaultUrl();
		page.validateTabChatInews();
	}
	
}
