/**
 * Lab 9
 *
 * Test suite for the PriorityQueueRestaurant class.
 *
 * @author Em Evans
 * @version 2019-10-14
 *
 */
public class PriorityQueueRestaurantTest {

	private PriorityQueueRestaurant<String> pqueue;
	
	public void initialize() throws AssertException
	{
		pqueue = new PriorityQueueRestaurant<String>();
	}
	/**
	 * test addOrder()
	 * @throws AssertException
	 */
	public void testAddOrder() throws AssertException 
	{
		pqueue = new PriorityQueueRestaurant<String>();
		//TODO: implement this
		Order<String> order = new Order<String>("bacon", 1);
		pqueue.addOrder(order);
		
		Assert.assertEquals(order, pqueue.getOrderList().peek());
	}
	/**
	 * test completeOrder() using at least three orders
	 * show the ordering specific to priority queue
	 * 
	 * @throws AssertException
	 */
	public void testCompleteOrder() throws AssertException 
	{
		pqueue = new PriorityQueueRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("bacon", 3);
		Order<String> order2 = new Order<String>("sausage", 1);
		Order<String> order3 = new Order<String>("eggs", 4);
		
		pqueue.addOrder(order1);
		pqueue.addOrder(order2);
		pqueue.addOrder(order3);
		
		pqueue.completeOrder();
		Assert.assertEquals(order1, pqueue.checkNextCompletedOrder());
	}
	/**
	 * test numberRemainingOrder() with at least 2 orders
	 * 
	 * @throws AssertException
	 */
	public void testNumberRemainingOrder() throws AssertException 
	{
		pqueue = new PriorityQueueRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("bacon", 3);
		Order<String> order2 = new Order<String>("sausage", 1);
		Order<String> order3 = new Order<String>("eggs", 4);
		
		pqueue.addOrder(order1);
		pqueue.addOrder(order2);
		pqueue.addOrder(order3);
		
		Assert.assertEquals(3, pqueue.numberRemainingOrder());
		
		pqueue.completeOrder();
		
		Assert.assertEquals(2, pqueue.numberRemainingOrder());
	}
	/**
	 * test both cases of completeOrder
	 * @throws AssertException
	 */
	public void testCheckNextCompletedOrder() throws AssertException 
	{
		pqueue = new PriorityQueueRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("bacon", 3);
		Order<String> order2 = new Order<String>("sausage", 1);
		Order<String> order3 = new Order<String>("eggs", 4);
		
		pqueue.addOrder(order1);
		pqueue.addOrder(order2);
		pqueue.addOrder(order3);
		
		Assert.assertEquals(order2, pqueue.checkNextCompletedOrder());
		
		pqueue.completeOrder();
		
		Assert.assertEquals(order1, pqueue.checkNextCompletedOrder());
	}
}
