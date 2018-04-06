import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.education.controller.controller.BeanConfigControllers;
import kz.sdu.blog.register.impl.BeanConfigRegisterImpl;

@BeanConfig
@BeanScanner
@Include({BeanConfigRegisterImpl.class, BeanConfigControllers.class})
public class BeanConfigAll {
}