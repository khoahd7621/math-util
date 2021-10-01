package com.khoahd7621.mathutil.core;

/**
 *
 * @author KhoaHD.7621
 */
public class MathUtil {

    //viết hàm tính giai thừa n! = 1.2.3.4.5...n
    //0! = 1! = 1
    //21! tràn kiểu long
    //<0! ko tính được, ko có giai thừa cho số âm
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0..");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        long product = 1;
//        
//        for (int i = 1; i <= n; i++)
//            product *= i;
//        
//        return product;
//        
//    }
    
    //Recursion - đệ quy, gọi lại chính mình với qui mô khác
    //Búp bê người Nga
    //5! = 1.2.3.4.5
    //5! = 5 * 4!
    //4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!
    //1! = 1 -> điểm dừng
    //n! = n * (n - 1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid arg.");
        
        if (n == 0 || n == 1)
            return 1; // điểm dừng
        
        return n * getFactorial(n - 1); // đệ qui
    }

}
//TDD - Test Driven Development
//Test First Development
//Khi viết code ta phải lưu ý ngay viết test case/tình huống test
//app/hàm phải đc đề cập ngay
//test ngay những gì ta sẽ viết ra, test trước khi ta viết hoàn thiện code!!!
//