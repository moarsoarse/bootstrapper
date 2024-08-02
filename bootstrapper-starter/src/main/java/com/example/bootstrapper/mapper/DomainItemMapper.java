
package com.example.bootstrapper.mapper;

import com.example.bootstrapper.dto.DomainItemDTO;
import cloud.solvo.worker.models.domain.DomainItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomainItemMapper {
    DomainItemDTO toDTO(DomainItem domainItem);
    DomainItem toEntity(DomainItemDTO domainItemDTO);
}
