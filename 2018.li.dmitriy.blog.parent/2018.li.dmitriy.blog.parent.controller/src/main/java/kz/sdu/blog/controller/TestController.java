package kz.sdu.blog.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.blog.register.TestRegister;
import kz.sdu.blog.utils.Controller;

@Bean
public class TestController implements Controller {
    public BeanGetter<TestRegister> testRegisterBeanGetter;
    @ToJson
    @Mapping("/getMainText")
    public String getText(){
        return "Everything is ok";
    }
}
