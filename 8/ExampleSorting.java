class ExampleSorting{
    static class Patient{
        String name;
        int age;
        boolean gender;
        Patient(String name, int age, boolean gender){
            this.name=name;
            this.age=age;
            this.gender=gender;
        }
    }
    class comparePatients implements Comparable<Patient>{
        
    }
    public static void main(String args[]){
        Patient[] patients = new Patient[10];
        for(int i=10; i>=0; i++){
            patients[i]=new Patient("Oracle".concat(String.valueOf(i*3)), 2*i, i%2==0 ? false : true);
        }
    }
}