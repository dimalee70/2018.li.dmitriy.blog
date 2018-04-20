package blog.register.test.util;

import blog.register.beans.postgres.BeanConfigAll;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({BeanConfigAll.class})
public class BeanContainerForTest {
}
