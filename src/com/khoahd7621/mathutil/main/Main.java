package com.khoahd7621.mathutil.main;

import com.khoahd7621.mathutil.core.MathUtil;

/**
 *
 * @author KhoaHD.7621
 */
public class Main {
    
    public static void main(String[] args) {
        
        //test manual, đưa data, gọi hàm check, so sánh expected vs actual
        //tất cả, đặc biệt phần cmp là phải bằng mắt, cho từng tình huống test
        System.out.println("0! = 1? " + MathUtil.getFactorial(0));
        System.out.println("1! = 1? " + MathUtil.getFactorial(1));
        System.out.println("2! = 2? " + MathUtil.getFactorial(2));
        System.out.println("3! = 6? " + MathUtil.getFactorial(3));
        
    }
}
