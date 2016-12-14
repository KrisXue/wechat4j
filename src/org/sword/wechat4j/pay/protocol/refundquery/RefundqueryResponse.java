package org.sword.wechat4j.pay.protocol.refundquery;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

/**
 * 查询退款响应对象
 * <p>参考<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_5">开发文档</p>
 * <p/>
 * Created by xuwen on 2015-12-10.
 */
@XmlRootElement(name = "xml")
public class RefundqueryResponse {
	/*业务结果*/
    private String result_code;
    /*错误码*/
    private String err_code;
    /*错误描述*/
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
    /*订单金额*/
    private int total_fee;
    /*货币种类*/
    private String fee_type = "CNY";
    /*现金支付金额*/
    private int cash_fee;
    /*退款笔数*/
    private int refund_count;
    /*商户退款单号*/
    private String[] out_refund_no_$n;
    /*微信退款单号*/
    private String[] refund_id_$n;
    /*退款渠道*/
    private String[] refund_channel_$n;
    /*申请退款金额*/
    private Integer[] refund_fee_$n;
    /*总代金券退款金额*/
    private Integer[] coupon_refund_fee_$n;
    /*退款代金券使用数量*/
    private Integer[] coupon_refund_count_$n;
    /**/
    private String[][] coupon_refund_batch_id_$n_$m;
    /*退款代金券ID*/
    private String[][] coupon_refund_id_$n_$m;
    /*单个代金券退款金额*/
    private Integer[][] coupon_refund_fee_$n_$m;
    /*退款状态*/
    private String[] refund_status_$n;
    /*退款入账账户*/
    private String[] refund_recv_accout_$n;
    

    public String[] getRefund_recv_accout_$n() {
		return refund_recv_accout_$n;
	}

	public void setRefund_recv_accout_$n(String[] refund_recv_accout_$n) {
		this.refund_recv_accout_$n = refund_recv_accout_$n;
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

    public int getRefund_count() {
        return refund_count;
    }

    public void setRefund_count(int refund_count) {
        this.refund_count = refund_count;
    }

    public String[] getOut_refund_no_$n() {
        return out_refund_no_$n;
    }

    public void setOut_refund_no_$n(String[] out_refund_no_$n) {
        this.out_refund_no_$n = out_refund_no_$n;
    }

    public String[] getRefund_id_$n() {
        return refund_id_$n;
    }

    public void setRefund_id_$n(String[] refund_id_$n) {
        this.refund_id_$n = refund_id_$n;
    }

    public String[] getRefund_channel_$n() {
        return refund_channel_$n;
    }

    public void setRefund_channel_$n(String[] refund_channel_$n) {
        this.refund_channel_$n = refund_channel_$n;
    }

    public Integer[] getRefund_fee_$n() {
        return refund_fee_$n;
    }

    public void setRefund_fee_$n(Integer[] refund_fee_$n) {
        this.refund_fee_$n = refund_fee_$n;
    }

    public Integer[] getCoupon_refund_fee_$n() {
        return coupon_refund_fee_$n;
    }

    public void setCoupon_refund_fee_$n(Integer[] coupon_refund_fee_$n) {
        this.coupon_refund_fee_$n = coupon_refund_fee_$n;
    }

    public Integer[] getCoupon_refund_count_$n() {
        return coupon_refund_count_$n;
    }

    public void setCoupon_refund_count_$n(Integer[] coupon_refund_count_$n) {
        this.coupon_refund_count_$n = coupon_refund_count_$n;
    }

    public String[][] getCoupon_refund_batch_id_$n_$m() {
        return coupon_refund_batch_id_$n_$m;
    }

    public void setCoupon_refund_batch_id_$n_$m(String[][] coupon_refund_batch_id_$n_$m) {
        this.coupon_refund_batch_id_$n_$m = coupon_refund_batch_id_$n_$m;
    }

    public String[][] getCoupon_refund_id_$n_$m() {
        return coupon_refund_id_$n_$m;
    }

    public void setCoupon_refund_id_$n_$m(String[][] coupon_refund_id_$n_$m) {
        this.coupon_refund_id_$n_$m = coupon_refund_id_$n_$m;
    }

    public Integer[][] getCoupon_refund_fee_$n_$m() {
        return coupon_refund_fee_$n_$m;
    }

    public void setCoupon_refund_fee_$n_$m(Integer[][] coupon_refund_fee_$n_$m) {
        this.coupon_refund_fee_$n_$m = coupon_refund_fee_$n_$m;
    }

    public String[] getRefund_status_$n() {
        return refund_status_$n;
    }

    public void setRefund_status_$n(String[] refund_status_$n) {
        this.refund_status_$n = refund_status_$n;
    }

    @Override
    public String toString() {
        return "RefundqueryResponse{" +
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
                ", total_fee=" + total_fee +
                ", fee_type='" + fee_type + '\'' +
                ", cash_fee=" + cash_fee +
                ", refund_count=" + refund_count +
                ", out_refund_no_$n=" + Arrays.toString(out_refund_no_$n) +
                ", refund_id_$n=" + Arrays.toString(refund_id_$n) +
                ", refund_channel_$n=" + Arrays.toString(refund_channel_$n) +
                ", refund_fee_$n=" + Arrays.toString(refund_fee_$n) +
                ", coupon_refund_fee_$n=" + Arrays.toString(coupon_refund_fee_$n) +
                ", coupon_refund_count_$n=" + Arrays.toString(coupon_refund_count_$n) +
                ", coupon_refund_batch_id_$n_$m=" + Arrays.toString(coupon_refund_batch_id_$n_$m) +
                ", coupon_refund_id_$n_$m=" + Arrays.toString(coupon_refund_id_$n_$m) +
                ", coupon_refund_fee_$n_$m=" + Arrays.toString(coupon_refund_fee_$n_$m) +
                ", refund_status_$n=" + Arrays.toString(refund_status_$n) +
                '}';
    }
}
