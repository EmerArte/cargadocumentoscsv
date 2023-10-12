package com.fev.csvprocessor.infrastructure.dbo.h2.repository;

import com.fev.csvprocessor.infrastructure.dbo.h2.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillEntity, Long> {
}
