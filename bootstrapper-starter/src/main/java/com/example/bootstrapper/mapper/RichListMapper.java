
package com.example.bootstrapper.mapper;

import com.example.bootstrapper.dto.RichListDTO;
import cloud.solvo.worker.models.catalog.RichList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RichListMapper {
    RichListDTO toDTO(RichList richList);
    RichList toEntity(RichListDTO richListDTO);
}
