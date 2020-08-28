import java.util.*
import kotlin.math.ceil
fun main() {

    val inputUser = Scanner(System.`in`);

    println("==================================")
    print("NAMA : ")
    val nama = inputUser.nextLine()

    print("KELAS : ")
    val kelas = inputUser.nextLine()

    print("NO.ABSEN : ")
    val absen = inputUser.nextInt()
    println("==================================")

    //Class Bangun Ruang
    val balok = Balok()
    val bola = Bola()

    println("HITUNG VOLUME BANGUN RUANG")
    println("1. Volume Balok")
    println("2. Volume Bola")
    print("Pilih Menu Anda : ")
    when {
        inputUser.nextInt() == 1 -> {

            //Volum Balok
            println("==================================")
            println("Hitung Volume Balok")
            print("Panjang Balok : ")
            balok.panjang = inputUser.nextFloat()
            print("Lebar Balok : ")
            balok.lebar = inputUser.nextFloat()
            print("Tinggi Balok : ")
            balok.tinggi = inputUser.nextFloat()
            println("Jadi Volume Balok Tersebut Yaitu: ")
            println("Jika Diketahui : \n Panjang ${balok.panjang} \n Lebar ${balok.lebar} \n Tinggi ${balok.tinggi}")


            //Hasilnya
            val vBalok = volumeBalok(balok.panjang!!, balok.lebar!!, balok.tinggi!!)
            val volumeBulatkan = ceil(vBalok)
            println("Jawab : Jadi volume baloknya "
                    + String.format("%.2f", vBalok )
                    + "\n Dan hasil dari volume balok setelah dibulatkan yaitu $volumeBulatkan")
            println("==================================")

            println("Kembali ke menu awal [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                println("Press Enter Key To Exit")
            }
        }
        inputUser.nextInt() == 2 -> {

            //Volum Bola
            println("==================================")
            println("Hitung Volume Bola")
            print("Jari jari Bola : ")
            bola.jariJari = inputUser.nextFloat()
            println("Jadi Volume Bola Tersebut Yaitu : ")
            println("Jika Diketahui : \n Jari-jari ${bola.jariJari}")

            //Hasilnya
            val vBola = volumeBola(bola.jariJari!!)
            val volumeBulatkan = ceil(vBola)
            println("Jawab : \n Jadi volume bolanya "
                    + String.format("%.2f", vBola )
                    + " Dan hasil volume bola setelah dibulatkan yaitu $volumeBulatkan")
            println("==================================")

            println("Kembali ke menu awal [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                println("Press Enter Key To Exit")
            }
            
            }

        }
    }

fun volumeBalok(p : Float, l : Float, t : Float) : Float{
    return (p * l * t )
}
fun volumeBola(r : Float) : Double {
    return (Math.PI * 4/3 * r * r * r)
}
class Balok {
    var panjang : Float? = null
    var lebar : Float? = null
    var tinggi : Float? = null
}
class Bola {
    var jariJari : Float? = null
}

