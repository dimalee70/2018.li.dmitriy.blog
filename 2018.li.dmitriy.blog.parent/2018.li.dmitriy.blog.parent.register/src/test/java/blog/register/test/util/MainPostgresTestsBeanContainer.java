package blog.register.test.util;

import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;


@Include(BeanContainerForTest.class)
public interface MainPostgresTestsBeanContainer extends BeanContainer{}
