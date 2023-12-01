package cn.oss.oss;

import cn.oss.config.OSSAutoConfiguration;
import cn.oss.enums.OSSEnum;
import cn.oss.service.OSSUnity;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Ignore
@SpringBootConfiguration
@SpringBootTest(classes = OSSAutoConfiguration.class)
public class OSSUnityTest {

    @Autowired
    private OSSUnity ossUnity;

    @Test
    public void fileTest() {
        File file = new File("C:\\Users\\GW00315267\\Desktop\\20231118_143735.jpg");
        String path = ossUnity.upload("test/1234.jpg", file);
        System.out.println(path);
    }

    @Test
    public void inputStreamTest(){
        String path = ossUnity.upload("test/1234.jpg", convertFileToInputStream("C:\\Users\\GW00315267\\Desktop\\20231118_143735.jpg"));
        System.out.println(path);
    }

    public static InputStream convertFileToInputStream(String filePath) {
        try {
            // 创建文件输入流
            File file = new File(filePath);
            InputStream inputStream = new FileInputStream(file);
            return inputStream;
        } catch (IOException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        OSSEnum s = OSSEnum.getValue(null);
        System.out.println(s.getType());
    }
}
