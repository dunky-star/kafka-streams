package com.dunky.ws.products.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.Map;

@Configuration
public class KafkaConfig {

    @Bean
    NewTopic createTopic() {
        return TopicBuilder.name("product-created-events-topic")
                .partitions(3) // --> Increases scalability and it means 3 microservices can consume from this topic
                .replicas(2) // --> Should be number of Kafka brokers in the cluster
                // Minimum in-sync replicas brokers configuration
                .configs(Map.of("min.insync.replicas", "1")) // --> Since there are two Kafka brokers
                .build();
    }

}
