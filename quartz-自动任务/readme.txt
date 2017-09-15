testQuartz为quartz的demo，里边：
CronTriggerTest类利用的是CronTrigger触发器进行触发；
SimpleTrigger类利用的是SimpleTrigger触发器进行触发，两种触发器的触发规则不同，使用环境也不同。
======================================



QuartzClusterTest为quartz集群的demo，里边：


实例运行依赖Oracle数据库，根据quartz框架包docs/dbTables/目录下的sql脚本文件，创建表结构，修改工程中的Spr
ing数据源配置。
Start.java启动程序。


注意关注：quartz.properties类的配置和MethodInvokingJobDetailFactoryBean类的重写。
原因：Quartz集群只支持JDBCJobStore存储方式，而MethodInvokingJobDetailFactoryBean不能序列化存储job数据到数据库.


参考资料：
http://note.youdao.com/noteshare?id=c67e6c493492ebed58204b6db79901c8&sub=C5D3B8E5B2FF4167BD7B2A1386088C63
http://note.youdao.com/noteshare?id=e9fdd2564923c9d6d2d43e9fece5316c&sub=E04A89B58E6B41A2846667EE7121BEEA

