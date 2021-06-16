package org.test.api;

import com.jayway.restassured.response.Response;
import org.test.data.Data;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.when;
//import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static org.hamcrest.core.IsEqual.equalTo;

public class Posts {

    public void getPosts(String url, Object id){
        when()
                .get(url)
                .then()
                .statusCode(200);
                //.assertThat().body(,equalTo(id));
        Response response = get(url);
        System.out.println("Posts has data "+ response.getBody().asString());
     //   LOGGER.info("Posts has data "+ response.getBody().asString());
    }
}
