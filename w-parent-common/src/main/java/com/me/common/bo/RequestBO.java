package com.me.common.bo;

import java.io.Serializable;

/**
 * @program: w_parent->RequestBO
 * @description:
 * @author: szh
 * @create: 2020-07-30 14:54
 **/
import java.io.Serializable;
public class RequestBO implements Serializable {
    private static final long serialVersionUID = -4684548416072484200L;
    transient String token;
    transient String tokenInfo;
    transient String accessToken;
    transient String refreshToken;
    transient String accessKey;
    transient String accessSecret;
    transient String session;
    transient String requestId;
    transient String traceId;
    transient String xid;
    private String uid;
    private String clientId;
    private String channel;

    public RequestBO() {
    }

    public String getToken() {
        return this.token;
    }

    public String getTokenInfo() {
        return this.tokenInfo;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAccessSecret() {
        return this.accessSecret;
    }

    public String getSession() {
        return this.session;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getXid() {
        return this.xid;
    }

    public String getUid() {
        return this.uid;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    public void setTokenInfo(final String tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    public void setRefreshToken(final String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    public void setAccessSecret(final String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public void setSession(final String session) {
        this.session = session;
    }

    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }

    public void setTraceId(final String traceId) {
        this.traceId = traceId;
    }

    public void setXid(final String xid) {
        this.xid = xid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setChannel(final String channel) {
        this.channel = channel;
    }
}
