package Day_22;

public class getter_setter {

    private String Name;
    private  int RollNo;
        private String ClassName;
        private String SchoolName;
    
        public getter_setter (String name, int rollno, String className, String schoolName){
            Name = name;
            RollNo= rollno;
            ClassName= className;
            SchoolName= schoolName;
        }
        
        public String getname(){
            return Name;
        }
    public String setName(String Name){
            return this.Name=Name;
        }
    
        public int getRoll(){
            return RollNo;
    }
    public int setRoll(int RollNo){
        return this.RollNo= RollNo;
    }

        public String getClassname(){
        return ClassName;
    
    }
    public String setClassname(String ClassName){
        return this.ClassName= ClassName;
    }

        public String getSchool(){
        return SchoolName;
    }

    public String setSchool(String SchoolName){
        return this.SchoolName=SchoolName;
    }
}
