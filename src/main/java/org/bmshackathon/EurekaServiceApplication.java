package org.bmshackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    @Bean
    public Sampler<?> defaultSampler() {
        return new AlwaysSampler();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
