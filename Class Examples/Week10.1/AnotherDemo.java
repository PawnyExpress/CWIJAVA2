public class AnotherDemo {
    public static void main(String[] args) {
        /* AnotherInterface hereWeGo = new AnotherInterface() {

                                        @Override
                                        public String sayHello(String name, int numTimes) {
                                            String result = "";
                                            for(int i = 0; i < numTimes; i++) {
                                                result += "Hello, " + name + ", how are you?\n";
                                            }
                                            return result;
                                        }
                                        
                                    }; */
        
        AnotherInterface hereWeGo = (name, numTimes) -> {
                                            String result = "";
                                            for(int i = 0; i < numTimes; i++) {
                                                result += "Hello, " + name + ", how are you?\n";
                                            }
                                            return result;
                                        };
                                        
                                    
        System.out.println(hereWeGo.sayHello("Mr. Muffin Man", 6));

        AnotherLambda yepAgain = () -> System.out.println("Yayyyyyyy!!!");
        yepAgain.build();

        AnotherLambda pleaseStop = () -> moreComplicatedAlgorithm();
        pleaseStop.build();

        FinalLambda stoppingNow = () -> sortaComplicatedAlgorithm();
        System.out.println(stoppingNow.build());
        
    }

    private static void moreComplicatedAlgorithm() {
        System.out.println("Check this complicated algorithm out");
        System.out.println("I really hope I'm using the lambda!");
    }

    private static String sortaComplicatedAlgorithm() {
        String result;
        result = "Hello ";
        result += "There";
        result += "!";
        return result;
    }
}
