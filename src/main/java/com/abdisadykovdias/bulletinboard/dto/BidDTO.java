package com.abdisadykovdias.bulletinboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BidDTO {
    private Long id;
    private BigDecimal price;
    private UserDTO userDto;
    private BidDTO bidDTO;
}
