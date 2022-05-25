package com.brillio.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1OrangeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
