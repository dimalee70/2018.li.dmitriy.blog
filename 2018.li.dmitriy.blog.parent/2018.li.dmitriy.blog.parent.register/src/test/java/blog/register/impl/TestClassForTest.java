package blog.register.impl;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestClassForTest {

    public static Map<String,String> dbLogin
            = new HashMap<>();

    static {
        dbLogin.put("seyit","111");
    }

    private String getPassword(String login){
        return "111";
//    throw new RuntimeException("exception");
    }

    public Logger logger=Logger.getLogger(getClass());

    @Test
    public void asd2(){
        System.out.println(getClass());
    }

    @Test
    public void asd(){
        //delete all
        //initialize
        //invoke the method
        //assertion
        dbLogin.clear();
        logger.info("clear db");
        dbLogin.put("seyit","123");
        logger.info("add new login");
        String response = getPassword("seyit");
        String response2 = getPassword("seyit2");
        logger.info("get password");

        Assert.assertEquals(response,"123");
    }

}
