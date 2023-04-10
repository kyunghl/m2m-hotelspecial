package com.amazon.proserve.infrastructure.hotel.persistence.jpa;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.amazon.proserve.domain.hotel.HotelSpecial;

@Entity
@Table(name = "hotelspecial")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HotelSpecialJpaEntity {
        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        public static HotelSpecialJpaEntity fromDomainEntity(HotelSpecial domainEntity) {
                return HotelSpecialJpaEntity.builder()
                                .id(domainEntity.getId().getValue())
                                .build();
        }

        public HotelSpecial toDomainEntity() {
                return HotelSpecial.builder().build();
        }
}
