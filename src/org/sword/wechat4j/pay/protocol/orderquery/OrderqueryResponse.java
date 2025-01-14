package org.sword.wechat4j.pay.protocol.orderquery;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

/**
 * 查询订单响应对象
 * <p><a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_2">开发文档</p>
 * <p/>
 * Created by xuwen on 2015-12-13.
 */
@XmlRootElement(name = "xml")
public class OrderqueryResponse {
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
    // 以下字段在return_code 和result_code都为SUCCESS的时候有返回
    /*设备号*/
    private String device_info;
    /*用户标识*/
    private String openid;
    /*是否关注公众账号*/
    private String is_subscribe;
    /*交易类型调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，MICROPAY*/
    private String trade_type;
    /*交易状态
     *  SUCCESS—支付成功
		REFUND—转入退款
		NOTPAY—未支付
		CLOSED—已关闭
		REVOKED—已撤销（刷卡支付）
		USERPAYING--用户支付中
		PAYERROR--支付失败(其他原因，如银行返回失败)*/
    private String trade_state;
    /*付款银行*/
    private String bank_type;
    /*标价金额*/
    private int total_fee;
    /*标价币种*/
    private String fee_type = "CNY";
    /*现金支付金额*/
    private int cash_fee;
    /*现金支付币种*/
    private String cash_fee_type = "CNY";
    /*代金券金额*/
    private int coupon_fee;
    /*代金券使用数量*/
    private int coupon_count;
    /*代金券类型
     * CASH--充值代金券 
	   NO_CASH---非充值代金券
                 订单使用代金券时有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0*/
    private String[] coupon_type_$n;
    private String[] coupon_batch_id_$n;
    /*代金券ID*/
    private String[] coupon_id_$n;
    /*单个代金券支付金额*/
    private Integer[] coupon_fee_$n;
    /*微信支付订单号*/
    private String transaction_id;
	/*商户订单号*/
    private String out_trade_no;
    /*附加数据*/
    private String attach;
    /*支付完成时间*/
    private String time_end;
    /*交易状态描述*/
    private String trade_state_desc;

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

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
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

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
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
    public String[] getCoupon_type_$n() {
 		return coupon_type_$n;
 	}

 	public void setCoupon_type_$n(String[] coupon_type_$n) {
 		this.coupon_type_$n = coupon_type_$n;
 	}
    public String[] getCoupon_batch_id_$n() {
        return coupon_batch_id_$n;
    }

    public void setCoupon_batch_id_$n(String[] coupon_batch_id_$n) {
        this.coupon_batch_id_$n = coupon_batch_id_$n;
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

    public String getTrade_state_desc() {
        return trade_state_desc;
    }

    public void setTrade_state_desc(String trade_state_desc) {
        this.trade_state_desc = trade_state_desc;
    }

    @Override
    public String toString() {
        return "OrderqueryResponse{" +
                "appid='" + appid + '\'' +
                ", mch_id='" + mch_id + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", sign='" + sign + '\'' +
                ", result_code='" + result_code + '\'' +
                ", err_code='" + err_code + '\'' +
                ", err_code_des='" + err_code_des + '\'' +
                ", device_info='" + device_info + '\'' +
                ", openid='" + openid + '\'' +
                ", is_subscribe='" + is_subscribe + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", trade_state='" + trade_state + '\'' +
                ", bank_type='" + bank_type + '\'' +
                ", total_fee='" + total_fee + '\'' +
                ", fee_type='" + fee_type + '\'' +
                ", cash_fee='" + cash_fee + '\'' +
                ", cash_fee_type='" + cash_fee_type + '\'' +
                ", coupon_fee='" + coupon_fee + '\'' +
                ", coupon_count='" + coupon_count + '\'' +
                ", coupon_batch_id_$n=" + Arrays.toString(coupon_batch_id_$n) +
                ", coupon_id_$n=" + Arrays.toString(coupon_id_$n) +
                ", coupon_fee_$n=" + Arrays.toString(coupon_fee_$n) +
                ", transaction_id='" + transaction_id + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", attach='" + attach + '\'' +
                ", time_end='" + time_end + '\'' +
                ", trade_state_desc='" + trade_state_desc + '\'' +
                '}';
    }
}
