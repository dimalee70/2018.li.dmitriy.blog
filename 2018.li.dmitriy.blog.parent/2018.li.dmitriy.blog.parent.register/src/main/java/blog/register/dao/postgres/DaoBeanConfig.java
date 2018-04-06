package blog.register.dao.postgres;


import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import blog.register.beans.postgres.DaoImplFactory;

@BeanConfig(defaultFactoryClass = DaoImplFactory.class)
@BeanScanner
public class DaoBeanConfig {
}
