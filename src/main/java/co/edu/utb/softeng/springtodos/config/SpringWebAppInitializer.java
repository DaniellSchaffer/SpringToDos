package co.edu.utb.softeng.springtodos.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class SpringWebAppInitializer implements WebApplicationInitializer {
    
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        
        //Spring IoC Container
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(ApplicationContextConfig.class);
        
        //Spring servlet and container registration
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
                "SpringDispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");  // "/" tells container that only those requests that do not have pathinfo (urls without a .xxx at the end) will be handled by DispatcherServlet.
       
    }
    
    
}
