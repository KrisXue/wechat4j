package org.sword.wechat4j.pay.protocol.closeorder;

import org.sword.wechat4j.common.Config;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 关闭订单请求对象
 * <p>参考<a href="https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_3">开发文档</p>
 * <p/>
 * Created by xuwen on 2015-12-13.
 */
@XmlRootElement(name = "xml")
public class CloseorderRequest {
	/*公众账号ID*/
    private String appid = Config.instance().getAppid();
    /*商户号*/
    private String mch_id = Config.instance().getMchId();
    /*商户订单号*/
    private String out_trade_no;
    /*随机字符串*/
    private String nonce_str;
    /*签名*/
    private String sign;

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

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
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

    @Override
    public String toString() {
        return "CloseorderRequest{" +
                "appid='" + appid + '\'' +
                ", mch_id='" + mch_id + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
