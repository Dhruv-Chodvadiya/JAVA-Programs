public class _004_OOPs {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Ram", 78, 91, 79);
        Student1 s2 = new Student1(102, "Krishna", 70, 92, 99);
        Student1 s3 = new Student1(103, "kgf", 85, 93, 89);
        Student1 s4 = new Student1(104, "rrr", 90, 94, 99);
        Student1 s5 = new Student1(105, "mahadev", 78, 95, 69);
        Student1 s6 = new Student1(106,"Dhruv",100,100,100);
        Student1 stud[]={s1,s2,s3,s4,s5,s6};
        Student1.getTop3Student(stud);
    }
}
class Student1{
    int rollNum;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int total;
    double perc;
    Student1(int rollNum,String name,int mark1,int mark2,int mark3){
        this.rollNum=rollNum;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.total=mark1+mark2+mark3;
        this.perc=total/3;
    }

//    public double getPerc() {
//        return perc;
//    }

    public static void getTop3Student(Student1 stud[]){
        for(int i=0;i<stud.length;i++){
            for(int j=0;j<stud.length-1;j++){
                if(stud[j].perc < stud[j+1].perc){
                    Student1 temp = stud[j];
                    stud[j] = stud[j+1];
                    stud[j+1] = temp;
                }
            }
        }

        Student1 max1=stud[0];
        Student1 max2=stud[1];
        Student1 max3=stud[2];

//        for(int i=4;i< stud.length;i++){
//            if(stud[i].perc > max1.perc){
//                max3 = max2;
//                max2=max1;
//                max1=stud[i];
//            } else if (stud[i].perc > max2.perc && stud[i].perc != max1.perc) {
//                max3=max2;
//                max2=stud[i];
//            } else if(stud[i].perc > max3.perc && stud[i].perc != max2.getPerc()){
//                max3=stud[i];
//            }
//        }

        System.out.println(max1.name +"  "+ max1.perc);
        System.out.println(max2.name +"  "+ max2.perc);
        System.out.println(max3.name +"  "+ max3.perc);
    }
}
