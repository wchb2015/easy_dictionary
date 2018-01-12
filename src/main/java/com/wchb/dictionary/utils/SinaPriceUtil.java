package com.wchb.dictionary.utils;

import com.wchb.dictionary.domain.dto.FutureDailyPriceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * 0_var hq_str_P1705="棕榈1705  合约中文名字
 * 1_145957   未知
 * 2_6148     开盘价
 * 3_6288     最高价
 * 4_6142     最低价
 * 5_6190     昨天收盘价
 * 6_6252     买一价格
 * 7_6254     卖一价格
 * 8_6254     最新价(今天收盘价)
 * 9_6212     结算价
 * 10_6148    昨天的结算价
 * 11_44      买量
 * 12_56       卖量
 * 13_515722   持仓量
 * 14_812598   成交量
 * 15_连
 * 16_棕榈
 * 17_2017-01-11 日期
 * 18_1
 * 19_6318.000
 * 20_6062.000
 * 21_6328.000
 * 22_6062.000
 * 23_6550.000
 * 24_6004.000
 * 25_6550.000
 * 26_5736.000
 * 27_360.776";
 */

public class SinaPriceUtil {

    private static final Logger LOG = LoggerFactory.getLogger(SinaPriceUtil.class);

    private static String baseUrl = "http://hq.sinajs.cn/list=";

    public static FutureDailyPriceDTO getDailyPrice(String contractName) {
        FutureDailyPriceDTO result = new FutureDailyPriceDTO();
        String priceStr = null;
        try {
            priceStr = HttpUtil.getResponseBody(baseUrl + contractName);
        } catch (Exception e) {
            LOG.error("SinaInterfaceProcess:getDailyPrice ERROR ", e);
        }

        if (Objects.nonNull(priceStr)) {
            String[] priceArr = priceStr.split(",");
            /* for (int i = 0; i < priceArr.length; i++) {
                System.out.println(i + "_" + priceArr[i]);
             }*/
            result.setContractName(contractName);
            result.setDate(DateUtil.parseDateStr(priceArr[17]));

//            result.setDate(new Timestamp(System.currentTimeMillis()));
            result.setOpeningPrice(Double.valueOf(priceArr[2]));
            result.setClosingPrice(Double.valueOf(priceArr[8]));

            result.setTheHighestPrice(Double.valueOf(priceArr[3]));
            result.setTheLowestPrice(Double.valueOf(priceArr[4]));
            result.setAveragePrice(Double.valueOf(priceArr[9]));

            result.setOpenInterest(Long.parseLong(priceArr[13]));
            result.setVolume(Long.parseLong(priceArr[14]));


            result.setContractCode("P");
        }

        return result;
    }
}

