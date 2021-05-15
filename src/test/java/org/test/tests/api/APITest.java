package org.test.tests.api;

import com.jayway.restassured.response.Response;
import org.test.data.Data;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.when;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static org.hamcrest.core.IsEqual.equalTo;

public class APITest {

    @Test(dataProvider ="dp",dataProviderClass = Data.APIData.class)
    public void getSecondPosts(String url, Object id){

//        System.out.println("url " +url);
//        System.out.println("id "+id);

        when()
                .get(url)
                .then()
                .statusCode(200)
                .assertThat().body("id",equalTo(id));
        Response response = get("https://jsonplaceholder.typicode.com/posts/2");
        LOGGER.info("Second post has data "+ response.getBody().asString());
    }
}
