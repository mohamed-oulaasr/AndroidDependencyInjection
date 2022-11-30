package com.app.exemple



class Shape (val rectangle: Rectangle, val circle: Circle, val square: Square) {  // Dependency Injection

    // Dependency construction
//    var rectangle: Rectangle
//    var circle: Circle
//    var square: Square

    // Dependency usage
//    init {
//        rectangle = Rectangle()
//        circle = Circle()
//        square = Square()
//    }

    fun draw() {
        println("Drawing now...")
    }


}