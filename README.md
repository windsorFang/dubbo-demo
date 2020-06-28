author:windsor
date:2020/06

#DUBBO

## 1.暴露服务
     将服务提供者注册到注册中心(zookepper)

## 2.订阅服务
     服务消费者去订阅provider的服务地址

#zookeeper

## 1.provider
     提供者启动时，以接口为维度，将自己的IP放到zk上，IP的节点key值是暴露的当前接口信息（interface,method...）

## 1.consumer
     消费者启动时，以接口为维度，将自己的IP放到zk上，IP的节点key值是订阅的当前接口信息（interface,method...）,
     并订阅provider节点下IP地址。