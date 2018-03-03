package kz.sdu.blog.beans;

import kz.greetgo.depinject.core.Bean;
import kz.sdu.blog.utils.WebAppContextRegistration;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.*;
import java.io.IOException;
import java.util.EnumSet;

@Bean
public class UtfFilterRegistration implements WebAppContextRegistration, Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("welcome first");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void registerTo(WebAppContext webAppContext) {
        webAppContext.addFilter(new FilterHolder(this), "/*", EnumSet.of(DispatcherType.INCLUDE,
                DispatcherType.REQUEST));
        printRegistration();
    }

    @Override
    public double priority() {
        return 0;
    }

    @Override
    public void printRegistration() {
        System.out.println("utf filter");
    }
}
