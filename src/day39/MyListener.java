package day39;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("On finish");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("On Start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("On Test Failure");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On Test Skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("On Test start");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("On Test SUCCESS");
		
	}

}
