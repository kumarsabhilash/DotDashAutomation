package com.dotdashcom.pom;

public interface Locators {
	 String loginUserBoxId = "username";
	 String loginPassBoxId = "password";
	 String loginButtonTag = "button";
	 String loginSuccessTag = "h2";
	 String loginFailureId = "flash";
	 String checkBoxTag = "input";
	 String contextMenuId = "hot-spot";
	 String fromDrag = "//div[@id=\"column-a\"]";
	 String toDrag = "//div[@id=\"column-b\"]";
	 String colAHeader = "//div[@id='column-a']/header";
	 String colBHeader = "//div[@id='column-b']/header";
	 String selectId = "dropdown";
	 String dynamicContent = "//div[@id='content']/div[@class='row']/div[2]";
	 String removeButton = "//button[text()='Remove']";
	 String addButton = "//button[text()='Add']";
	 String dynamicCheckbox = "//input[@type='checkbox']";
	 String dynamicTextBox = "//input[@type='text']";
	 String enableButton = "//button[text()='Enable']";
	 String disableButton = "//button[text()='Disable']";
	 String dynamicLoadingStart = "//button";
	 String dynamicLoadingDivId= "finish";
	 String dynamicLoadingText = "//div[@id='finish']/h4";
	 String fileDownload = "//div/h3/following-sibling::a";
	 String dropAreaId = "drag-drop-upload";
	 String uploadButtonId = "file-upload";
	 String uploadButtonSubmit ="file-submit";
	 String floatingMenuUlTag = "ul";
	 String iframe = "mce_0_ifr";
	 String closeNotif = "//button[contains(@class,'notification')]";
	 String iframeContent = "//body/p";
	 String imageOverFig ="//div[@class='figure']/img";
	 String figCaptionH5 = "//div[@class='figcaption']/h5";
	 String figCaptionA = "//div[@class='figcaption']/a";
	 String jsAlert = "//button[contains(text(),'JS Alert')]";
	 String jsConfirm = "//button[contains(text(),'JS Confirm')]";
	 String jsPrompt = "//button[contains(text(),'JS Prompt')]";
	 String promptResult = "//p[@id='result']";
	 String clickHere = "//a[contains(text(),'Click')]";
	 String notif = "//div[@id='flash']";
}
