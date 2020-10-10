package codeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class atmconfig {
    @Bean
    public DataSource dataSource(){
        return new DataSourceFile("customers.txt");
    }
    public Bank bank(){
        return  new Bank("My Bank", dataSource());

    }

    @Bean ATM atm(){
        return new ATM(bank());
    }
}
