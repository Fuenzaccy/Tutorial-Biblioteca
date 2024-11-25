package com.ccsw.tutorial.loan.model;

import com.ccsw.tutorial.cammon.pagination.PegeableRequest;


public class LoanSearchDto {
    private PegeableRequest pageable;

    public PegeableRequest getPageable() {
        return pageable;
    }

    public void setPageable(PegeableRequest pageable) {
        this.pageable = pageable;
    }

}
