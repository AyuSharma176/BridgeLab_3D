package HospitalPlus;

public class Patients {
    private String name;
    private int  age;
    private String sex;
    private String status;
    private String address;
    private String phoneNo;
    private String email;
    private String diseases;
    Patients(String name,int age,String sex,String address,String status,String phoneNo,String email,String diseases){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.status=status;
        this.address=address;
        this.phoneNo=phoneNo;
        this.email=email;
        this.diseases=diseases;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getAddress() {
        return this.address;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString(){
       if(this.sex.equals("Male")){
           return "Name:- Mr. "+this.name+"\n"+"Age:- "+this.age+"\n"+"Sex:- "+this.sex+"\n"+"Address:- "+this.address+"\n"+"Phone no.:- "+this.phoneNo+"\n"+"Email:- "+this.email+"\n"+"Disease:- "+this.diseases;
       }else if(this.sex.equals("Female") && this.status.equals("Married")){
           return "Name:- Mrs. "+this.name+"\n"+"Age:- "+this.age+"\n"+"Sex:- "+this.sex+"\n"+"Address:- "+this.address+"\n"+"Phone no.:- "+this.phoneNo+"\n"+"Email:- "+this.email+"\n"+"Disease:- "+this.diseases;
       }
       else{
           return "Name:- Miss. "+this.name+"\n"+"Age:- "+this.age+"\n"+"Sex:- "+this.sex+"\n"+"Address:- "+this.address+"\n"+"Phone no.:- "+this.phoneNo+"\n"+"Email:- "+this.email+"\n"+"Disease:- "+this.diseases;
       }
    }
}
