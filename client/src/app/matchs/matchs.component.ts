import { Component, OnInit } from '@angular/core';
import { HttpModule } from '@angular/http';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map' ;
import {ServicesService} from '../services.service';
@Component({
  selector: 'app-matchs',
  templateUrl: './matchs.component.html',
  styleUrls: ['./matchs.component.css']
})
export class MatchsComponent implements OnInit {

  matchEvent: any;
  dateCle: Date;
  constructor( public eventServices: ServicesService) { }


  ngOnInit() {
    this.doSherch();
   }
  doSherch () {
    this.eventServices.getMatch ()
      .subscribe(data => {
          this.matchEvent = data;
        }, err => {
          console.log(err);
        }
      );
  }

  chercher() {

  }
}
