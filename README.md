# OSSUnity

#### 介绍
🍺一款基于SpringBoot集成的OSS对象存储整合，包含了阿里云OSS、腾讯云、七牛云对象存储。使文件上传变得简单、快速、开箱即用~


#### 安装教程

添加依赖
```
<dependency>
  <groupId>com.gitee.linkxs</groupId>
  <artifactId>oss-spring-boot-starter</artifactId>
  <version>1.0.1</version>
</dependency>
```
#### 使用说明

1. 配置参数 👉（按需配置即可）

```
oss:
  type: qiniu  #对象存储厂商 阿里云/aliyun 腾讯云/tencent 七牛云/qiniu 必填 
  aliyun:
    accessKeyId:         #阿里云accessKeyId
    accessKeySecret:     #阿里云accessKeySecret
    endpoint:            #对象存储区域地址
    domain:              #oss域名
    bucketName:          #oss对象桶
  tencent:     
    appid:               #腾讯云appid
    secretId:            #腾讯云secretId
    secretKey:
    bucketName:
    region:              #对象存储区域地址
    domain:              #oss域名
  qiniu:                
    accessKey:           #七牛云accessKey
    secretKey:
    bucketName:
    domain:              #oss域名
```

2.  代码示例

```
    /**
     * 注入对象存储调用
     */
    @Autowired
    private OSSUnity ossUnity;
```

3.接口实例
```
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
```




