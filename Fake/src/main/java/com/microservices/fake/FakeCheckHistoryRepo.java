package com.microservices.fake;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FakeCheckHistoryRepo extends JpaRepository<FakeCheckHistory,Integer> {
}
