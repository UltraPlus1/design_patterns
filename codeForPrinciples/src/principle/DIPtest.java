package principle;

public class DIPtest {
	public static void main(String[] args) {
		Customer zhang = new Customer();
		zhang.shopping(new ShaoguanShop());
		zhang.shopping(new WuyuanShop());

	}
}
interface Shop{
	public String Sell();
}

class ShaoguanShop implements Shop{

	@Override
	public String Sell() {
		return "韶关土特产：香菇、木耳……";
	}
}

class WuyuanShop implements Shop{

	@Override
	public String Sell() {
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