package com.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import tyu.JiraServiceProvider;
import tyu.Jirapolicy;

public class Testjira implements  ITestListener
{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		Jirapolicy jirapolic = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Jirapolicy.class);
		boolean isTicketReady = jirapolic .logTicketReady();
		if(isTicketReady)
		{
			System.out.println("is ticket ready for JIRA: " + isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://tanuja.atlassian.net/",
					"tanujaanvitha@gmail.com", "ZBQiaRF3rT8CX726lLLu4356", "GTR");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
					+ "got  assertion or exception";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Tanuja");
		}

	}
		
		
		
	

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}

