public class FizzB {
    private int number;

    public FizzB() {
    }

    public FizzB(int number) {
        this.number = number;
    }


    public String fizzBuzzer(){
        if(number==3) return "fizz";

        return ""+number;
    }
}
