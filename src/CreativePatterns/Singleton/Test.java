package CreativePatterns.Singleton;

public class Test {

	public static void main(String[] args) {
		/**
		 * 测试饿汉单例
		 */
		HungrySingleton t1 = HungrySingleton.getInstance();
		HungrySingleton t2 = HungrySingleton.getInstance();

		if(t1 == t2){
			System.out.println("t1和t2 是同一个对象");
		}else{
			System.out.println("t1和t2 不是同一个对象");
		}

		t1.getName();
		t2.getName();
		t1.setName("希拉里");
		t2.getName();
		t1.getName();

		/**
		 * 测试懒汉单例
		 */
		LazySingleton l1 = LazySingleton.getInstance();
		LazySingleton l2 = LazySingleton.getInstance();
		if(l1==l2){
			System.out.println("l1和l2是同一个账户");
		}else{
			System.out.println("l1和l2不是同一个账户");
		}
		l1.getalance();
		l2.getalance();
		l1.Save(100);//l1存钱
		l1.getalance();
		l2.getalance();
		l2.WithDraw(20);//l2取钱
		l1.getalance();
		l1.getalance();

	}

}
