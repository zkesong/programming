import java.util.Scanner;

/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/20 16:20
 */

/*
小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
牛博士给小易出了一个难题:
对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chars = scanner.nextLine().split(" ");
        int size = chars.length, minCount, count = 0, twoTimes = 0;
        if (size % 2 == 0) {
            minCount = size / 2;
        } else {
            minCount = (size - 1) / 2;
        }
        for (int i = 0; i < size; i++) {
            count += Integer.valueOf(chars[i]) % 4 == 0 ? 1 : 0;
            twoTimes += Integer.valueOf(chars[i]) == 2 ? 1 : 0;
        }
        count += twoTimes / 2;
        if (count >= minCount) {
            System.out.println("ok");
        }else {
            System.out.println("error");
        }
    }
}
