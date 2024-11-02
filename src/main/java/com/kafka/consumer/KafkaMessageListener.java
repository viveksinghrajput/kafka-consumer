package com.kafka.consumer;


import com.kafka.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;


@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka-demo", groupId = "kafka-consumer"
            , topicPartitions = {@TopicPartition(topic = "kafka-demo", partitions = {"3"})})
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

    @KafkaListener(topics = "kafka-demo", groupId = "kafka-consumer",
            topicPartitions = {@TopicPartition(topic = "kafka-demo", partitions = {"3"})})
    public void consume(String message) {
        log.info("consumer2 consume the message " + message);
    }

   /* @KafkaListener(topics = "kafka-demo",groupId = "kafka-consumer")
    public void consume2(String message){
        logger.info("consumer2 consume the message "+message);
    }
    @KafkaListener(topics = "kafka-demo",groupId = "kafka-consumer")
    public void consume3(String message){
        logger.info("consumer3 consume the message "+message);
    }
    @KafkaListener(topics = "kafka-demo",groupId = "kafka-consumer")
    public void consume4(String message){
        logger.info("consumer4 consume the message "+message);
    }
    @KafkaListener(topics = "kafka-demo",groupId = "kafka-consumer")
    public void consume5(String message){
        logger.info("consumer5 consume the message "+message);
    }
    @KafkaListener(topics = "kafka-demo",groupId = "kafka-consumer")
    public void consume6(String message){
        logger.info("consumer6 consume the message "+message);
    }*/

}
