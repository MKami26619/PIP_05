class ZAD_2 {
    public static void main(String[] args) {
        int num = 10, num1 = 0, num2 = 1;
        System.out.print("Ciąg Fibonnacciego "+num+" kolejnych liczb wynosi: ");

        for (int i = 1; i <= num; ++i) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}