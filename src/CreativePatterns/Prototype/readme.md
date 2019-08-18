# 原型模式

在有些系统中，存在大量相同或相似对象的创建问题，如果用传统的构造函数来创建对象，会比较复杂且耗时耗资源，
用原型模式生成对象就很高效，就像孙悟空拔下猴毛轻轻一吹就变出很多孙悟空一样简单。

## 原型模式的定义与特点

原型（Prototype）模式的定义如下：**用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。**
在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。
例如，Windows 操作系统的安装通常较耗时，如果复制就快了很多。

## 原型模式的结构与实现

由于 Java 提供了对象的 clone() 方法，所以用 Java 实现原型模式很简单。

**1. 模式的结构**

原型模式包含以下主要角色。

1. 抽象原型类：规定了具体原型对象必须实现的接口。
2. 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
3. 访问类：使用具体原型类中的 clone() 方法来复制新的对象。

其结构图如图 1 所示。

![Structure](structure.gif)

**2. 模式的实现**

原型模式的克隆分为浅克隆和深克隆，Java 中的 Object 类提供了浅克隆的 clone() 方法，
具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，这里的 Cloneable 接口就是抽象原型类。
其代码如下：

```java
//继承自抽象原型类 Cloneable
//具体原型类
class Realizetype implements Cloneable
  {
  	private String name;
  	
      Realizetype(String name)//构造函数
      {
      	this.name = name;
          System.out.println("具体原型创建成功！");
      }
      public Object clone() throws CloneNotSupportedException
      {
          System.out.println("具体原型复制成功！");
          return (Realizetype)super.clone();
      }//访问类
      public void getName(){
      	System.out.println("我的名字"+this.name);
      }
  }
  //原型模式的测试类
  public class PrototypeTest
   {
       public static void main(String[] args)throws CloneNotSupportedException
       {
           Realizetype obj1=new Realizetype();
           Realizetype obj2=(Realizetype)obj1.clone();
           obj1.getName();
           obj2.getName();
           System.out.println("obj1==obj2?"+(obj1==obj2));
       }
   }
/**
* 输出：
*具体原型创建成功！
*具体原型复制成功！
*我的名字孙悟空
*我的名字孙悟空
*obj1==obj2?false
* 
*/

```
## 原型模式的应用实例

