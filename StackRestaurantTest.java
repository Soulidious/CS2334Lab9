/**
 * Lab 9
 *
 * Test suite for the StackRestaurant class.
 *
 * @author Em Evans
 * @version 2019-10-14
 *
 */
public class StackRestaurantTest {

	private StackRestaurant<String> stack;
	
	public void initialize() throws AssertException
	{
		stack = new StackRestaurant<String>();
	}
	/**
	 * test addOrder()
	 * @throws AssertException
	 */
	public void testAddOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO:implement this
		Order<String> order1 = new Order<String>("bacon", 12);
		Order<String> order2 = new Order<String>("sausage", 14);
		stack.addOrder(order1);
		Assert.assertEquals(order1, stack.getOrderList().get(0));
		stack.addOrder(order2);
		Assert.assertEquals(order2, stack.getOrderList().get(1));
	}
	/**
	 * test completeOrder() using at least three orders
	 * show the ordering specific to stack
	 * 
	 * @throws AssertException
	 */
	public void testCompleteOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("bacon", 12);
		Order<String> order2 = new Order<String>("sausage", 14);
		Order<String> order3 = new Order<String>("bacon", 11);
		stack.addOrder(order1);
		stack.addOrder(order2);
		stack.addOrder(order3);
		Assert.assertEquals(order3, stack.checkNextCompletedOrder());
		stack.completeOrder();
		Assert.assertEquals(order2, stack.checkNextCompletedOrder());
		
	}
	/**
	 * test numberRemainingOrder() with at least 2 orders
	 * 
	 * @throws AssertException
	 */
	public void testNumberRemainingOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("bacon", 12);
		Order<String> order2 = new Order<String>("sausage", 14);
		Order<String> order3 = new Order<String>("bacon", 11);
		stack.addOrder(order1);
		stack.addOrder(order2);
		stack.addOrder(order3);
		Assert.assertEquals(3, stack.numberRemainingOrder());
		stack.completeOrder();
		stack.completeOrder();
		Assert.assertEquals(1, stack.numberRemainingOrder());
	}
	/**
	 * test both cases of completeOrder
	 * @throws AssertException
	 */
	public void testCheckNextCompletedOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("bacon", 12);
		Order<String> order2 = new Order<String>("sausage", 14);
		Order<String> order3 = new Order<String>("bacon", 11);
		stack.addOrder(order1);
		stack.addOrder(order2);
		stack.addOrder(order3);
		Assert.assertEquals(order3, stack.checkNextCompletedOrder());
		stack.completeOrder();
		stack.completeOrder();
		Assert.assertEquals(order1, stack.checkNextCompletedOrder());
	}
}

