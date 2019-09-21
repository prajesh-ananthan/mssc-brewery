package io.prajesh.web.model;

import io.prajesh.web.enums.BeerStyleEnum;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

  private UUID id;
  private Integer version;
  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;
  private BeerStyleEnum beerStyle;
  private Long upc;
  private BigDecimal price;
  private Integer quantityOnHand;


}
