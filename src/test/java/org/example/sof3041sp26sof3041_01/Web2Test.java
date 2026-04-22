package org.example.sof3041sp26sof3041_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web2Test {

    private WebDriver webDriver;

    @BeforeEach
    void setup() {

        // Khởi tạo Driver cho Chrome (Mẫu thầy hướng dẫn)
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {

        // 1. Mở trình duyệt và truy cập vào trang web (Yêu cầu: 0.5 Điểm)
        webDriver.get("https://www.saucedemo.com/");

        // 2. Đăng nhập với username và password (Yêu cầu: 0.5 Điểm)
        // Sử dụng XPath đúng như mẫu bạn yêu cầu
        webDriver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

        // Submit form đăng nhập
        webDriver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        // Chờ 2 giây để trang quản lý sản phẩm tải xong
        Thread.sleep(2000);

        // 3. Thêm sản phẩm đầu tiên vào giỏ hàng (Yêu cầu: 0.5 Điểm)
        // Click nút "Add to cart" của sản phẩm đầu tiên
        webDriver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

        // Kiểm tra xem giỏ hàng có hiển thị số "1" hay không
        WebElement cartBadge = webDriver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));

        // 5. Kiểm tra kết quả (Tests)
        // So sánh văn bản thực tế với kỳ vọng "1"
        Assertions.assertEquals("1", cartBadge.getText());

        // 6. Đóng trình duyệt (Yêu cầu: 0.5 Điểm)
        Thread.sleep(1000);
        webDriver.quit();
    }
}