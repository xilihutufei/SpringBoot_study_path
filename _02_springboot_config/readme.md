## 二. springboot 的配置

### 1. 配置文件

在springboot下，有两种类型的配置文件

> ① application.properties
>
> ② application.yml

配置文件的作用：修改 SpringBoot  自动配置的默认值

> 前面说了，使用 SpringBoot 时不需要任何配置就可以启动，但是如果我们发现自动配置的东西不好，我们就可以手动修改自动配置的默认值。

常见的配置文件类型比较 (以配置端口号为例)：

在以前spring阶段，大多数的配置文件都是 xml 类型的：

```xml
<server>
    <port>8081</port>
</server>
```

虽然，xml 文件的配置 看着结构清晰，但是，可以发现，大多数的配置数据都浪费在标签的开闭上

然后再看看现在的 properties 文件：

```properties
server.port=8081
```

这个看着就简洁多了

最后再看一种新的配置方式，yml

```yml
server:
  port: 8081
```

这个要注意的点：一级标签 server 靠最左边，二级标签前空两个空格，并且port:空格值

因此，yml 是 一个把空格玩到极致的一种配置文件，下面再细说一下yml的文件格式



