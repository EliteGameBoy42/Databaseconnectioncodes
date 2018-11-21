package mysqldatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class jdbcConnection {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";

        Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "syful8646");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employeeinfo where location='California';");

        while (resultSet.next()) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
//            driver.get("https://facebook.com");
            String firstname = resultSet.getString("firstname");
//            driver.findElement(By.name("firstname")).sendKeys(firstname);
            String lastname = resultSet.getString("lastname");
//            driver.findElement(By.name("lastname")).sendKeys(lastname);
//            driver.findElement(By.name("websubmit")).click();

        }
    }
}