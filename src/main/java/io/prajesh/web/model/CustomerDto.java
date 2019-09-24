package io.prajesh.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerDto {

    private UUID id;
    private String name;
}
