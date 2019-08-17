package CreativePatterns.Singleton;

/**
 * 用懒汉单例模拟银行账户余额
 */
public class LazySingleton
{
	private static volatile LazySingleton instance=null;    //保证 instance 在所有线程中同步

	private double balance;

	private LazySingleton(double balance){
		this.balance = balance;
		System.out.println("我新开了一个银行卡账户");
	}    //private 避免类在外部被实例化

	public static synchronized LazySingleton getInstance()
	{
		//getInstance 方法前加同步
		if(instance==null)
		{
			instance=new LazySingleton(0);
		}else{
			System.out.println("该账户之前已经开好了");
		}
		return instance;
	}

	public void getalance(){
		System.out.println("余额为："+this.balance);
	}
	public void Save(double money){
		this.balance += money;
	}
	public void WithDraw(double money){
		if(this.balance<money){
			System.out.println("余额不足，取钱失败");
		}else{
			this.balance -= money;
			System.out.println("余额充足，取钱成功");
		}
	}
}
