package service;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.DataProvider;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

public class TestDataProvider {


    private static int DEFAULT_WAIT = 5;

    private static String currentDate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());

    private static ExtentReports extentReports = new ExtentReports(System.getProperty("user.dir") + "\\Reports\\Report for " + currentDate + "\\DBAPI_" + currentDate + ".html");

    public static String getCurrentDate() {
        return currentDate;
    }

    public static void setCurrentDate(String currentDate) {
        TestDataProvider.currentDate = currentDate;
    }

    public static ExtentReports getExtents() {
        if (extentReports != null) {
            return extentReports;
        } else {
            return new ExtentReports(System.getProperty("user.dir") + "\\Reports\\Report for " + currentDate + "\\DBAPI_" + currentDate + ".html");
        }
    }


    @DataProvider(name = "testdata")
    public final Object[][] data() throws Exception {
        Map<String, String[]> dataSet = new TestDataParser().getData();
        for (Map.Entry<String, String[]> entry : dataSet.entrySet()) {
            for (int i = 0; i < entry.getValue().length; i++) {
                String[] mass = entry.getValue();
            }
        }
        return new Object[][]{{dataSet}};
    }

}
