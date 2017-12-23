package br.eti.tiagosousa.config.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.sun.faces.config.FacesInitializer;

import br.eti.tiagosousa.config.SpringCoreConfig;

public class MainWebAppInitializer extends FacesInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.register(SpringCoreConfig.class);
        sc.addListener(new ContextLoaderListener(root));
    }
}