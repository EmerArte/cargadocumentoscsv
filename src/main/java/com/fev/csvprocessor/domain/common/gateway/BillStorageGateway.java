package com.fev.csvprocessor.domain.common.gateway;

import com.fev.csvprocessor.domain.common.exception.DefaultCustomException;
import com.fev.csvprocessor.domain.common.model.BillModel;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BillStorageGateway {
    void saveAll(List<BillModel> billModels) throws DefaultCustomException;
    Page<BillModel> findAll(PageableQuery pageableQuery);
}
