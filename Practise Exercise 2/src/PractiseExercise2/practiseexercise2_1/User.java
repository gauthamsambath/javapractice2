package PractiseExercise2;

public class User
    {
        private String firstname=new String();
        private String lastname=new String();
        private int age=0;
        private int salary=0;

        public boolean isValid(int age)
        {
            if(age<0||age>100)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
        public String getFullName()
            {
                return getFirstname()+" "+getLastname();
            }


    }
