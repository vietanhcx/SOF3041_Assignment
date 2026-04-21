package org.example.sof3041sp26sof3041_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

    private WebDriver webDriver;

    @BeforeEach
    void setup() {

        // Khởi tạo Driver cho Chrome (Mẫu thầy hướng dẫn)
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {

        // 1. Mở trang web (Yêu cầu: 0.5 Điểm)
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        // 2. Click vào menu (3 gạch ngang)
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();

        // Chờ 2 giây để menu mở ra hoàn toàn (Log in - Yêu cầu: 1 Điểm)
        Thread.sleep(2000);

        // Đến Sign In Portal thông qua menu
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        // 3. Nhập giá trị vào Form (Input values via forms)
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        // 4. Submit form đăng nhập
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        // 5. Kiểm tra kết quả (Tests)
        // Tìm phần tử hiển thị loại giày để xác nhận đăng nhập thành công
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));

        // So sánh văn bản thực tế với kỳ vọng "Formal Shoes"
        Assertions.assertEquals("Formal Shoes", webElement.getText());

        // 6. Đóng trang web (Yêu cầu: 0.5 Điểm)
        webDriver.quit();
    }
}