package tech.wendele.estudo.sqspock.service;

import org.springframework.stereotype.Service;
import tech.wendele.estudo.sqspock.integrations.sqs.dto.SpockMessage;
import tech.wendele.estudo.sqspock.integrations.sqs.producer.SqsProducer;

@Service
public class SqspockService {

    private final SqsProducer sqsProducer;

    public SqspockService(SqsProducer sqsProducer) {
        this.sqsProducer = sqsProducer;
    }

    public void sendMessage(SpockMessage spockMessage) {
        sqsProducer.send(spockMessage);
    }

}
