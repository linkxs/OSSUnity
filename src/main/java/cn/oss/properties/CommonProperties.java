package cn.oss.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 通用配置信息
 *
 * @author 轻描淡写 linkxs@qq.com
 */
@ConfigurationProperties(prefix = "oss")
public class CommonProperties {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
