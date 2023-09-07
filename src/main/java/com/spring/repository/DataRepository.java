package com.spring.repository;

import com.spring.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DataRepository extends JpaRepository<Data,Long> {
}
