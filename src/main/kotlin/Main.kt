fun main(args: Array<String>) {

    //Student().name

    Student().also {student ->
        student.name=""
    }

    Student().apply {
     //   name.length
    }

    Student().let {
    //   it.name
        println("Hellow")
        "hellow"
    }

   val h = Student().let {
        //   it.name
        println("Hellow")
        "hellow"
    }
    println(h)


    val i = Student().run {
        name=""
        println("This is i")
        true
    }



}

class  Student(){
    var name:String = "Habib"
}