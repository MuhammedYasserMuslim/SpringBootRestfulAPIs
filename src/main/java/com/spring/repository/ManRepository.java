package com.spring.repository;

import com.spring.model.Man;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ManRepository extends JpaRepository<Man,Long> {


}
