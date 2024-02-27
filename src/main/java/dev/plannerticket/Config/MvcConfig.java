package dev.plannerticket.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.NonNull;


//Configuración que dice a Spring dónde buscar las imágenes y cómo mapear las solicitudes.
@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    //@SuppressWarnings("null")
    @SuppressWarnings("null")
    @Override
    @NonNull
   
        public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/images/**").addResourceLocations("file:src/main/resources/static/images/");
                // .addResourceLocations("classpath:/static/images/");
    }
}



  
