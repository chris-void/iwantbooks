请按照如下步骤部署web应用：
1、进入iwantbooks/WEB-INF,修改applicationContext.xml文件中的数据库连接
   信息。
2、将iwantibooks/mysql.sql语句导入MySql数据库。
3、使用shell或dos窗口进入iwantbooks/WEB-INF路径,输入ant compile命令编译
   整个应用。
4、将应用复制到服务器的webapps路径中（不同服务器可能名称不同，
   本应用在tomcat下测试通过），启动服务器。
