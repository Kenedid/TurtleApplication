package com.company.Controllers;

import com.company.M.Model;

/**
 * Created by Kenedid on 11-05-2017.
 */
public class klasseController {

    Model model = new Model();

      public klasseController(Model model){

          super();
          this.model = model;
      }

      public Model getModel(){
        return model;
    }





}
