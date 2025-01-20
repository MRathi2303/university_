package sem_3rd.ClassAndObjects;

public class Moon {
    private String Name;
    private String sec;
    private int [] marks;

    public Moon(String name, String Section, int m[]){
        this.Name=name;
        this.sec=Section;
        this.marks=m;
    }

    public void display(){
        System.out.println("Name:"+this.Name);
        System.out.println("Section:"+this.sec);
        System.out.println("Marks:");
        for(int i=0;i<this.marks.length;i++){
            System.out.println(this.marks[i]);
        }
    }

    public void percentage(){
        int total=0;
        for(int i=0;i<this.marks.length;i++){
            total+=this.marks[0];
        }
        System.out.println("Percentage:"+(total/this.marks.length));
    }
}
