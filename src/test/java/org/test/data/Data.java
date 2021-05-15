package org.test.data;


import org.testng.annotations.DataProvider;
import org.testng.collections.Lists;

import java.util.Arrays;
import java.util.List;

public class Data {


   public static class UIData{

       @DataProvider(name = "searchQuery")
       public static  Object [][] dataProviderMethod(){

           return new Object[][]{{"selenium java"},{"selenium javascript"}};

       }

   }

   public static class APIData{
//       static Object[][] urls() {
//           return new Object[][] {
//                   new Object[] {"https://jsonplaceholder.typicode.com/2",},
//                   new Object[] {"https://jsonplaceholder.typicode.com/posts/3",}
//           };
//       }
//      static Object[][] bodyIdData() {
//           return new Object[][] {
//                   new Object[] {2,},
//                   new Object[] {3,},
//           };
//       }
//       @DataProvider(name = "postUrl")
//       public static Object[][] dataProverMethod(){
//           List<Object[]> result = Lists.newArrayList();
//           result.addAll(Arrays.asList(urls()));
//           result.addAll(Arrays.asList(bodyIdData()));
//           return result.toArray(new Object[result.size()][]);
//       }
//
//       }

    static Object[][] dp1() {
        return new Object[][] {
                new Object[] { "https://jsonplaceholder.typicode.com/posts/2", 2 },

        };
    }

    static Object[][] dp2() {
        return new Object[][] {
                new Object[] { "https://jsonplaceholder.typicode.com/posts/3", 3 },

        };
    }

    @DataProvider(name = "dp")
    public static Object[][] dp() {
        List<Object[]> result = Lists.newArrayList();
        result.addAll(Arrays.asList(dp1()));
        result.addAll(Arrays.asList(dp2()));
        return result.toArray(new Object[result.size()][]);
    }

//    @Test(dataProvider = "dp")
//    public void f(String a, String b) {
//        System.out.println("f " + a + " " + b);
    }

   }



