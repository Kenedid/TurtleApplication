package com.company.Controller;

import com.company.Model.Model;

/**
 * Created by Kenedid on 11-05-2017.
 */
public class Controller {


      Model model = new Model();

      public Controller(Model model){

          super();
          this.model = model;
      }

      public Model getModel(){
        return model;
    }





}