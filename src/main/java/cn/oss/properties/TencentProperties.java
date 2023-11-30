package cn.oss.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 阿里云配置类
 *
 * @author 轻描淡写 linkxs@qq.com
 */
@ConfigurationProperties(prefix = "oss.tencent")
public class TencentProperties {

    private String appid;

    private String secretId;

    private String secretKey;

    private String bucketName;

    private String region;

    private String domain;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
