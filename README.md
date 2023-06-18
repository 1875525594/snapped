## 基于 SpringBoot+Mybatis+Redis+RabbitMQ 秒杀系统
## 项目启动说明
1、启动前，请配置 application.properties 中相关redis、mysql、rabbitmq（需要提前创建好队列，队列名称：seckill.queue）地址。
建议使用docker desktop
2、登录地址：http://localhost:8888/page/login
3、商品秒杀列表地址：http://localhost:8888/goods/list
## 其它说明
1、数据库共有一千个用户左右（手机号：从18077200000~18077200998 密码为：123456），为压测准备的。（使用 cn.hfbin.seckill.util.UserUtil.java该类生成的，生成token做压测也是在此类里面）
2、此项目共有两个分支，master分支只是完成了秒杀的所有业务逻辑功能，并没有优化。V2.0分支做了优化如下：
    1)、页面缓存、商品详情静态化、订单静态化
    2)、加入消息队列RabbitMQ，对秒杀接口进行优化。
    3)、隐藏秒杀接口地址
    4)、接口限流防刷
    5)、解决超卖问题

