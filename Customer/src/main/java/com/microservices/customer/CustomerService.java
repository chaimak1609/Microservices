package com.microservices.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService{
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer cust = Customer.builder().first_name(request.first_name())
                .last_name(request.last_name())
                .Email(request.Email()).build();
        customerRepository.saveAndFlush(cust);
        FakeCheckResponse fakeCheckResponse =restTemplate.getForObject("http://FAKE/api/v1/fake-check/{customerId}",
                FakeCheckResponse.class,
                cust.getId()

        );
        if (fakeCheckResponse.IsFake()) {
            throw new IllegalStateException("fake");
        }

    }
}
