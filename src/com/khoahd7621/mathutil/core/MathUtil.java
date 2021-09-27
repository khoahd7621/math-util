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
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for (int i = 1; i <= n; i++)
            product *= i;
        
        return product;
        
    }

}
//TDD - Test Driven Development
//Test First Development
//Khi viết code ta phải lưu ý ngay viết test case/tình huống test
//app/hàm phải đc đề cập ngay
//test ngay những gì ta sẽ viết ra, test trước khi ta viết hoàn thiện code!!!
//