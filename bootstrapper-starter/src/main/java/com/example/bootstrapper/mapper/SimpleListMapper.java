
package com.example.bootstrapper.mapper;

import com.example.bootstrapper.dto.SimpleListDTO;
import cloud.solvo.worker.models.list.SimpleList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleListMapper {
    SimpleListDTO toDTO(SimpleList simpleList);
    SimpleList toEntity(SimpleListDTO simpleListDTO);
}
