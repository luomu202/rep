C:\Windows\System32\drivers\etc
hsots文件
127.0.0.1 eureka01
127.0.0.1 eureka02

添加@LoadBalanced注解后，restTemplate会走LoadBalancerInterceptor拦截器，此拦截器中会通过
RibbonLoadBalancerClient查询服务地址，可以在此类打断点观察每次调用的服务地址和端口，两个cms服务会轮
流被调用