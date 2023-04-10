package com.amazon.proserve.domain.hotel.vo;

import lombok.Value;

import javax.validation.constraints.NotNull;

@Value(staticConstructor = "of")
public class Id {
    @NotNull
    Integer value;
}
