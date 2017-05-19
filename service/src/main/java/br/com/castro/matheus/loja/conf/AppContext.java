package br.com.castro.matheus.loja.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by matheus on 19/05/17.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"br.com.castro.matheus.loja"})
public class AppContext {
}
