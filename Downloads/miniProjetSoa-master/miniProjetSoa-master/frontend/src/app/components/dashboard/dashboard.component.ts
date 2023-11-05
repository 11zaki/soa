import { Component } from '@angular/core';

export interface PeriodicElement {
  class: string;
  id: number;
  Date: String;
  Time: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {id: 1, class: 'DMWM-A', Date: '10/9', Time: '10:15-12:00'},
  {id: 2, class: 'Data Science', Date: '11/9', Time: '13:00-15:00'},
  {id: 3, class: 'Data Science', Date:'05/10', Time: '13:00-15:00'},
  {id: 4, class: 'DMWM-A', Date: '15/10', Time: '13:00-15:00'},
  {id: 5, class: 'DMWM-A', Date: '25/10', Time: '10:15-12:00'},
  {id: 6, class: 'Tic-j', Date: '05/11', Time: '10:15-12:00'},
  {id: 7, class: 'TIC-A', Date: '07/11', Time: '13:00-15:00'},
  {id: 8, class: 'GLSI-B', Date: '22/11', Time: '13:00-15:00'},
  {id: 9, class: 'GlSI-B', Date: '25/12', Time: '10:15-12:00'},
  {id: 10, class: 'TIC-B', Date: '26/12', Time: '10:15-12:00'},
];

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  displayedColumns: string[] = ['id', 'class', 'Date', 'Time'];
  dataSource = ELEMENT_DATA;

}
