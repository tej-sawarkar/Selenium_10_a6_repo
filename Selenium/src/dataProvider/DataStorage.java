package dataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
@DataProvider
public String[][] dataSender() {
	String[][] data = { { "admin", "admin" }, { "admin", "ad" }, { "ad", "admin" } };
	return data;
}
@DataProvider
public String[][] login(){
	String[][] data= { { "admin", "admin" }, { "admin", "ad" }, { "ad", "admin" } };
	return data;
	
}
}
