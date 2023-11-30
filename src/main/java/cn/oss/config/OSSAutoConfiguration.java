package cn.oss.config;

import cn.oss.enums.OSSEnum;
import cn.oss.properties.AliyunProperties;
import cn.oss.properties.CommonProperties;
import cn.oss.properties.QiNiuProperties;
import cn.oss.properties.TencentProperties;
import cn.oss.service.OssStrategyService;
import cn.oss.service.impl.AliyunServiceImpl;
import cn.oss.service.impl.QiNiuServiceImpl;
import cn.oss.service.impl.TencentServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * OSS自动配置类
 *
 * @author 轻描淡写 linkxs@qq.com
 */
@Configuration
@EnableConfigurationProperties({AliyunProperties.class, TencentProperties.class, QiNiuProperties.class, CommonProperties.class})
public class OSSAutoConfiguration {
    @Resource
    private CommonProperties properties;

    @Bean
    public OssStrategyService builderOSS() {
        OSSEnum type = OSSEnum.getValue(properties.getType());
        switch (type) {
            case ALIYUN:
                return new AliyunServiceImpl();
            case TENCENT:
                return new TencentServiceImpl();
            case QINIU:
                return new QiNiuServiceImpl();
            default:
                return null;
        }
    }


}
