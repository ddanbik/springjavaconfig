package pl.sda;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pl.sda")
public class ApplicationConfiguration {

    @Bean(name = "cat2")
    public String getText() {
        return "Ala ma kota";
    }
}
