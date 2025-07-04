package com.muhammetakduman.repository;

import com.muhammetakduman.entities.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {
}
