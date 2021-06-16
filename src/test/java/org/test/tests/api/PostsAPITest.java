package org.test.tests.api;

import org.test.api.Posts;
import org.test.config.BaseAPITest;
import org.test.data.Data;
import org.testng.annotations.Test;



        public class PostsAPITest extends BaseAPITest {
            private final Posts posts = new Posts();

            @Test(dataProvider ="dp",dataProviderClass = Data.APIData.class)
            public void postsTest(String url, Object id){
                posts.getPosts(url,id);
    }


}
