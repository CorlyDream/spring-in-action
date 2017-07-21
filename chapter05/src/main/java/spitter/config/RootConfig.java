package spitter.config;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Created by mengshuang on 2017/7/10.
 */
@Configuration
@ComponentScan(basePackages = {"spitter.service"})
public class RootConfig {
    private PatternLayout patternLayout;

    public RootConfig() {
        patternLayout = new PatternLayout();
        patternLayout.setConversionPattern("%d %-5p [%c{1}] %m %n");
    }

    @Bean
    public ConsoleAppender consoleAppender(){
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.INFO);
        consoleAppender.setLayout(patternLayout);
        return consoleAppender;
    }
}
