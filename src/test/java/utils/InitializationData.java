package utils;

import java.util.HashMap;
import java.util.Map;

public class InitializationData {
    private static Map<String, String> fillData(){
        Map<String, String> pagesList = new HashMap<String,String>();

        pagesList.put("Home", "https://www.google.com/");

        return pagesList;
    }
    public static String getPages(String page){

        return fillData().get(page);
    }

}







