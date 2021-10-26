public class ScientificCalculator extends StandardCalculator{

    public int modulo(int number, int mod) {
        return number % mod;
    }
    public int factoral(int a) {
        int factoral_ = 1;
        for (int i = 1; i <= a; i++) {
            factoral_ = factoral_ * i;
        }
        return factoral_;
    }
}
