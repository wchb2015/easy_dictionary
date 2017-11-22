package com.wchb.dictionary.constants;

public enum WordClassEnum {

    Noun("n", "名词", 1),
    Verb("v", "动词", 2),
    Adjective("adj", "形容词", 3),
    Adverb("adv", "副词", 4),
    Pronoun("pron", "代词", 5),
    Preposition("prep", "介词", 6),
    Conjunction("conj", "连词", 7),
    Determiner("deter", "限定词", 8),
    Exclamation("excl", "感叹词", 9);

    private String abbreviation;
    private String cnName;
    private Integer code;

    WordClassEnum(String abbreviation, String cnName, Integer code) {
        this.abbreviation = abbreviation;
        this.cnName = cnName;
        this.code = code;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
