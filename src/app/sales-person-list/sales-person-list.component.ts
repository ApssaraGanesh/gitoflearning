import { Component, OnInit } from '@angular/core';
import { SalesPerson } from '../classes/sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  constructor() { }
  salesPersonList:SalesPerson[] = [
    new SalesPerson("apssara","ganesh","apssara@gmail.com",76700),
    new SalesPerson("Ruphaa","Ganesh","ruphaa@gmail.com",532999),
    new SalesPerson("Sujatha","Ganesh","sujatha@gmail.com",76000),
    new SalesPerson("Venkat","Ganesh","venkat@gmail.com",9034500)

  ]
  inputData : SalesPerson = new SalesPerson("", "", "" , 0);

  ngOnInit(): void {
    this.salesPersonList.push(this.inputData)
  }
  onSubmit(){
    console.log(this.inputData);
  }

}
