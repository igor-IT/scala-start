package start_scala.case_class.lab

object LoginValidator {
  def main(args: Array[String]): Unit = {
    val login = NewLogin(username = "Mia",password = "11Qqq",confirmPassword = "11Qqq")
    val result = validateNew(login)
    println(result)
  }
  def validateNew(login:NewLogin):String = {
    val res:String = login match {
      case NewLogin("admin",_,_)  =>"Username can't be Admin"
      case NewLogin(_,pass,_) if pass.contains("z") =>s"Wrong password you can't use Z - ${pass}"
      case NewLogin(us,pa,_) if us == pa => s"Username can't be equal password - ${us}"
      case NewLogin(_,pass,_) if pass.forall(_.isDigit) =>"Password can't contains only digits"
      case NewLogin(_,ps,cps) if cps != ps =>"Password should be equal Confirm Password"
      case _ =>"Login is OK"
    }
    res
  }
  def validate(login:NewLogin):Unit ={
    if (login.username == "admin"){
      println("Username can't be Admin")
    } else if(login.password.contains("z")){
      println("Wrong password you can't use Z - "+login.password)
    } else if(login.password == login.username){
      println("Username can't be equal password")
    }else if(login.password.exists(_.isDigit)){
      println("Password can't contains only digits")
    }else if(login.confirmPassword!=(login.password)){
      println("Password should be equal Confirm Password")
    }
  }

}
