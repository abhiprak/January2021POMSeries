package com.qa.realerp.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {
	
	//TestNG Listeners are the piece of code that listens to every event that occurs in TestNG.
	//That means if we have written a piece of code for a particular event, then that piece of code gets executed whenever that particular event occurs.
		
		//Types of Listeners:
		//1. ITestListener	2. ISuiteListener	3. IReportListener

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start method started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Method started");
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started: " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success Method: " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure Method: " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped Method: " + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage Method: " + result.getName());
		
	}

	
	
	

}
