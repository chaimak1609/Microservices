package com.microservices.fake;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class FakeCheckService {

    private  final  FakeCheckHistoryRepo fakeCheckHistoryRepo;

    public boolean isFakeCustomer  (Integer custId){
        fakeCheckHistoryRepo.save(
                FakeCheckHistory.builder()
                        .customerid(custId)
                        .IsFake(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;




    }



}
