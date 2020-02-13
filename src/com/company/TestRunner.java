package com.company;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebDriver;

public class TestRunner {

    public static void main(String[] args) {
	// write your code here
        Result result = JUnitCore.runClasses(PrestaShop.class);
        System.out.println(result.wasSuccessful());

    }
}
