package io.prajesh.web.services;

import io.prajesh.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Prajesh Ananthan
 * Created on 16/9/2019.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return new CustomerDto(); // TODO: Fix builder
  }
}
