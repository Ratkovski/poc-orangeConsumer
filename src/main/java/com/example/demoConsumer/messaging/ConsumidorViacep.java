package com.example.demoConsumer.messaging;

import com.example.demoConsumer.domain.Viacep;
import com.example.demoConsumer.repository.DynamoDbRepository;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log
@Component
@RequiredArgsConstructor
public class ConsumidorViacep {

    private final DynamoDbRepository dynamoDbRepository;


  @SqsListener(value = "fila_viacep", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
     void publicar(final Viacep viacep) {
      dynamoDbRepository.save(viacep);
      log.info(String.format("Dados publicados",viacep));

    }
}
