/**
 * @author Laetitia, Arthur, Anthony
 * @version 1.0.8
 */
package main;

import java.io.IOException;

import contract.IBoulderDashController;
import contract.IModel;
import controller.Controller;
import model.BoulderDashModel;
import view.View;

/**
 * The Class Main.
 *
 * @author Laetitia, Arthur, Anthony
 */
public abstract class Main {

	
	private static String txt = "C:\\Work\\Workspaces\\Git_Wks\\EXIAA1-Java-BoulderDash\\BoulderDash\\model\\src\\main\\resources\\map.txt";
	
	/**
	 * The main method.
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(final String[] args) throws IOException, InterruptedException {
		final IModel model = new BoulderDashModel(txt,1,1);
		final View view = new View(model.getMap(), model.getMyPlayer());
		final IBoulderDashController controller = new Controller(view, model);
		view.setOrderPerformer(controller.getOrderPerformer());

		controller.play();
	}
}
