package steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration("classpath:spring.xml")

public class CucumberSpringConfiguration {
}