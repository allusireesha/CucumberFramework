package com.cucumber.Base;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.Utilities.PropertiesFile;



public class BasePage {
	static WebDriver driver;
	BasePage page;
	PropertiesFile prop=new PropertiesFile();
	
	HashMap<String,By> ObjectRepo=new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	public void addObject(String elementName,  By by) {
		
		ObjectRepo.put(elementName, by);
	}
	public WebElement getElement(String elementName) {
	
		
		By by=ObjectRepo.get(elementName);
		WaitforElementlocatedby(by);
		WebElement element=driver.findElement(by);
		return element;
		
	}
	
	
	public void enterintoTextBox(String elementName,String inputData) {
		
		WebElement element=getElement(elementName);
		element.clear();
		WaitforElement(element);
		element.sendKeys(inputData);
		
	}
	public void ClickonButton(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}
	public void ClickonRadioButton(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}
	void WaitforElementlocatedby(By by) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		
	}
	void  WaitforElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	public void EnterOtp(String elementName) throws Exception  {
		WebElement element=getElement(elementName);
	Thread.sleep(20000);
	element.click();
	Thread.sleep(20000);
	}
	public void verifttitle(WebDriver driver) {
		driver.getTitle();
	}
	public void clickonTab(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}
	
	public void clickonCheckbox(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}
	/*public void selectdropdown(String dropdownElement,String valuetoSelect) {
		
		WebElement dropdown=getElement(dropdownElement);
		WaitforElement(dropdown);
		 Actions actions = new Actions(driver);
		    actions.moveToElement(dropdown).perform();
		dropdown.click();
		
		WebElement option=getElement(valuetoSelect);
		WaitforElement(option);
		option.click();
	}*/
	public void clickonLink(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}
	public void VerifyCheckbox(String elementName) {
		WebElement element=getElement(elementName);
		if(!element.isSelected()) {
			System.out.println("Remember me checkbox not selected");
		}
	}
	
	
	
	public void ReadandenterintoTextBox(String elementName, String inputValue) throws Exception  {
		
		String	inputData = prop.getproperty(inputValue);
		if (inputData == null) {
            throw new RuntimeException("inputValue not found in properties file: " + inputValue);
        }
			WebElement element=getElement(elementName);
			WaitforElement(element);
		element.sendKeys(inputData);
	}
	
	public void switchToNewWindow() {
	    String mainWindow = driver.getWindowHandle();
	    for (String handle : driver.getWindowHandles()) {
	        if (!handle.equals(mainWindow)) {
	            driver.switchTo().window(handle);
	            break;
	        }
	    }
	}
	
	public void verifyNewWindowOpened() {
	    if (driver.getWindowHandles().size() < 2) {
	        throw new AssertionError("Developer console window did not open!");
	    }
	}
	public void closeCurrentWindow() {
	    driver.close();
	}
	public void switchToMainWindow() {
	    for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);
	        break;
	    }
	}
	
	public void VerifyHomePage(String elementName) {
		WebElement element=getElement(elementName);
		if(element.isDisplayed()) {
			System.out.println(element+"page is displayed");
		}
		
	}
	public void selectFromDropdown(String elementName, String value) {
		Select dropdown = new Select(getElement(elementName));
		for(WebElement option  :dropdown.getOptions()) {
			if(option.getText().equalsIgnoreCase(value)) {
				dropdown.selectByVisibleText(option.getText());
				break;
			}
		}
		
        
    }
	
	public List<String> getDropdownvalues(String elementName) {
        WebElement element = getElement(elementName);
        Select select = new Select(element);

        List<String> Listoptions = new ArrayList<>();
        for (WebElement option : select.getOptions()) {
        	Listoptions.add(option.getText().trim());
        }
        return Listoptions;
    }
	public void verifyDropdownValues(String elementName, List<String> expectedvalues) {
        WebElement dropdownElement = getElement(elementName);
        

        List<WebElement> allOptions = dropdownElement.findElements(By.tagName("a"));

        
        List<String> actuallist = new ArrayList<>();

        for (WebElement option : allOptions) {
            actuallist.add(option.getText().trim());
        }
        Assert.assertEquals(expectedvalues, actuallist);
        
       
    }
	
	
	/*public void clickonDropdown(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}*/
	public void clickonLogout(String elementName) {
		WebElement element=getElement(elementName);
		WaitforElement(element);
		element.click();
	}
	public void verifyisDisplayed(String elementName) {
		WebElement element=getElement(elementName);
		boolean isdisplayed=true;
		Assert.assertEquals(isdisplayed, true);
		
	}
	public void verifytext(String elementName,String expectedValue) {
		//WaitforElement(element);
		WebElement element=getElement(elementName);
		String actualValue=element.getText();
		
		Assert.assertEquals(actualValue,expectedValue);
	}
	public void verifydata(String elementName,String inputData) {
		String expected=inputData;
		String actualvalue=getElement(elementName).getText();
		Assert.assertEquals(actualvalue, inputData);
	}
	public void verifyPageIsDisplayed(String elementName) {
	    WebElement element = getElement(elementName);
	    WaitforElement(element);

	    if (!element.isDisplayed()) {
	        throw new AssertionError("Page NOT displayed. Element not found: " + elementName);
	    }

	    System.out.println("Page is displayed. Verified by element: " + elementName);
	}
	
}



