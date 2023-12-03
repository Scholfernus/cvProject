package com.example.cvproject.zdjavapol141web.requestbody.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@Component
@Data
public class SupplierDto {
    @NotBlank(message = "User have to create name & lastname")
    private String name;
    private String city;
}
