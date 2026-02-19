class ArrayDemo {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};

        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
