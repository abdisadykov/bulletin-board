package com.abdisadykovdias.bulletinboard.service;

import com.abdisadykovdias.bulletinboard.dto.AdvertisementDTO;
import com.abdisadykovdias.bulletinboard.mapper.AdvertisementMapper;
import com.abdisadykovdias.bulletinboard.model.Advertisement;
import com.abdisadykovdias.bulletinboard.model.Bid;
import com.abdisadykovdias.bulletinboard.model.User;
import com.abdisadykovdias.bulletinboard.repository.AdvertisementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;
    private final AdvertisementMapper advertisementMapper;

    public List<AdvertisementDTO> getAllAdvertisements() {
        return advertisementMapper.toDTOs(advertisementRepository.findAll());
    }

    public void placeAdvertisement(AdvertisementDTO advertisementDTO) {

        Advertisement advertisement = Advertisement.builder()
                .adId(advertisementDTO.getId())
                .title(advertisementDTO.getTitle())
                .description(advertisementDTO.getDescription())
                .minimumPrice(advertisementDTO.getMinimumPrice())
                .currentPrice(advertisementDTO.getCurrentPrice())
                .isActive(true)
                .imagePath(advertisementDTO.getImagePath())
                .build();
        advertisementRepository.save(advertisement);
    }
}
