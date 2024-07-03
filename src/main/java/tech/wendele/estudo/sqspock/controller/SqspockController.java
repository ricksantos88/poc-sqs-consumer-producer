package tech.wendele.estudo.sqspock.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wendele.estudo.sqspock.integrations.sqs.dto.SpockMessage;
import tech.wendele.estudo.sqspock.service.SqspockService;

@RestController
@RequestMapping("/send-message")
public class SqspockController {

    private final SqspockService sqspockService;

    public SqspockController(SqspockService sqspockService) {
        this.sqspockService = sqspockService;
    }

    @PostMapping
    public void sendSqsMessage(@RequestBody SpockMessage spockMessage) {
        sqspockService.sendMessage(spockMessage);
    }
}
