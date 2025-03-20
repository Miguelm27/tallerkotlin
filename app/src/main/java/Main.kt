class Estudiante(var nombre:String, var codigo:Any, var edad:Int){
    fun informacion(){
        println("nombre: $nombre, codigo: $codigo, edad: $edad")
    }
}
var listaEstu = ArrayList<Estudiante>()

fun  agregarEstudiante(nombre: String, codigo: Any, edad: Int) {
    listaEstu.add(Estudiante(nombre, codigo, edad))
}

fun  mostrarEstudiantes() {
    for (estudiante in listaEstu) {
        estudiante.informacion()
    }
}

fun main() {
    agregarEstudiante("Miguel", 123, 20)
    agregarEstudiante("Pepe", "uno", 21)
    mostrarEstudiantes()
}


