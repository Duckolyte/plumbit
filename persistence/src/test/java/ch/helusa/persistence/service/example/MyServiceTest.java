package ch.helusa.persistence.service.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest("service.message=Hello")
@EnableJpaRepositories("ch.helusa.persistence.*")
@EntityScan("ch.helusa.persistence.*")
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @BeforeEach
    public void init() {
    }

    @Test
    public void contextLoads() {
        assertThat(myService.message(1L)).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}