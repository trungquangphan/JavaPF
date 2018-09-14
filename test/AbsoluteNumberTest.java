import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.AbsoluteNumber;

public class AbsoluteNumberTest {

    @Test
    public void traVeSoDuongNeuNhanThamSoDuong(){
        //Chuan bi du lieu
        int number = 1;

        //Chay phuong thuc can test
        int absoluteNumber = AbsoluteNumber.getAbsoluteNumber(number);

        //Doi chieu gia tri
        Assertions.assertEquals(1, absoluteNumber);
    }


    @Test
    public void traVeSoDuongNeuNhanThamSoAm(){
        //Chuan bi du lieu
        int number = -1;

        //Chay phuong thuc can test
        int absoluteNumber = AbsoluteNumber.getAbsoluteNumber(number);

        //Doi chieu gia tri
        Assertions.assertEquals(1, absoluteNumber);
    }

    @Test
    public void traVe0NeuNhanThamSo0(){
        //Chuan bi du lieu
        int number = 0;

        //Chay phuong thuc can test
        int absoluteNumber = AbsoluteNumber.getAbsoluteNumber(number);

        //Doi chieu gia tri
        Assertions.assertEquals(0, absoluteNumber);
    }
}
