package com.khoahd7621.mathutil.core;

import static com.khoahd7621.mathutil.core.MathUtil.getFactorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author KhoaHD.7621
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    // Kỹ thuật tham số hóa
    // Ta viết kĩ thuật mới, tách data ra hẳn các lệnh kiểm tra hàm
    // data này ta có thể đặt ở file .txt, .csv, .excel, database
    // input và output/expected là những cặp
    // nhiều cặp cần phải test, do đó data để test hàm sẽ là mảng 2 chiều
    // mảng 2 chiều này sẽ được nạp từ file .txt, db, ...
    // hoặc ta tạo luôn 1 mảng 2 chiều ngay đây
    
    @Parameters
    public static Object[][] initData() {// tên hàm tùy ý
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}
                               };
    }
    
    // ta cần map 2 cột vào 2 biến để lát hồi nhồi/feed chúng vào
    // hàm checkFactorial, ta gọi là testing kiểu tham số hóa
    // parameterized testing
    
    @Parameter(value = 0) //map cột 0 của tập data
    public int input;
    @Parameter(value = 1) //map cột 1 của tập data
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnWell() {

        assertEquals(expected, getFactorial(input));
        
    }
    
}
