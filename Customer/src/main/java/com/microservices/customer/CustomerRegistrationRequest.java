package com.microservices.customer;

public record CustomerRegistrationRequest(
        String first_name,
        String last_name,
        String Email

) {
}
