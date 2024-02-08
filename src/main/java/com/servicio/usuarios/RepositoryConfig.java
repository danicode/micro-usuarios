package com.servicio.usuarios;

import com.servicio.commons.usuarios.models.entity.Role;
import com.servicio.commons.usuarios.models.entity.Usuario;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@EntityScan({"com.servicio.commons.usuarios.models.entity"})
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Usuario.class, Role.class);
    }
}
