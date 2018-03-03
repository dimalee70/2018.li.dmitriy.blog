package kz.sdu.blog.register_impl;

import kz.greetgo.depinject.core.Bean;
import kz.sdu.blog.register.TestRegister;

@Bean
public class TestRegisterImpl implements TestRegister {
    @Override
    public String getText() {
        return "Everything is ok";
    }
}
