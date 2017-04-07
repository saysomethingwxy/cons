package com.yonyou.cons.Enum;

public enum CodeEnum {
  SUCCESS_CODE("0000"), NULLUSER_CODE("1001"), FAIL_CODE("9999");

  String code;

  CodeEnum(String code) {
    this.code = code;
  }

  public final String getCode() {
    return code;
  }

  public final void setCode(String code) {
    this.code = code;
  }


}
