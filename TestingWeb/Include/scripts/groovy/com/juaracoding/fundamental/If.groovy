package com.juaracoding.fundamental

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class If {
	static void main(String[] args) {
		
		int a = 100
		if(a<100) {
			println("Nilai a kurang dari 100")
		}
		else {
			println("Nilai a sama dengan atau lebih dari 100")
		}
		
		cekGanjilGenap(84)
		
		add(10,13)
		
	}
	
	static void cekGanjilGenap(int b) {
		
		if(b%2 == 0) {
			println("b bilangan genap")
		}
		else {
			println("b bilangan ganjil")
		}
	}
	
	static void add(int c, int d) {
		println("Nilai C + D = "+ (c+d))
	}
}