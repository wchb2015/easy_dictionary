package com.wchb.dictionary.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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

}
