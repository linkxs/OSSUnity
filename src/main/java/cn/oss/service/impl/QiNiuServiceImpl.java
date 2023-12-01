package cn.oss.service.impl;

import cn.oss.properties.QiNiuProperties;
import cn.oss.service.OSSUnity;
import com.qiniu.common.QiniuException;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;

/**
 * 七牛云服务实现
 *
 * @author 轻描淡写 linkxs@qq.com
 */
public class QiNiuServiceImpl implements OSSUnity {

    @Resource
    private QiNiuProperties properties;

    private static UploadManager uploadManager;

    private static String upToken;

    @PostConstruct
    private void init() {
        Auth auth = Auth.create(properties.getAccessKey(), properties.getSecretKey());
        upToken = auth.uploadToken(properties.getBucketName());
        Configuration cfg = new Configuration();
        uploadManager = new UploadManager(cfg);
    }

    @Override
    public String upload(String path, File file) {
        try {
            uploadManager.put(file, path, upToken);
            return properties.getDomain() + "/" + path;
        } catch (QiniuException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String upload(String path, InputStream inputStream) {
        try {
            uploadManager.put(inputStream,path,upToken,null,null);
            return properties.getDomain() + "/" + path;
        } catch (QiniuException e) {
            e.printStackTrace();
        }
        return null;
    }
}
