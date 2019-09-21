package io.prajesh.web.services;

import io.prajesh.web.model.CustomerDto;
import java.util.UUID;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

public interface CustomerService {

  CustomerDto getCustomerById(UUID customerId);
}
