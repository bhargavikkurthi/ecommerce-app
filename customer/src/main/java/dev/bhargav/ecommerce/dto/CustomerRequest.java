package dev.bhargav.ecommerce.dto;

import dev.bhargav.ecommerce.entity.Address;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


public record CustomerRequest(
        String id,

        @NotNull(message = "Customer firstname is required")
                String firstname,

        @NotNull(message = "Customer lastname is required")
                String lastname,

        @NotNull(message = "Customer Email is required")
        @Email(message = "Customer Email is not a valid email address")
                String email,

        @Valid
        @NotNull(message = "Address is required")
        Address address
) {
}
