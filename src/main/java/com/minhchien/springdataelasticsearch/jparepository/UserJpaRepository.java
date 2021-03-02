package com.minhchien.springdataelasticsearch.jparepository;

import com.minhchien.springdataelasticsearch.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<Users, Long> {
}