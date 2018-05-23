import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.sun.tools.corba.se.idl.constExpr.Equal;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static com.sun.javafx.fxml.expression.Expression.greaterThanOrEqualTo;
import static com.sun.javafx.fxml.expression.Expression.lessThanOrEqualTo;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.assumeThat;

@RunWith(JUnitQuickcheck.class)
public class MathTest {

    @Property
    public void SumTwoNumbers(int a, int b) {
        Assert.assertEquals(a+b, Math.sum(a,b));
    }

    @Property
    public void SumTwoPositiveNumbers(@InRange(maxInt = 0) int a, @InRange(minInt = 0) int b) {
        Assert.assertEquals(b, Math.sumPositive(a,b));
    }

}