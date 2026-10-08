import geo.motos.Car;
import geo.motos.Bus;
import geo.motos.MotoVehicle;
import geo.users.Customer;

import java.util.Scanner;
public class TestRent {
    public static void main(String[] args) throws Exception {
    MotoVehicle []vehicles=new MotoVehicle[6];
    vehicles[0]=new Car("冀A001","white","宝马");
    vehicles[1]=new Car("冀A002","red","别克");
    vehicles[2]=new Car("冀A003","blue","别克");
    vehicles[3]=new Bus("冀A001","white",12);
    vehicles[4]=new Bus("冀A002","blue",30);
    vehicles[5]=new Bus("冀A003","yellow",45);
    Scanner sc=new Scanner(System.in);
    System.out.print("请输入你的身份证号：");
    String id=sc.next();
    System.out.print("请输入你的姓名：");
    String name=sc.next();
    Customer customer=new Customer(id,name);
    System.err.println("\n序号 车牌号 车型/座位数\t颜色\t租凭价格(天)");
    for(int i=0;i<vehicles.length;i++){
        System.out.println(i+"   "+vehicles[i]);
    }
    System.out.print("\n请输入租凭车辆序号：");
    int index=sc.nextInt();
    System.out.print("请输入租凭天数：");
    int days=sc.nextInt();

    System.out.println("\n你好，你的租凭信息如下：");
    System.out.println("序号 车牌号 车型/座位数\t颜色\t租凭价格(天)");
    System.out.println(index+"   "+vehicles[index]);

    double total=customer.calcTotalRent(vehicles[index], days);
    System.out.println("总租金："+total);
    sc.close();
    }
}
