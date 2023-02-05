package com.abdisadykovdias.bulletinboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertisementDTO {
    private Long id;
    private String title;
    private String description;
    private BigDecimal minimumPrice;
    private BigDecimal currentPrice;
    private boolean isActive;
    private LocalDateTime creationDate;
    private String imagePath;

    private List<BidDTO> bidDtoList;
    private UserDTO userDto;
}
