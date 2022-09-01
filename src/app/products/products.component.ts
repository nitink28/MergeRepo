import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MyapiService } from '../myapi.service';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  prod:any;
  constructor(private productService:MyapiService,private router:Router) { }
usname:any;
ProductName:any;
prodid:any;
  ngOnInit(): void {
   this.usname=sessionStorage.getItem('userName');
    this.productService.getAllProducts().subscribe((data:any)=>
    {
        console.log(data);
        this.prod=data as Product;
        console.log(this.prod);
    })
  }
  loadproduct(prodid:any)
  {
    console.log(prodid);
    
    //this.productService.serachProductById(this.prodid).subscribe((data:any))=>{
      //this.prodid=data;
   // }
    localStorage.setItem("prodid",prodid);
    localStorage.setItem("regid",this.prod.price);
     
      
    this.router.navigate(['productdetails']);

  }
  // findproducts(ProductName:string){
  //   this.productService.serachProductByName(this.ProductName).subscribe((data:any)=>
  //   {
  //       console.log(data);
  //       this.prod=data;
  //       console.log(this.prod);
  //   },
    // (error)=>{
    //   console.log("Error occured",error)
    //   this.router.navigate(['/**'])

    // }
    //)


  }

 /* ALLproducts(){
    this.productService.subscribe((data:any)=>
    {
        console.log(data);
        this.prod=data;
        console.log(this.prod);
    },
    (error)=>{
      console.log("Error occured",error)
      this.router.navigate(['/**'])

    }
    )


  }*/

//}
