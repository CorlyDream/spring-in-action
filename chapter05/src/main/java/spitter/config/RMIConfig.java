package spitter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import spitter.data.SpitterRepository;

@Configuration
public class RMIConfig {

    @Bean
    public RmiServiceExporter rmiExporter(SpitterRepository spitterRepository) {
        RmiServiceExporter rmiExporter = new RmiServiceExporter();
        rmiExporter.setService(spitterRepository);
        rmiExporter.setServiceName("SpitterRepository");
        rmiExporter.setServiceInterface(SpitterRepository.class);
        return rmiExporter;
    }
}
