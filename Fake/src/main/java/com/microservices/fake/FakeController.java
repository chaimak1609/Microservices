package com.microservices.fake;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fake-check")
@AllArgsConstructor
@Slf4j
public class FakeController {

    private final FakeCheckService fakeCheckService;

    @GetMapping(path = "{customerId}")
    public FakeCheckResponse isFakeCustomer(
            @PathVariable("customerId") Integer customerId) {
        boolean isFakeCustomer = fakeCheckService.
                isFakeCustomer(customerId);
        log.info("fake check request for customer {}", customerId);

        return new FakeCheckResponse(isFakeCustomer);
    }
}