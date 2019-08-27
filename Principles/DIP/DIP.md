# 依赖倒置原则（Dependence Inversion Principle，DIP）

依赖倒置原则的原始定义为：高层模块不应该依赖低层模块，两者都应该依赖其抽象；
抽象不应该依赖细节，细节应该依赖抽象（High level modules shouldnot depend upon 
low level modules.Both should depend upon abstractions.Abstractions should not
 depend upon details. Details should depend upon abstractions）。其核心思想是：
 **要面向接口编程，不要面向实现编程。**
 
 由于在软件设计中，细节具有多变性，而抽象层则相对稳定，因此以抽象为基础搭建起来的
 架构要比以细节为基础搭建起来的架构要稳定得多。这里的抽象指的是接口或者抽象类，而
 细节是指具体的实现类。
 
 使用接口或者抽象类的目的是制定好规范和契约，而不去涉及任何具体的操作，把展现细节的
 任务交给它们的实现类去完成。
 
 ## 依赖、倒置原则的作用
 
 依赖倒置原则的主要作用如下。
 
 + 依赖倒置原则可以降低类间的耦合性。
 + 依赖倒置原则可以提高系统的稳定性。
 + 依赖倒置原则可以减少并行开发引起的风险。
 + 依赖倒置原则可以提高代码的可读性和可维护性。

## 依赖倒置原则的实现方法

**依赖倒置原则的目的是通过要面向接口的编程来降低类间的耦合性，** 所以我们在实际编程中只要遵
循以下4点，就能在项目中满足这个规则。

1. 每个类尽量提供接口或抽象类，或者两者都具备。
2. 变量的声明类型尽量是接口或者是抽象类。
3. 任何类都不应该从具体类派生。
4. 使用继承时尽量遵循里氏替换原则。

## 依赖倒置原则在“顾客购物程序”中的应用。

定义“婺源网店”和“韶关网店”的共同接口 Shop，顾客类面向该接口编程。

类图如图 1 所示：

![图一](UML.gif)

代码如下：
```java
public class DIPtest
{
    public static void main(String[] args)
    {
        Customer wang=new Customer();
        System.out.println("顾客购买以下商品："); 
        wang.shopping(new ShaoguanShop()); 
        wang.shopping(new WuyuanShop());
    }
}
//商店
interface Shop
{
    public String sell(); //卖
}
//韶关网店
class ShaoguanShop implements Shop
{
    public String sell()
    {
        return "韶关土特产：香菇、木耳……"; 
    } 
}
//婺源网店
class WuyuanShop implements Shop
{
    public String sell()
    {
        return "婺源土特产：绿茶、酒糟鱼……"; 
    }
} 
//顾客
class Customer
{
	public void shopping(Shop shop)
	{
		//购物
		System.out.println("想买: "+shop.Sell());
	}
}
```
```java
/**  输出
*想买: 韶关土特产：香菇、木耳……
*想买: 婺源土特产：绿茶、酒糟鱼……
**/
```
