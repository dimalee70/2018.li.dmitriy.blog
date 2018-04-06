package blog.register.config;


import kz.greetgo.conf.hot.DefaultStrValue;

public interface DbConfig {
    @DefaultStrValue("jdbc:postgresql://localhost:5432/blog")
    String url();
    @DefaultStrValue("blog")
    String username();
    @DefaultStrValue("blog")
    String password();
}
