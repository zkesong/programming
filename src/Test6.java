/**
 * @author KeSong Zeng
 * @version V1.0
 * @e-mail kesongzeng@163.com
 * @date 2018/3/20 17:06
 * @Description:回文串判断
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(check("aaccaacca"));
        System.out.println(check("accaacca"));
    }

    public static boolean check(String str){
        if(null == str || "".equals(str)){
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        String[] strings = str.split("");
        boolean flag = false;
        for (; i <= j; i++,j--) {
            if(!strings[i].equals(strings[j])){
                return false;
            }
        }
        return true;
    }
}
