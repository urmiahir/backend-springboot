import { ActivatedRoute, Router } from '@angular/router';
import { Admin } from './../admin';
import { Component } from '@angular/core';
import { AboutusService } from './aboutus.service';

@Component({
  selector: 'app-aboutu',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent {

  admin:Admin[] | undefined;

  constructor(private aboutus:AboutusService,
    private r:Router,
    private route: ActivatedRoute,){}

onClick() {
     this.r.navigate(['contact'],{relativeTo:this.route});
     console.log('got clicked.!');
}

}
