package com.wchb.dictionary.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"contractName,currentPrice,openingPrice,averagePrice,theHighestPrice,theLowestPrice"})
@Data
public class FutureDailyPriceDTO {

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contractName;

    private Timestamp date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long openingPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long closingPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long theHighestPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long theLowestPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long averagePrice;

    private Long ocSpread;
    private Long hlSpread;
    private Long openInterest;
    private Long volume;
    private Date createdAt;
    private Date updatedAt;

    private String contractCode;

    public Long getOcSpread() {
        if (openingPrice > closingPrice) {
            ocSpread = openingPrice - closingPrice;
        } else {
            ocSpread = closingPrice - openingPrice;
        }
        return ocSpread;
    }

    public Long getHlSpread() {
        return theHighestPrice - theLowestPrice;
    }

}