# 第一个SSM项目：简单的增删改查实现

### 1. 介绍

本项目是博文 [https://cxhit.blog.csdn.net/article/details/93914895](https://cxhit.blog.csdn.net/article/details/93914895) 中的源码。

相比较于原文，主要做了如下修改：

0. 新增数据库脚本（database目录下）
1. 调整数据库列名（PaperMapper.xml中）
2. 修改了几处BUG（JSP页面中）


### 2. 环境

开发环境：

1. idea 2018
2. 数据库：MySQL 8.0
3. Tomcat 8.5.31

推荐环境：

1. idea 2018+
2. MySQL 5.6/5.7/8.0
3. Tomcat 8.0+

### 3. 注意事项

1. 数据库：

根据 jdbc.properties 文件中的提示，选择合适的数据库驱动 driver。

```properties
# MySQL 5.X
jdbc.driver=com.mysql.jdbc.Driver
# MySQL 8.X
jdbc.driver=com.mysql.cj.jdbc.Driver
```

数据库为 **推荐环境** 中的低版本MySQL，一般不需要修改POM文件。

如果MySQL版本更低，建议参考 [https://mvnrepository.com/artifact/mysql/mysql-connector-java](https://mvnrepository.com/artifact/mysql/mysql-connector-java) 进行修改。

### 4. LICENSE

MIT