package tech.wendele.estudo.sqspock.integrations.sqs.producer;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import tech.wendele.estudo.sqspock.integrations.sqs.dto.SpockMessage;

@Component
public class SqsProducer {

    private final SqsTemplate sqsTemplate;

    @Value("${sqs.location}")
    private String SQSLocation;

    @Value("${sqs.queue.localq}")
    private String QUEUE;

    public SqsProducer(SqsTemplate template) {
        this.sqsTemplate = template;
    }

    public void send(SpockMessage message) {
        String SQSUrl = SQSLocation + QUEUE;
        sqsTemplate.send(SQSUrl, message);
    }
}
