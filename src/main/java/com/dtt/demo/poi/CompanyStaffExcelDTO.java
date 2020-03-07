package com.dtt.demo.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @Author: duant
 * @Date: 2020/3/3 17:42
 * @Description:
 */
@Data
public class CompanyStaffExcelDTO {

    private static final String GN_FSIAOHF = "社保、公积金、残保金";

    private static final String GN_INSURANCE = "商保信息";

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "身份证号码")
    private String idCard;

    @Excel(name = "手机号码")
    private String phone;

    @Excel(name = "银行卡号")
    private String bankCard;

    @Excel(name = "银行名称")
    private String bankName;

}
