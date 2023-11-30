package cn.oss.enums;

import com.aliyun.oss.OSS;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.stream.Stream;

public enum OSSEnum {
    ALIYUN("aliyun"),

    TENCENT("tencent"),

    QINIU("qiniu");

    private String type;

    OSSEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static OSSEnum getValue(String type) {
        if (null == type) {
            throw new IllegalArgumentException("application.yml oss.type is null. Allowed values for oss.type are 'aliyun' or 'tencent' or 'qiniu'.");
        }
        Optional<OSSEnum> first = Stream.of(OSSEnum.values()).filter(os -> type.equals(os.type)).findFirst();
        if (!first.isPresent()) {
            throw new IllegalArgumentException("application.yml oss.type is null. Allowed values for oss.type are 'aliyun' or 'tencent' or 'qiniu'.");
        }
        return first.get();
    }
}
