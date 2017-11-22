package com.wchb.dictionary.domain;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.wchb.dictionary.constants.WordClassEnum;

@JsonPropertyOrder(value = {"wordClass", "english", "example", "chinese"})
public class Meaning {

    @JSONField(ordinal = 1)
    private WordClassEnum wordClass;

    @JSONField(ordinal = 2)
    private String english;

    @JSONField(ordinal = 3)
    private String example;

    @JSONField(ordinal = 4)
    private String chinese;

    private Meaning() {
    }

    public static Meaning newMeaning() {
        return new Meaning();
    }

    public Meaning wordClass(WordClassEnum wordClass) throws IllegalStateException {
        this.wordClass = wordClass;
        return this;
    }

    public Meaning english(String english) throws IllegalStateException {
        this.english = english;
        return this;
    }

    public Meaning chinese(String chinese) throws IllegalStateException {
        this.chinese = chinese;
        return this;
    }

    public Meaning example(String example) throws IllegalStateException {
        this.example = example;
        return this;
    }

    @Override
    public String toString() {
        return "Meaning{" +
                "wordClass=" + wordClass +
                ", english='" + english + '\'' +
                ", chinese='" + chinese + '\'' +
                ", example='" + example + '\'' +
                '}';
    }

    public WordClassEnum getWordClass() {
        return wordClass;
    }

    public String getEnglish() {
        return english;
    }

    public String getChinese() {
        return chinese;
    }

    public String getExample() {
        return example;
    }
}
