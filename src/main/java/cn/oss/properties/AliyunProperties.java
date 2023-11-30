package cn.oss.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 阿里云配置类
 *
 * @author 轻描淡写 linkxs@qq.com
 */
@ConfigurationProperties(prefix = "oss.aliyun")
public class AliyunProperties {
    private String accessKeyId;

    private String accessKeySecret;

    private String endpoint;

    private String bucketName;

    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
