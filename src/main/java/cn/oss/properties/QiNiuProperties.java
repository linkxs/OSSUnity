package cn.oss.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 七牛云配置类
 *
 * @author 轻描淡写 linkxs@qq.com
 */
@ConfigurationProperties(prefix = "oss.qiniu")
public class QiNiuProperties {

    private String accessKey;

    private String secretKey;

    private String bucketName;

    private String domain;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
