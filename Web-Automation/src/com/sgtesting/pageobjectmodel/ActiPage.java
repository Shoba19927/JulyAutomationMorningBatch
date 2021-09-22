package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActiPage {

	public ActiPage(WebDriver oBrowser)
	{
     PageFactory.initElements(oBrowser, this);
	}
	
	
	//User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	
	//Login button Field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	
	
	//Fly Out Window Field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWin()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
	
	

	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement userIcon;
	public WebElement getUserIcon()
	{
		return userIcon;
	}
	
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement addUser;
	public WebElement getAddUser()
	{
		return addUser;
	}
	
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	
	private WebElement unName;
	public WebElement getFirstName1() {
		return unName;
	}
	
	
	private WebElement password;
	public WebElement getUserPassWord() {
		return password;
	}
	private WebElement passwordCopy;
	public WebElement getUserPassWordCopy() {
		return passwordCopy;
	}
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement getUserCommitBtn() {
		return userDataLightBox_commitBtn;
	}
	
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement secondtable;
	public WebElement getSecondTableContainer()
	{
		return secondtable;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getUserDeleteBtn() 
	{
		return userDataLightBox_deleteBtn;
	}
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement tasksIcon;
	public WebElement getTasksIcon()
	{
		return tasksIcon;
	}
	
	@FindBy(xpath="//div[@class=\"title ellipsis\"][text()=\"Add New\"]")
	private WebElement addCustomerOrProject;
	public WebElement getaddCustomerOrProject()
	{
		return addCustomerOrProject;
	}
	
	@FindBy(xpath="//div[@class=\"item createNewCustomer ellipsis\"]")
	private WebElement newCustomerOption;
	public WebElement getNewCustomerOption()
	{
		return newCustomerOption;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerNameField()
	{
		return customerLightBox_nameField;
	}
	
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustomerDescriptionField()
	{
		return customerLightBox_descriptionField;
	}
	
	@FindBy(xpath="//span[@class=\"buttonTitle\"][text()=\"Create Customer\"]")
	private WebElement createCustomerCommitButton;
	public WebElement getCreateCustomerCommitButton()
	{
		return createCustomerCommitButton;
	}
	
	@FindBy(xpath="//div[@class=\"editButton available\"]")
	private WebElement customerSettings;
	public WebElement getCustomerSettings()
	{
		return customerSettings;
	}
	
	@FindBy(xpath="//div[@class=\"action\"][text()=\"ACTIONS\"]")
	private WebElement customerActionOption;
	public WebElement getCustomerActionOption()
	{
		return customerActionOption;
	}
	
	@FindBy(xpath="//div[@class=\"title\"][text()=\"Delete\"]")
	private WebElement customerDelete;
	public WebElement getCustomerDelete()
	{
		return customerDelete;
	}
	
	@FindBy(xpath="//span[@id=\"customerPanel_deleteConfirm_submitTitle\"][text()=\"Delete permanently\"]")
	private WebElement customerDeleteConfirm;
	public WebElement getCustomerDeleteConfirm()
	{
		return customerDeleteConfirm;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement selectCustomerNameField;
	public WebElement getSelectCustomerNameField()
	{
		return selectCustomerNameField;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement customerNameFieldText;
	public WebElement getCustomerNameFieldText()
	{
		return customerNameFieldText;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement customerSettingsClose;
	public WebElement getCustomerSettingsClose()
	{
		return customerSettingsClose;
	}
	
	@FindBy(xpath="//div[@class=\"item createNewProject ellipsis\"]")
	private WebElement newProjectOption;
	public WebElement getNewProjectOption()
	{
		return newProjectOption;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectNameField()
	{
		return projectPopup_projectNameField;
	}
	
	private WebElement projectPopup_projectDescriptionField;
	public WebElement getProjectDescriptionField()
	{
		return projectPopup_projectDescriptionField;
	}
	
	@FindBy(xpath="//span[@class=\"buttonTitle\"][text()=\"Create Project\"]")
	private WebElement newProjectCommit;
	public WebElement getNewProjectCommitBtn()
	{
		return newProjectCommit;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectSettings;
	public WebElement getProjectSettings()
	{
		return projectSettings;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[1]")
	private WebElement projectAction;
	public WebElement getProjectActions()
	{
		return projectAction;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement projectDeleteOption;
	public WebElement getProjectDeleteOption()
	{
		return projectDeleteOption;
	}
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getProjectDeleteConfirm()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement selectProjectField;
	public WebElement getSelectProjectField()
	{
		return selectProjectField;
	}
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement selectProjectFieldText;
	public WebElement getSelectProjectFieldText()
	{
		return selectProjectFieldText;
	}
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement projectSettingsClose;
	public WebElement getProjectSettingsClose()
	{
		return projectSettingsClose;
	}
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement taskOption;
	public WebElement getTaskOption()
	{
		return taskOption;
	}
	public WebElement user() {
		// TODO Auto-generated method stub
		return null;
	}

}
