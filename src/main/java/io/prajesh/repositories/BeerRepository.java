package io.prajesh.repositories;

import io.prajesh.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Prajesh Ananthan
 * Created on 26/9/2019.
 */

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
