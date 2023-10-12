package com.fev.csvprocessor.infrastructure.dbo.h2.mapper;

import com.fev.csvprocessor.domain.common.model.BillModel;
import com.fev.csvprocessor.infrastructure.dbo.h2.entity.BillEntity;
import com.fev.csvprocessor.infrastructure.common.mapper.base.IMapper;

public class BillEntityMapper implements IMapper<BillEntity, BillModel> {
    private static BillEntityMapper instance;

    private BillEntityMapper() {
    }

    public static synchronized BillEntityMapper getInstance() {
        if(instance == null){
            instance = new BillEntityMapper();
        }
        return instance;
    }

    @Override
    public BillEntity map(BillModel billModel) {
        if(billModel == null){
            return null;
        }
        return new BillEntity(billModel.getBillCode(), billModel.getName(), billModel.getLastName(),
                billModel.getAmount(), billModel.getPaymentExpirationDate(), billModel.getPaymentDueDate(), billModel.getStatus());
    }

    @Override
    public BillModel reverseMap(BillEntity billEntity) {
        if(billEntity == null){
            return null;
        }
        return new BillModel(billEntity.getBillCode(), billEntity.getName(), billEntity.getLastName(),
                billEntity.getAmount(), billEntity.getPaymentExpirationDate(), billEntity.getPaymentDueDate(), billEntity.getStatus());
    }
}