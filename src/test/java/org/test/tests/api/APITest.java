package org.test.tests.api;

import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.when;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static org.hamcrest.core.IsEqual.equalTo;

@Test(groups = {"api"})
public class APITest {
    public void getSecondPosts(){
        when()
                .get("https://jsonplaceholder.typicode.com/posts/2")
                .then()
                .statusCode(200)
                .assertThat().body("userId",equalTo(1));
        Response response = get("https://jsonplaceholder.typicode.com/posts/2");
        LOGGER.info("Second post has data "+ response.getBody().asString());
    }
}
