# spring_20200328
spring boot project management
## 传统单体应用架构的问题
    1、应用复杂度增加、更新、维护困难
    2、易造成系统资源浪费
    3、影响开发效率
    4、应用可靠性低
    5、不利于技术的更新
## 如何解决传统应用架构的问题
    通过 SOA (Service-Oriented Architechture，面向服务架构)。
    SOA 的思路将应用中相近的功能聚合到一起，以服务的形式提供出去，因此基于 SOA 架构的应用可以理解为一批服务的组合
## 微服务架构
### 微服务架构概念
    它倡导我们在传统软件应用的基础上，将系统业务按照功能拆分为更加细粒度的服务，所拆分的每一个服务都是一个独立的应用，这些应用对
    外提供公共的API，可独立承担对外服务的职责，通过这种思想方式所开发的软件服务实体就是 “微服务” ，而围绕微服务架构思想构建的一
    系列体系结构（包括开发、测试、部署等），我们可以将它称为 “微服务架构” 。
    
   > 注意
   ***
    微服务和微服务架构是两个不同概念。微服务强调的是服务的大小，它关注的是某一个点，而微服务架构是一种架构思想，需要从整体上对软
    件系统进行全面考虑。
   ---
### 微服务架构的优点
    1、复杂度可控
    2、可独立部署
    3、技术型灵活
    4、易于容错
    5、易于扩展
    6、功能特点
### 微服务架构的不足
    1、开发人员必须处理创建分布式系统的复杂性
    2、部署的复杂性
    3、增加内存消耗
### Spring Boot 的优点
    1、可快速构建独立的 Spring 应用程序
    2、内嵌 Servlet 容器，无需独立安装容器即可运行项目
    3、对主流开发框架的无配置集成
    4、提供开箱即用的 Spring 插件，简化了 Maven 的配置
    5、自动配置 Spring，极大地提高了开发、部署效率
    6、无需任何 XML 配置
### 本项目配置
 
 ```
 Spring Boot 2.2.5.RELEASE
 Maven 3.6.1
 IDEA 2019.3.2

    > Maven 配置
    详细信息看 pom.xml 文件
```
 
## 该项目使用 Spring Boot，集成了 Mybatis、Reids、ActiveMQ等组件
### Redis集成
    1、Redis集成添加依赖，在引导类 Application.java 中，添加 @EnableCaching 注解开启缓存
    在业务逻辑类方法添加 @Cacheable 注解来支持缓存
        @Cacheable(value = "XXX1", key = "'XXX2'") 
        具体使用在项目 com.example.mySpringBootProject.service.impl.UserServiceImpl.java 文件中
    在业务逻辑类方法添加 @CacheEvict(value = "XXX1", key="'XXX2'") 清除缓存
    
    2、使实体类实现可以系列化接口，为了便于数据传输，public class XXX implements Serializable
    
    3、端口 地址配置在 application.properties 文件中
### ActiveMQ集成
    1、添加依赖
    2、创建消息队列对象 具体看 项目启动器（MySpringBootProjectApplication.java）文件中 
    3、创建消息生产者 QueueController
    4、创建消息监听者 CustomerController