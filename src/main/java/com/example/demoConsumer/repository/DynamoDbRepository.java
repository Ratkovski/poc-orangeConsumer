package com.example.demoConsumer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.demoConsumer.domain.Viacep;
import com.example.demoConsumer.mapper.ViacepMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DynamoDbRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public void save(final Viacep viacep){
        final ViacepEntity viacepEntity = ViacepMapper.INSTANCE.mapFrom(viacep);
        dynamoDBMapper.save(viacepEntity);

    }
}

