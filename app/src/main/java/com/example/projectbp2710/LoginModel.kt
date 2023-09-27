package com.example.projectbp2710

class LoginModel {
    var Username = ""
    var Password = ""

    fun loginCek():Boolean{
        if (Username.equals("Adi Nugroho")&& Password.equals("admin")){
            return true
        }else{
            return false
        }
    }
}