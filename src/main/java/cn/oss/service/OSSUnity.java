package cn.oss.service;

import java.io.File;
import java.io.InputStream;

/**
 * 对象存储接口服务
 *
 * @author 轻描淡写 linkxs@qq.com
 */
public interface OSSUnity {


    /**
     * 文件上传
     * @param path OSS文件路径
     * @param file 文件
     * @return 文件URL地址
     */
    String upload(String path, File file);

    /**
     * 文件上传
     * @param path OSS文件路径
     * @param inputStream 字节流
     * @return 文件URL地址
     */
    String upload(String path, InputStream inputStream);
}
