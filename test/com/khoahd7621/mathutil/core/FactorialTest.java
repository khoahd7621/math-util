package com.khoahd7621.mathutil.core;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author KhoaHD.7621
 */
public class FactorialTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnWell() {
        
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        
    }
    
    //check xem có xuất hiện ngoại lệ hay không khi đưa data cà trớn
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        //ta ko thể dùng hàm assertEquals(2 values để so sánh)
        //ngoại lệ chỉ có thể thấy nó xuất hiện hay không thôi??
        MathUtil.getFactorial(-5);
    }
    
}

//QUY ƯỚC XANH ĐỎ
//1. XANH, TẤT CẢ TÌNH HUỐNG SO SÁNH XÀI HÀM PHẢI CÙNG XANH
//2. ĐỎ, CHỈ CẦN 1 TÌNH HUỐNG XÀI HÀM BỊ ĐỎ, COI NHƯ CẢ HÀM LÀ ĐỎ
//ĐỎ:
//HOẶC BẠN TÍNH TOÁN TRONG THẬT TOÁN/HÀM SAI
//HOẶC BẠN KÌ VỌNG SAI