import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MyapiService } from '../myapi.service';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

  phone: string;
  otp: number;
  newotp:number;
  validotp: boolean = true;
  validphone: boolean = false;
  mail:string;
  
  constructor(private userservice: MyapiService,private router: Router) {}
  ngOnInit(): void {
    let isUser;
   }

  getOTP(){
    // this.userservice.sendMail(this.maildetail)._subscribe((data:any))=>{

    // }
    this.userservice.checkUserExists(this.phone).subscribe((data:any)=>{
      this.validphone = data;
      console.log(data)
     
      console.log(this.validphone);
      if(this.validphone==false){
        this.validphone=false;
        alert("Username doesn't exist!")
     
      }else{
      this.newotp=Math.floor(Math.random()*10000);
      alert("Your OTP is "+this.newotp);
      }
    })
  }
  onSubmit() {
    
    console.log(this.phone)
    if (this.otp !==this.newotp) {
      this.validotp = false;
    }
    else {
      this.router.navigate(['/changepassLink']);
    }
  }


}