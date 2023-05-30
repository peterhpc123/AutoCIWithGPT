## TASK 1:
和CI服务器（ip:http://65.1.204.60:8080/ ） 建立连接. <br />
普通用户:( User:123456) 具有访问权限
## Task 2:
1. 建立webhook
2. 在jenkins ci上配置webhook插件, 设置访问token
3.  在aws上构建一个maven私服
## Task 3:
建立jfrog maven 私服（目前ip公开可访问：http://3.108.158.201:8082/ ）
## Task 4:
搭建mysql数据库，增加简单的登录逻辑( http://3.108.27.127:8080/login/{username}/{password} )

## 流程介绍：
目前该自动构建项目已初步完成，实现功能：
1. 本地开发完，git push 到github上
2. webhook根据push的记录发送http call 到ci服务器上
3. ci已配置maven jdk webhhok插件，利用webhook插件实现构建项目，
4. 构建主要包括：clean install, deploy
5. deploy根据pom里配置的jfrog地址以及setting.xml里的授权apikey，借助maven打包上传到jfrog 服务器上

## 后续：
1. 开发jfog 服务，实现拉取maven中央仓库项目？（p1）
2. 完成setting自动配置工具开发（p3）
3. ci build 完之后利用ssh登录到远程服务器,并运行（ip地址：http://3.108.27.127:8080/sabrinanpeter ）
4. 把gpt集成到里面，做二次开发