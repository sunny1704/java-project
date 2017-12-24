import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
	Rectangle myRect = new Rectangle(5,6);

	@Test
	public void getTestArea() {
		assertEquals(myRect.getArea(), 30);
	}
}
