import com.windsor.service.OrderSv;
import com.windsor.service.impl.OrderSvImpl;
import org.junit.Test;

public class Tester {
    @Test
    public void test1() throws Exception {
        OrderSv orderSv = new OrderSvImpl();
        orderSv.supportDests("1003");
    }
}
