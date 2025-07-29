package demo4;
import java.util.ArrayList;
import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> al = new ArrayList<>();


        loop:while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");

            String choose = sc.next();
            switch(choose){
                case "1"-> addStudent(al);
                case "2"-> removeStudent(al);
                case "3"-> xgStudent(al);
                case "4"-> cxStudent(al);
                case "5"-> {
                    System.out.println("退出成功");
                    break  loop;
                }
                default -> {System.out.println("选择有误，请重新输入");}
            }
        }






    }
//定义方法
    public static void addStudent( ArrayList<Student> al) {
        System.out.println("请输入学生信息，进行添加");
        System.out.println("请输入学生id");


        Scanner sc = new Scanner(System.in);
        String id=sc.next();
        int index=getIndexStudent( al,id);
        if(index>=0){
            System.out.println("请输入学生名字");

            System.out.println("请输入学生年龄");

            System.out.println("请输入学生家庭住址");

        }else{
            System.out.println("id已存在，回到初始菜单");
            return;
        }
}
    public static void removeStudent( ArrayList<Student> al) {
        System.out.println("请输入学生id，进行删除");
        Scanner sc = new Scanner(System.in);
        String id=sc.next();
        int index=getIndexStudent( al,id);
        if(index>=0){
            al.remove(index);
        }else{
            System.out.println("id不存在，回到初始菜单");
            return;
        }
    }

    public static void xgStudent( ArrayList<Student> al) {
        System.out.println("请输入学生id，进行修改");
        Scanner sc = new Scanner(System.in);
        String id=sc.next();
        int index=getIndexStudent( al,id);
        if(index>=0){
            System.out.println("请输入学生名字");
            al.get(index).setName(sc.next());
            System.out.println("请输入学生年龄");
            al.get(index).setAge(sc.nextInt());
            System.out.println("请输入学生家庭住址");
            al.get(index).setHomeAddress(sc.next());
        }else{
            System.out.println("id不存在，回到初始菜单");
           return;
        }

    }


    public static void cxStudent( ArrayList<Student> al) {
       if(al.size()==0){
           System.out.println("当前没有学生信息，请添加后再查询");
       }else{
          for(int i=0;i<al.size();i++){
              System.out.println("id         名字    年龄       家庭住址");
              System.out.println(al.get(i).getId()+"     "+al.get(i).getName()+"     "+al.get(i).getAge()+"     "+al.get(i).getHomeAddress());

          }
       }
    }


    //查找，返回集合序列
    public static int getIndexStudent( ArrayList<Student> al,String id) {
        Scanner sc = new Scanner(System.in);
        id=sc.next();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }





}
