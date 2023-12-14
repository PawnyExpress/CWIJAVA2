public class UnnecessaryClass implements MySampleInterface {

    @Override
    public void tryThis() {
        String message = "I'm glad you tried this!";
        System.out.println(message);
    }

    @Override
    public int tryThat(int number) {
        return number % 2;
    }
    
}
