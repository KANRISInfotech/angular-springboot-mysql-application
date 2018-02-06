import { Component } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HeroesComponent } from './heroes/heroes.component'
import { HeroesService } from './heroes.service';
import { Hero } from './hero';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Tour of Heroes';
  /* title = 'app';
  heroes:Array<Hero>;
  constructor(private heroService:HeroesService){
    heroService.getHeroes().subscribe(
      (data)=>{
        this.heroes=(data);
      }
    )
  } */
}