import { Component, OnInit } from '@angular/core';
import {ProductmanagementServiceService} from 'src/app/services/productmanagement-service.service'
import { ProductCategory } from 'src/app/common/product-category';
@Component({
  selector: 'app-productcategory-list',
  templateUrl: './productcategory-list.component.html',
  styleUrls: ['./productcategory-list.component.css']
})
export class ProductcategoryListComponent implements OnInit {
  productcategorys: ProductCategory[];
  constructor(private service:ProductmanagementServiceService ) { }

  ngOnInit(): void {
    this.listOfProductsCategory()
  }
  listOfProductsCategory(){
    this.service.getAllProductCategory().subscribe(data =>{
      console.log(data);
      this.productcategorys= data;
     
    })
  }
}
