package com.qa.actitime;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseFolder.DriverScript;
import CommonLib.Utils;
import Pages.TasksPage;

public class TasksPageTests extends DriverScript{
	TasksPage tp;
	ExtentSparkReporter extent;
	ExtentReports report;
	ExtentTest logger;
	@BeforeMethod
	public void setUp() {
		initDriver();
		tp=new TasksPage();
		extent=new ExtentSparkReporter("./acreports/actiauto.html");
		report=new ExtentReports();
		report.attachReporter(extent);
		
	}
	@AfterMethod
	public void tearDown() {
		report.flush();
		quitBrowser();
		
	}
	
	@Test
	public void testCreateCustomerinTasksPage()  {
		logger= report.createTest("Create Customer from Tasks Page in Actitime Website");
		tp.enterUserName("admin");
		logger.pass("Entered User Name",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.enterPassword("manager");
		logger.pass("Entered Password",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.clickLogin();
		logger.info("Clicked on login button",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.clickTasksLink();
		logger.info("Clicked on Tasks Link",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.clickAddNewTaskLink();
		logger.info("Clicked on New Tasks Link");
		tp.clickAddNewCustomerLink();
		logger.info("Clicked on New customer link",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.enterCustomeName("QA Test2");
		logger.pass("Entered cusomer name");
		tp.enterDescription("This is the desciption fo com.qa.automation project");
		logger.pass("Entered description",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.clickCreateCustomerLink();
		logger.pass("Clicked on create customer link",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		tp.clickLogoutLink();
		logger.pass("Clicked on Logout link",MediaEntityBuilder.createScreenCaptureFromPath(Utils.captureScreenshot(driver)).build());
		
	}
}
