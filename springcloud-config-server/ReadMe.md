[TOC]

### 💥数据仓库类型

#### 💥GIT

配置如下

```yaml
cloud:
  config:
    server:
      git:
        uri: https://github.com/lyzw/config_resp.git
        searchPaths: '{application}'
        username: lyz_w@163.com
        # 密码加密需要下载jce包：http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html
        # 下载后覆盖\jre\lib\security下面的jar包
        # curl localhost:{port}/encrypt -d mysecret
        password: '{cipher}8be10cabad633ed05dc345fb01eba8cd83fa55420ab09f20cabd7914aec1958b'
        force-pull: true
        clone-on-start: true
```

一般情况下，密码不能明文的存储在配置文件中，springcloud提供了一个encrypt接口来对密码进行加密。

问题：

​	1、The encrytion algorithm is not strong enough

​	问题过程：直接调用加密接口，会返回`The encrytion algorithm is not strong enough`的错误。

​	问题原因：未设置salt

​	解决方案：在**bootstrap.yaml**文档中设置encrypt.key，如下：

```yaml
encrypt:
  key: yoursalt  
```

​	注意：必须在**bootstrap.yaml**文件中

​	2、java.lang.IllegalArgumentException: Unable to initialize due to invalid secret key

​	问题过程：在设置encrypt.key，





#### 💥本地存储

### 💥安全策略

### 💥