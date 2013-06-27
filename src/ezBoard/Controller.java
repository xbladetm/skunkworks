package ezBoard;

import ezCommon.IData;
import java.util.ArrayList;

public class Controller {

    private Model myModel;
    private Viewh myView;

    public Controller() {
        System.out.println("CONTROLLER: Controller()");
    }

    public void addView(Viewh v) {
        myView = v;
        System.out.println("CONTROLLER: adding view");
    }

    public void addModel(Model m) {
        System.out.println("CONTROLLER: adding model");
        myModel = m;
    }

    void runView() {
        System.out.println("CONTROLLER: Running view");
        updateLists();
        myView.setVisible(true);
    }

    public void updateLists() {
        myView.toDo = myModel.getToDo();
        myView.inProgress = myModel.getInProgress();
        myView.done = myModel.getDone();
    }
}
