package blog.register.beans.postgres;

import blog.register.dao.postgres.DaoBeanConfig;
import blog.register.impl.BeanScannerForImpl;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;
import kz.sdu.blog.controller.BeanConfigForPackageController;

@BeanConfig
@BeanScanner
@Include({DaoBeanConfig.class, BeanScannerForImpl.class, BeanConfigForPackageController.class})
public class AllBeanConfig {
}
