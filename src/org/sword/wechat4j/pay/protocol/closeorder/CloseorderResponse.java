package org.sword.wechat4j.pay.protocol.closeorder;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 关闭订单响应对象
 * <p><a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_3">开发文档</p>
 * <p/>
 * Created by xuwen on 2015-12-13.
 */
@XmlRootElement(name = "xml")
public class CloseorderResponse {
	/*以下字段在return_code为SUCCESS的时候有返回*/
	/*公众账号ID*/
    private String appid;
    /*商户号*/
    private String mch_id;
    /*随机字符串*/
    private String nonce_str;
    /*签名*/
    private String sign;
    /*业务结果*/
    private String result_code;
    /*错误代码*/
    private String err_code;
    /*错误代码描述*/
    private String err_code_des;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    @Override
    public String toString() {
        return "CloseorderResponse{" +
                "appid='" + appid + '\'' +
                ", mch_id='" + mch_id + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", sign='" + sign + '\'' +
                ", result_code='" + result_code + '\'' +
                ", err_code='" + err_code + '\'' +
                ", err_code_des='" + err_code_des + '\'' +
                '}';
    }
}
