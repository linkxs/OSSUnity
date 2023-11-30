package cn.oss.service.impl;

import cn.oss.properties.TencentProperties;
import cn.oss.service.OssStrategyService;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.region.Region;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;

/**
 * 腾讯云OSS
 *
 * @author 轻描淡写 linkxs@qq.com
 */
public class TencentServiceImpl implements OssStrategyService {
    @Resource
    private TencentProperties properties;

    private static COSClient client;

    @PostConstruct
    private void init() {
        BasicCOSCredentials cred = new BasicCOSCredentials(properties.getAppid(), properties.getSecretId(), properties.getSecretKey());
        Region region = new Region(properties.getRegion());
        ClientConfig clientConfig = new ClientConfig(region);
        client = new COSClient(cred, clientConfig);
    }

    @Override
    public String upload(String path, File file) {
        client.putObject(properties.getBucketName(), path, file);
        return properties.getDomain() + "/" + path;
    }

    @Override
    public String upload(String path, InputStream inputStream) {
        client.putObject(properties.getBucketName(), path, inputStream, null);
        return properties.getDomain() + "/" + path;
    }
}
