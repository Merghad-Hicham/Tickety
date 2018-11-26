import { Component, OnInit } from '@angular/core';
import { HttpModule } from '@angular/http';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map' ;
import {ServicesService} from '../services.service';
@Component({
  selector: 'app-entrainement',
  templateUrl: './entrainement.component.html',
  styleUrls: ['./entrainement.component.css']
})
export class EntrainementComponent implements OnInit {

  pageEvent: any;
  dateCle: Date;
  constructor( public eventServices: ServicesService) { }

  ngOnInit() {
    this.doSherch();
   }
  doSherch () {
    this.eventServices.getEvent ()
      .subscribe(data => {
          this.pageEvent = data;
        }, err => {
          console.log(err);
        }
      );
  }

  chercher() {

  }

}
