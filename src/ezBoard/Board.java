/*
 * Board es el programa principal que ejecuta el MVC de la pizarra de Kanban.
 */
package ezBoard;

/**
 *
 * @author Andrei
 * @author Andrés
 */
public class Board {

    public void runMVC() {
        Model model = new Model();
        Viewh view = new Viewh();
        Controller controller = new Controller();

        model.registerObserver(view);
        controller.addModel(model);
        view.addController(controller);
        controller.addView(view);
        controller.runView();
    }

    public static void main(String params[]) {
        Board b = new Board();
        b.runMVC();
    }
}
