package p177_Classstudy;

public class MyInteger {
	int val;
	
	int add(MyInteger  ob) {return val+ob.val;}
	int substract(MyInteger  ob) {return val-ob.val;}
	int multiply(MyInteger  ob)  {return val*ob.val;}
	double divide(MyInteger  ob) {return ((double) val)/ob.val;}

}
