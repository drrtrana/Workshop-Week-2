public class ImaginaryNumber {
    private int real;
    private int imaginary;

    public ImaginaryNumber(int a, int b){
        this.real = a;
        this.imaginary = b;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void displayImaginaryNumber(){
        String operator = "+";
        if(this.imaginary < 0) {
            operator = "-";
        }
        System.out.println(this.real + operator + Math.abs(this.imaginary) + "i");
    }

    public boolean isIdentical(ImaginaryNumber in){
        return this.getReal() == in.getReal() && this.getImaginary() == in.getImaginary();
    }
}
