package com.fev.csvprocessor.domain.usecase;

import com.fev.csvprocessor.domain.common.gateway.BillStorageGateway;
import com.fev.csvprocessor.domain.common.gateway.PageableQuery;
import com.fev.csvprocessor.domain.common.model.BillModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

@RequiredArgsConstructor
public class ListSavedBillsUseCase {
    private final BillStorageGateway billStorageGateway;

    public Page<BillModel> findAll(PageableQuery pageableQuery){
        return billStorageGateway.findAll(pageableQuery);
    }

}
