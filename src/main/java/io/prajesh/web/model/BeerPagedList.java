package io.prajesh.web.model;

import java.util.List;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * Created by Prajesh on 21/9/2019.
 */
public class BeerPagedList extends PageImpl<BeerDto> {

  public BeerPagedList(List<BeerDto> content,
      Pageable pageable,
      long total) {
    super(content, pageable, total);
  }

  public BeerPagedList(List<BeerDto> content) {
    super(content);
  }
}
