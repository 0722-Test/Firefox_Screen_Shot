package com.boll.miaomiao.module.app.controller;

import cn.hutool.core.io.FileUtil;
import com.boll.miaomiao.common.utils.R;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.StandardCopyOption;

/**
 * @Author: LQW
 * @Date: 2022/4/11 20:25
 */
@RestController
@RequestMapping("/app")
public class DictController {


    /**
     *   :依赖包
     *        <dependency>
     *             <groupId>org.seleniumhq.selenium</groupId>
     *             <artifactId>selenium-java</artifactId>
     *             <version>3.141.59</version>
     *         </dependency>
     */
    private static final WebDriver driver;

    static {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxBinary.addCommandLineOptions("--headless");
        firefoxOptions.setBinary(firefoxBinary);
        driver = new FirefoxDriver(firefoxOptions);
    }


    @RequestMapping("/testTEST")
    public R testTEST(String htmlPath, String picturePath) {
        try {
            driver.get("file://" + htmlPath);
            driver.manage().window().setSize(new Dimension(272, 6000));
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //执行屏幕截取
            FileUtil.copyFile(srcFile, new File(picturePath + System.currentTimeMillis() + ".png"), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        }
        return R.ok();
    }


}
