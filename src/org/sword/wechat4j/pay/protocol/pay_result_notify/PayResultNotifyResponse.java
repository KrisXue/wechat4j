package org.sword.wechat4j.pay.protocol.pay_result_notify;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

/**
 * 支付结果
 * <p>参考<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_7">开发文档</p>
 * <p/>
 * Created by xuwen on 2015-12-11.
 */
@XmlRootElement(name = "xml")
public class PayResultNotifyResponse {
	/*公众账号ID*/
    private String appid;
    /*商户号*/
    private String mch_id;
    /*设备号*/
    private String device_info;
    /*随机字符串*/
    private String nonce_str;
    /*签名*/
    private String sign;
    /*业务结果*/
    private String result_code;
    /*错误代码*/
    private String err_code;
    /*错误代码*/
    private String err_code_des;
    /*用户标识*/
    private String openid;
    /*是否关注公众账号*/
    private String is_subscribe;
    /*交易类型*/
    private String trade_type;
    /*付款银行*/
    private String bank_type;
    /*订单金额*/
    private int total_fee;
    /*货币种类*/
    private String fee_type;
    /*现金支付金额*/
    private int cash_fee;
    /*货币种类*/
    private String cash_fee_type;
    /*总代金券金额*/
    private int coupon_fee;
    /*代金券使用数量*/
    private int coupon_count;
    /*代金券ID*/
    private String[] coupon_id_$n;
    /*单个代金券支付金额*/
    private Integer[] coupon_fee_$n;
    /*微信支付订单号*/
    private String transaction_id;
    /*商户订单号*/
    private String out_trade_no;
    /*商家数据包*/
    private String attach;
    /*支付完成时间*/
    private String time_end;

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

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public int getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(int cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    public int getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(int coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    public int getCoupon_count() {
        return coupon_count;
    }

    public void setCoupon_count(int coupon_count) {
        this.coupon_count = coupon_count;
    }

    public String[] getCoupon_id_$n() {
        return coupon_id_$n;
    }

    public void setCoupon_id_$n(String[] coupon_id_$n) {
        this.coupon_id_$n = coupon_id_$n;
    }

    public Integer[] getCoupon_fee_$n() {
        return coupon_fee_$n;
    }

    public void setCoupon_fee_$n(Integer[] coupon_fee_$n) {
        this.coupon_fee_$n = coupon_fee_$n;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    @Override
    public String toString() {
        return "PayResultNotifyResponse{" +
                "appid='" + appid + '\'' +
                ", mch_id='" + mch_id + '\'' +
                ", device_info='" + device_info + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", sign='" + sign + '\'' +
                ", result_code='" + result_code + '\'' +
                ", err_code='" + err_code + '\'' +
                ", err_code_des='" + err_code_des + '\'' +
                ", openid='" + openid + '\'' +
                ", is_subscribe='" + is_subscribe + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", bank_type='" + bank_type + '\'' +
                ", total_fee=" + total_fee +
                ", fee_type='" + fee_type + '\'' +
                ", cash_fee=" + cash_fee +
                ", cash_fee_type='" + cash_fee_type + '\'' +
                ", coupon_fee=" + coupon_fee +
                ", coupon_count=" + coupon_count +
                ", coupon_id_$n=" + Arrays.toString(coupon_id_$n) +
                ", coupon_fee_$n=" + Arrays.toString(coupon_fee_$n) +
                ", transaction_id='" + transaction_id + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", attach='" + attach + '\'' +
                ", time_end='" + time_end + '\'' +
                '}';
    }
}
