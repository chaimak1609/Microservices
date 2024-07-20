package com.microservices.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "fake",
        url = "${clients.fake.url}"
)
public interface FakeClient {

    @GetMapping(path = "api/v1/fake-check/{customerId}")
    FakeCheckResponse isFake(
            @PathVariable("customerId") Integer customerId);

}
