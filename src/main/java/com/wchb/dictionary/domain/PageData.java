package com.wchb.dictionary.domain;


import java.util.Collection;
import java.util.Collections;

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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Collection<T> getList() {
        return list;
    }

    public void setList(Collection<T> list) {
        this.list = list;
    }
}
