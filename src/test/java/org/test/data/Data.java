package org.test.data;

import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider(name = "search query")
    public Object [][] dataProviderMethod(){

        return new Object[][]{{"selenium java"},{"selenium javascript"}};

    }

}
