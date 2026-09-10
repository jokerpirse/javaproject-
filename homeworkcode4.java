package homework0910;

public class homeworkcode4 {
	public static String getMenu(String name) {
        return name;
    }

    public static String getMenu(String name, int ml) {
        return name + " (우유 " + ml + "ml)";
    }

    public static void main(String[] args) {
        String menus[] = {
            getMenu("아메리카노"),
            getMenu("라떼", 50)
        };

        for (int i = 0; i < 2; i++)
            System.out.println(menus[i]);
    }

}

package 장제하;

public class homeworkcode4 {
	public static String getMenu1(String name) {
        return name;
    }

    public static String getMenu2(int ml) {
        return " (우유 " + ml + "ml)";
    }

    public static void main(String[] args) {
    	
           String menu1 = getMenu1("아메리카노");
           String menu2 = getMenu1("라떼");
           String ml=getMenu2(50);
        
           System.out.println(menu1);
           System.out.print(menu2);
           System.out.println(ml);
            
        //for (int i = 0; i < 2; i++)
        //System.out.println(menus1);
        //System.out.println(menus2);
    	
    	
//        String menus[] = {
//            getMenu("아메리카노"),
//            getMenu("라떼", 50)
//        };
//
//        for (int i = 0; i < 2; i++)
//            System.out.println(menus[i]);
    }


}
