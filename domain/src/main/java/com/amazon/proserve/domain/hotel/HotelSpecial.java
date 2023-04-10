package com.amazon.proserve.domain.hotel;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.amazon.proserve.domain.hotel.vo.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class HotelSpecial {
    @NotNull
    private Id id;

    private LocalDate expiryDate;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HotelSpecial) {
            HotelSpecial entity = (HotelSpecial) obj;
            if (id.equals(entity.getId()))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
