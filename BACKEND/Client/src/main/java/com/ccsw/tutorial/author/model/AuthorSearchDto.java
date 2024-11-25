package com.ccsw.tutorial.author.model;

import com.ccsw.tutorial.cammon.pagination.PegeableRequest;

/**
 * @author ccsw
 */
public class AuthorSearchDto {

    private PegeableRequest pageable;

    public PegeableRequest getPageable() {
        return pageable;
    }

    public void setPageable(PegeableRequest pageable) {
        this.pageable = pageable;
    }
}