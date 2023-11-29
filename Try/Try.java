package Try;

public class Try {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("first commit");
        System.out.printf("Second commit");
        System.out.println("push test");
        System.out.println("pull test");
    }
}
