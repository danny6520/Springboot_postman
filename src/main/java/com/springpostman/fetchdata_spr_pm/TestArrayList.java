package com.springpostman.fetchdata_spr_pm;
import java.util.*;
import java.util.Arrays;

public class TestArrayList {
String sArray[] = {"html", "php", "java", "python"};
List<String> list = Arrays.asList(sArray);
ArrayList<String> result = new ArrayList<String>(list);

public ArrayList<String> getResult() {
	return result;
}
public void setResult(ArrayList<String> result) {
	this.result = result;
}

}