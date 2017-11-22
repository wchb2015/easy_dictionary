package com.wchb.dictionary.domain;

public class QueryConditions {

    private Long userId;

    public QueryConditions userId(Long userId) throws IllegalStateException {
        this.userId = userId;
        return this;
    }

    private QueryConditions() {
    }

    public static QueryConditions newQueryConditions() {
        return new QueryConditions();
    }

    public Long getUserId() {
        return userId;
    }
}
