package blog.register.impl;





import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class TestClassForTest {
    public static Map<String,String> dbLogin = new HashMap<>();
    static {
        dbLogin.put("dima","111");
    }
    private String getPassword(String login){
        return dbLogin.get(login).toString();
        //throw new RuntimeException("exception");
    }
    public Logger logger = Logger.getLogger("new_logger");

    @Test
    public void asd2(){
        System.out.println(getClass());
    }
    @Test
    public void  asd(){
        dbLogin.clear();
        logger.info("clena db");
        dbLogin.put("dima","111");
        logger.info("add new login");
        String responce = getPassword("dima");
        logger.info("get password");
        Assert.assertEquals(responce,"123");
    }
}
