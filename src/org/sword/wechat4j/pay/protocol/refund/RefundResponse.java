package org.sword.wechat4j.pay.protocol.refund;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 申请退款响应对象
 * <p>参考<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_4">开发文档</p>
 * <p/>
 * Created by xuwen on 2015-12-10.
 */
@XmlRootElement(name = "xml")
public class RefundResponse {
	/*业务结果*/
    private String result_code;
    /*错误代码*/
    private String err_code;
    /*错误代码描述*/
    private String err_code_des;
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
    /*微信订单号*/
    private String transaction_id;
    /*商户订单号*/
    private String out_trade_no;
    /*商户退款单号*/
    private String out_refund_no;
    /*微信退款单号*/
    private String refund_id;
    /*退款渠道
     *  ORIGINAL—原路退款
		BALANCE—退回到余额*/
    private String refund_channel;
    /*退款金额*/
    private int refund_fee;
    /*标价金额*/
    private int total_fee;
    /*标价币种*/
    private String fee_type = "CNY";
    /*现金支付金额*/
    private int cash_fee;
    /*现金退款金额*/
    private int cash_refund_fee;
    /*代金券退款总金额*/
    private int coupon_refund_fee;
    /*退款代金券使用数量*/
    private int coupon_refund_count;
    /*退款代金券ID*/
    private int coupon_refund_id;

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

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public String getRefund_channel() {
        return refund_channel;
    }

    public void setRefund_channel(String refund_channel) {
        this.refund_channel = refund_channel;
    }

    public int getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(int refund_fee) {
        this.refund_fee = refund_fee;
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

    public int getCash_refund_fee() {
        return cash_refund_fee;
    }

    public void setCash_refund_fee(int cash_refund_fee) {
        this.cash_refund_fee = cash_refund_fee;
    }

    public int getCoupon_refund_fee() {
        return coupon_refund_fee;
    }

    public void setCoupon_refund_fee(int coupon_refund_fee) {
        this.coupon_refund_fee = coupon_refund_fee;
    }

    public int getCoupon_refund_count() {
        return coupon_refund_count;
    }

    public void setCoupon_refund_count(int coupon_refund_count) {
        this.coupon_refund_count = coupon_refund_count;
    }

    public int getCoupon_refund_id() {
        return coupon_refund_id;
    }

    public void setCoupon_refund_id(int coupon_refund_id) {
        this.coupon_refund_id = coupon_refund_id;
    }

    @Override
    public String toString() {
        return "RefundResponse{" +
                "result_code='" + result_code + '\'' +
                ", err_code='" + err_code + '\'' +
                ", err_code_des='" + err_code_des + '\'' +
                ", appid='" + appid + '\'' +
                ", mch_id='" + mch_id + '\'' +
                ", device_info='" + device_info + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", sign='" + sign + '\'' +
                ", transaction_id='" + transaction_id + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", out_refund_no='" + out_refund_no + '\'' +
                ", refund_id='" + refund_id + '\'' +
                ", refund_channel='" + refund_channel + '\'' +
                ", refund_fee=" + refund_fee +
                ", total_fee=" + total_fee +
                ", fee_type='" + fee_type + '\'' +
                ", cash_fee=" + cash_fee +
                ", cash_refund_fee=" + cash_refund_fee +
                ", coupon_refund_fee=" + coupon_refund_fee +
                ", coupon_refund_count=" + coupon_refund_count +
                ", coupon_refund_id=" + coupon_refund_id +
                '}';
    }
}
