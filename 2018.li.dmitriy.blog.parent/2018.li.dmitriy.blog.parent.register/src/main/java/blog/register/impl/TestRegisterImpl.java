package blog.register.impl;

import blog.register.dao.postgres.TestDao;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.blog.register.TestRegister;

@Bean
public class TestRegisterImpl implements TestRegister {

    public BeanGetter<TestDao> testDao;

    @Override
    public String getText() {
        return testDao.get().getAuthText();
    }
}
