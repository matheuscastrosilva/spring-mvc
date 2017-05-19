package br.com.castro.matheus.loja;


import br.com.castro.matheus.loja.conf.AppContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(AppContext.class, args);
    }

}
