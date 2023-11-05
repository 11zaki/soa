import { Component } from '@angular/core';

@Component({
  selector: 'app-moy',
  templateUrl: './moy.component.html',
  styleUrls: ['./moy.component.css']
})
export class MoyComponent {
  student = [
    { firstName: 'John', lastName: 'Doe' },
    { firstName: 'Jane', lastName: 'Smith' },
    { firstName: 'Alice', lastName: 'Johnson' },
    { firstName: 'Bob', lastName: 'Brown' },
    { firstName: 'Eve', lastName: 'Davis' }
  ];

}
