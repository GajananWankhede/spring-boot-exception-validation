package com.med.validation.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    private String name;


    @NotNull(message = "email shouldn't be null")
    @Email(message = "invalid email address")
    private String email;

    @NotNull(message = "mobile shouldn't be null")
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;

    @NotNull(message = "age shouldn't be null")
    private String gender;

    @NotNull(message = "age shouldn't be null")
    @Min(18)
    @Max(60)
    private int age;


    @NotBlank
    private String nationality;

}
