import com.windsor.service.OrderSv;
import com.windsor.service.impl.OrderSvImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class Tester {

//    @Autowired
//    private OrderSv orderSv;

    @Test
    public void test1() throws Exception {
        OrderSv orderSv = new OrderSvImpl();
        orderSv.supportDests("1003");
    }
}
