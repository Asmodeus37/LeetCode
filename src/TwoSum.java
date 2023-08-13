public class TwoSum {
        System.out.print("Nhập số phần tử của mảng: ");
    int n = scanner.nextInt();
    // khởi tạo mảng arr
    int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
        System.out.printf("a[%d] = ", i);
        arr[i] = scanner.nextInt();
    }
        System.out.print("Các phần tử của mảng: ");
    show(arr);
}
