package com.wchb.dictionary.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@ToString
public class PageData<T> {

    private Long count;

    private Collection<T> list;

    public static final PageData<?> EMPTY = new PageData<>(0, Collections.emptyList());

    public PageData() {
    }

    public PageData(long count, Collection<T> list) {
        this.count = count;
        this.list = list;
    }

}
