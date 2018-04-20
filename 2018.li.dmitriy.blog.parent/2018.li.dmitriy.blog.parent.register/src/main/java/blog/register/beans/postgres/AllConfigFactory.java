package blog.register.beans.postgres;

import blog.register.config.DbConfig;
import blog.register.utils.App;
import kz.greetgo.conf.hot.HotConfigFactory;
import kz.greetgo.depinject.core.Bean;

@Bean
public class AllConfigFactory extends HotConfigFactory {
    @Bean
    public DbConfig createDbConfig(){
        return createDbConfig(DbConfig.class);
    }
    @Override
    protected String getBaseDir(){
        return App.appDir()+"/conf";
    }
}
