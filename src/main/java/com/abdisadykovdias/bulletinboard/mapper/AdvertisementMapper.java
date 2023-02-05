package com.abdisadykovdias.bulletinboard.mapper;

import com.abdisadykovdias.bulletinboard.dto.AdvertisementDTO;
import com.abdisadykovdias.bulletinboard.model.Advertisement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AdvertisementMapper {
    AdvertisementDTO toDTO(Advertisement source);
    List<AdvertisementDTO> toDTOs(Iterable<Advertisement> source);
}
