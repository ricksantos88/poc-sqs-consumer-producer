package tech.wendele.estudo.sqspock.integrations.sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;
import tech.wendele.estudo.sqspock.integrations.sqs.dto.SpockMessage;

@Component
public class SpockConsumer {

    @SqsListener("${sqs.queue.localq}")
    public void listen(SpockMessage message) {
        System.out.println("message received: " + message.content());
    }
}
