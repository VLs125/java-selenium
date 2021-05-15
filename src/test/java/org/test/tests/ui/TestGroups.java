package org.test.tests.ui;

import org.testng.annotations.Test;

public class TestGroups {
    @Test(groups = {"firstGroup"})
    public void test1(){
        System.out.println("This is Test groups 1");

    }

    @Test(groups = {"secondGroup"})
    public void test2(){
        System.out.println("This is Test groups 2");

    }

    @Test(groups = {"thirdGroup"})
    public void test3(){
        System.out.println("This is Test groups 3");

    }
}
