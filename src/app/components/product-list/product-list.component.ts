import { Component, OnInit } from '@angular/core';
import {ProductmanagementServiceService} from 'src/app/services/productmanagement-service.service'
import {Product} from 'src/app/common/product'
import { ProductCategory } from 'src/app/common/product-category';
//import{ProductCategory} from 'src/app/common/product-category'

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[];
  constructor(private service:ProductmanagementServiceService ) { }

  ngOnInit(): void {
    this.listOfProducts()
  }
  listOfProducts(){
    this.service.getAllProducts().subscribe((data: Product[]) =>{
      console.log(data);
      this.products = data;
     
    })
  }
  
    }
    interface GetResponseProducts{
      _embedded :{
        products : Product[]
      }
    
    
    }

    interface GetResponseProductsCategory{
      _embedded :{
       productcategorys :ProductCategory[];
      }
     
     }
    


