/**
 * @author 15847
 * @title: note_11_14
 * @projectName cloudnote
 * @description: TODO
 * @date 2021/11/159:14
 */
public class note_11_14 {
    /**
     * 分布式架构需要考虑的问题：
     *
     * 服务粒度拆分
     * 服务集群地址维护
     * 远程地址调用
     * 服务健康状态感知
     *
     * 微服务结构:
     * 用户——》服务网关（通过请求路由，负载均衡）——》服务集群
     * 注册中心——》服务集群
     * 配置中心——》服务集群
     *
     * springcloud组件：
     * 服务注册发现：Eureka，nacos，consul
     * 服务远程调用：openfeign，dubbo
     * 服务链路监控：zipkin，sleuth
     * 统一配置管理：springcloudconfig，nacos
     * 统一网关路由：springcloundgateway，zuul
     *
     */
}
