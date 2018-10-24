package com.wangyuxuan;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.wangyuxuan")
public class FooProperties {

    private String foo;

}
