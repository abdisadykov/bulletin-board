package com.abdisadykovdias.bulletinboard.controller;

import com.abdisadykovdias.bulletinboard.dto.AdvertisementDTO;
import com.abdisadykovdias.bulletinboard.model.Advertisement;
import com.abdisadykovdias.bulletinboard.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ad")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AdvertisementDTO> getAllAdvertisements() {
        return service.getAllAdvertisements();
    }

    public void placeAdvertisement(@RequestBody AdvertisementDTO advertisementDTO) {
        service.placeAdvertisement(advertisementDTO);
    }


}
