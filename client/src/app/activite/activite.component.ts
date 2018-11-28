import { Component, OnInit } from '@angular/core';

import { HttpModule } from '@angular/http';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map' ;
import {ServicesService} from '../services.service';

@Component({
  selector: 'app-activite',
  templateUrl: './activite.component.html',
  styleUrls: ['./activite.component.css']
})
export class ActiviteComponent implements OnInit {

  pageActivite: any;
  dateCle: Date;
  constructor( public eventServices: ServicesService) { }


  ngOnInit() {
    this.doSherch();
   }
  doSherch () {
    this.eventServices.getActivete ()
      .subscribe(data => {
          this.pageActivite = data;
        }, err => {
          console.log(err);
        }
      );
  }

  chercher() {

  }
}