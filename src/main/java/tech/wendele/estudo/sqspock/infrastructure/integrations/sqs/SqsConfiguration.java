package tech.wendele.estudo.sqspock.infrastructure.integrations.sqs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;

import java.net.URI;


@Configuration
public class SqsConfiguration {

    private static final String URL_LOCALSTACK = "http://localhost:4566/";

    /*
     * define here config for aws
     * profiles
     * urls local or in cloud
     */
    @Bean
    public SqsAsyncClient sqsAsyncClient() {
        return SqsAsyncClient.builder()
            .region(Region.US_EAST_1)
            .endpointOverride(URI.create(URL_LOCALSTACK))
            .build();
    }

}
