public class UserService{
    public void do1(){ System.out.println("do 1");}
    public void do2(){System.out.println("do 2");}
    public void do3(){ System.out.println("do 3");}
    public void do4(){System.out.println("do 4");}
    public void do5(){System.out.println("do 5");}
    // 核心业务方法
    public void service(){
        JoinPoint1
        do1();PointCut1
        JoinPoint2
        do2();PointCut2
        JoinPoint3
        do3();PointCut3
        JoinPoint4
        do5();PointCut4
    }
}

1.面向切面编程术语
连接点:位置  JoinPoint 可以织入切面的方法前后，异常抛出后,只描述位置,(不可见)

切点:方法    PointCut  被织入的方法,核心流程代码

通知:增强代码 Advice    1)非业务逻辑代码,且可以描述此段增强代码的位置(例如:前置通知)
                      比如:若增强代码(通知)放在连接点1的位置,或者说放在了切点1方法的前面
                        我们称此段增强代码为前置通知
                      2)通知代码以方法的形式存在,因为方法中可以写代码

切面:切点+通知

织入:把通知应用到目标对象上

目标对象:将要被增强的类

代理对象:增强之后的类

切点表达式:
    1-用于"匹配切点方法"的表达式,既然切点表达式用于匹配方法,其格式也应当与普通方法的格式类似
    2-普通方法:
        public void setName(String name) throws MyException{}
    3-切点表达式:[]可选
        execution([访问控制权限修饰符] 返回值类型 [全限定类名]方法名(形式参数列表) [异常])


pom.xml
    spring仓库
    spring-context
    spring-aop
    spring-aspect
    junit

spring-config.xml
    引入context & aop 命名空间
    包扫描
    <context:component-scan base-package=""/>
    自动代理
    <aop:aspectj-autoproxy proxy-target-class=""/>
    proxy-target-class
    true :CGLIB动态代理
    false : 依据情况而定


目标对象
    纳入spring管理
    切点方法:业务代码

切面
    纳入spring管理
    @Aspect

    增强代码
    通知


Mybatis
spring
springMVC
