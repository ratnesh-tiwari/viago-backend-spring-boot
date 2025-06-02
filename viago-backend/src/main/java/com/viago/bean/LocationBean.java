package com.viago.bean;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class LocationBean {

    @Length(max = 255, message = "{maxLength}")
    private String address;

    @NotNull
    @DecimalMin(value = "-90.0", message = "{latitude.minLimit}")
    @DecimalMax(value="90.0",message = "{latitude.maxLimit}")
    private double latitude;

    @NotNull
    @DecimalMin(value= "-180.0",message="{longitude.minLimit}")
    @DecimalMax(value="180.0",message = "{longitude.maxLimit}")
    private double longitude;
}
