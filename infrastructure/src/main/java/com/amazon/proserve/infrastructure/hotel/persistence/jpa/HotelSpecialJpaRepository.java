package com.amazon.proserve.infrastructure.hotel.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelSpecialJpaRepository extends JpaRepository<HotelSpecialJpaEntity, Long> {
}
