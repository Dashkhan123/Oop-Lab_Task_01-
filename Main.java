class MyJ {
    String name;
    float Programming_L;
    float CALCULUS;
    float Islamic_Studies;
    float Quranic_Circle;
    float gpa;
    String registration;
    float English;
    float Ict;
    float Programming;
    float Ict_Lab;
    void data() {
        System.out.println("Student_Name:"+name);
        System.out.println("Registration No:"+registration);
        System.out.println("Total GPA: "+ gpa);
        System.out.println("Programming_Fundamental: "+Programming);
        System.out.println("Programming_Lab: "+Programming_L);
        System.out.println("Calculus: "+CALCULUS);
        System.out.println("Functional_English: "+English);
        System.out.println("Islamic_Studies: "+Islamic_Studies);
        System.out.println("Quranic_Circle:"+Quranic_Circle);
        System.out.println("ICT:"+Ict);
        System.out.println("ICT_Lab:"+Ict_Lab);
    }
}
class Main {
    public void main(String[] args) {
        MyJ i=new MyJ();
        i.name="your_name";  // Change the name to your's
        i.registration="25MDAI000";  //Also change the registration number to your's one
        i.Programming_L= 2.0f;
        i.Ict=1.33f;
        i.English=2.00f;
        i.Programming= 1.0f;
        i.CALCULUS= 33.33f;
        i.Islamic_Studies= 3.67f;
        i.Quranic_Circle= 4.33f;
        i.Ict_Lab=1.67f;
        i.gpa =3.35f;
        i.data();
    }
}