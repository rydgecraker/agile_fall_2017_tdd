import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class CarTest {
	
	@Test
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	
	@Test
	public void canAccelerate() {
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed() {
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	
	@Test
	public void canDoToString() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.toString(), is("Color: Red, Speed: 0"));
	}
	
	
	@Test
	public void canDecelerateNormally() {
		Car car1 = new Car("Red", 100);
		car1.accelerate(50);
		car1.decelerate(30);
		assertThat(car1.getSpeed(), is(20));
	}
	
	
	
	@Test
	public void cannotDeceleratePastZero() {
		Car car1 = new Car("Red", 100);
		car1.accelerate(50);
		car1.decelerate(60);
		assertThat(car1.getSpeed(), is(0));
	}
	
	
}