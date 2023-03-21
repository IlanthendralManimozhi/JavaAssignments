package taskpackage;
/**
 * 
 * @author ilanthendralmanimozhi
 *
 */

public class BuilderPattern {
/**
 * Method create PersonBuider object through Person class reference.
 * @param args not used
 */
	public static void main(String[] args) {
		Person person = new Person.PersonBuilder()
			    .setFirstName("Ilanthendral")
			    .setLastName("Manimozhi")
			    .setAge(21)
			    .setAddress("Veadranyam")
			    .build();
		System.out.println(person);
		

	}

}
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    
    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
      
        public PersonBuilder() {}
        /**
         * access PersonBuilder class member firstName
         * @return current PersonBuilder object
         */
        
        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        /**
         * access PersonBuilder class member lastName
         * @return current PersonBuilder object
         */
        
        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        /**
         * access PersonBuilder class member age
         * @return current PersonBuilder object
         */
        
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        /**
         * access PersonBuilder class member address
         * @return current PersonBuilder object
         */
        
        
        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        /**
         * create  the object for person class
         * @return pass value to the person class member through object 
         */
        
        
        public Person build() {
            return new Person(firstName, lastName, age, address);
        }
    }
    @Override
	public String toString() {
		return "person [firstname=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}
	
}
