package localApi.utils.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import localApi.utilities.logs.Log;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManagement implements ITestListener {
    public ExtentReports extent;
    public ExtentSparkReporter spark;
    String reportName;

    public void onStart(ITestContext context) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        reportName = "Test-Report-"+timeStamp+".html";
        spark = new ExtentSparkReporter("target\\reports\\"+reportName);
        spark.config(
                ExtentSparkReporterConfig.builder()
                        .theme(Theme.DARK)
                        .documentTitle("Test Report")
                        .build()
        );
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }
    public void onTestStart(ITestResult result) {
    }

    public void onTestSuccess(ITestResult result) {
        ExtentTest test = extent.createTest(result.getName());
        test.createNode(result.getName());
        test.log(Status.PASS, "Test Passed");
        Log.info("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        ExtentTest test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Failed");
        Log.error("Test Failed");
    }

    public void onTestSkipped(ITestResult result) {
        ExtentTest test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Skipped");
        Log.warn("Test Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
