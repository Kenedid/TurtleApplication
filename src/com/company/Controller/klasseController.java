package com.company.Controller;

import com.company.Model.Klassemodel;

/**
 * Created by Kenedid on 11-05-2017.
 */
public class klasseController {


      Klassemodel model = new Klassemodel();

      public klasseController(Klassemodel model){

          super();
          this.model = model;
      }

      public Klassemodel getModel(){
        return model;
    }





}
