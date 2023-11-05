import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forget',
  templateUrl: './forget.component.html',
  styleUrls: ['./forget.component.css']
})
export class ForgetComponent implements OnInit{
  resetBg:string = "assets/images/reset-password.svg";

  ngOnInit(): void {
  }

}
