package utils;

import java.util.HashMap;
import java.util.Map;

public class InitializationData {

    private static Map<String, String> fillData(){
        Map<String, String> pagesList = new HashMap<>();

        pagesList.put("Home", "https://www.google.com/");
        pagesList.put("AuthorizationPage", "");

        return pagesList;
    }

    public static String getPages(String page){
        return fillData().get(page);
    }

}







