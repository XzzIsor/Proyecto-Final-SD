package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapper {
    
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    } 
}
