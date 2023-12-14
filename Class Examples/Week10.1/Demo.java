public class Demo {
    
    public static void main(String[] args) {
        /* MySampleInterface someVariable  = new MySampleInterface() {

            public void tryThis() {
                String message = "I'm glad you tried this!";
                System.out.println(message);
            }
        
            public int tryThat(int number) {
                return number % 2;
            }

        }; */ 
        //Another yep = new Another();
        (new Another()).iDoStuff(new MySampleInterface() {

            public void tryThis() {
                String message = "I'm glad you tried this!";
                System.out.println(message);
            }
        
            public int tryThat(int number) {
                return number % 2;
            }

                                                        });
    }
}
