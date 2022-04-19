package com.company.FrontController;
import com.company.controller.Controller;

import java.util.HashMap;

public class FrontController {
    public static void mainLoopController(HashMap datafromView){
        if(datafromView.get("operation")).equals("addbird")){
          Controller.addArrayBird(datafromView);
        }

    }

}
