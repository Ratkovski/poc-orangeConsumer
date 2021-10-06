package com.example.demoConsumer.mapper;


import com.example.demoConsumer.domain.Viacep;
import com.example.demoConsumer.repository.ViacepEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ViacepMapper {

    ViacepMapper INSTANCE = Mappers.getMapper(ViacepMapper.class);

    @Mapping(target = "id",ignore = true)
    ViacepEntity mapFrom(final Viacep viacep);




}
