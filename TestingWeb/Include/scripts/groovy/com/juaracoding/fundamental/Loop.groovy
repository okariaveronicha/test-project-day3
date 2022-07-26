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

public class Loop {
	static void main(String[] args) {
		ulang(3)
		println '-----'
		ulang(6)
		println '-----'
		jmlGanjil(1,10)
	}
	
	static void ulang(int n) {
		for(int i; i<n; i++) {
			for(int j=0; j<i; j++) {
				print '*'
			}
			println ''
		}
	}
	
	static void jmlGanjil(int awal, int akhir) {
		int sum = 0
		
		for(int i=awal;i<akhir;i++) {
			if(i%2==1) {
				println i
				sum+=i
			}
		}
		println sum
	}

}
