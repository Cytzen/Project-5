package controller;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;
import contract.UserOrder;

/**
 * @author Anthony
 *
 */
public class ControllerTest {

	/**
	 * The view
	 */
	private IView view;

	/**
	 * The model
	 */
	private IModel model;

	/**
	 * The controller
	 */
	private Controller controller;

	/**
	 * stackOrder
	 */
	private UserOrder stackOrder = UserOrder.UP;
	
	/**
	 * @return stackOrder
	 */
	public UserOrder getStackOrder() {
		return stackOrder;
	}

	/**
	 * @param stackOrder
	 */
	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		// setup a new controller
		this.controller = new Controller(view, model);
	}


	/**
	 * @throws IOException
	 */
	@Test
	public void testOrderPerform() throws IOException {

		UserOrder expectedUserOrder = UserOrder.UP;
		controller.orderPerform(stackOrder);
		assertEquals(expectedUserOrder, this.stackOrder);
	}

	/**
	 * test the method GetOrderPerformer
	 */
	@Test
	public void testGetOrderPerformer() {
		assertNotNull(controller.getOrderPerformer());
	}

}
