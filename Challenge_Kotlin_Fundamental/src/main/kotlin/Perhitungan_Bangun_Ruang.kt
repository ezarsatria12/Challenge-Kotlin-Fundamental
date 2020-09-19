import java.util.*

public var input = Scanner(System.`in`);

fun main() {
    println("============Identitas===============");
    print("Nama : ");
    var n: String? = input.nextLine();

    //input validation nama wajib di isi
    if (n.isNullOrEmpty()){
        println("Nama wajib di isi")
        main()
    }

    print("Kelas : ");
    var k: String = input.nextLine();
    print("Nomor Absen : ")
    var na: String = input.nextLine();
    print("Masukan email : ")

    //elvis operator
    val email:String? = null
    val emailLength = email?.length ?:"Ups Saya lupa memberi program input untuk email"
    println(emailLength)
    println("====================================");
    menu()

}

// menu pemlihan opsi
fun menu(){
    println("================Menu================");
    println("1. Kerucut\n2. Tabung\n9. to exit")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        9 -> exit()
        else -> {
            println("Opps tidak ada")
            menu()
        }
    }
}


fun kerucut(){
    println("============Kerucut===============");
    print("Masukan Tinggi Kerucut : ");
    val tinggi:Double = input.nextDouble();
    print("Masukan Tabung Kerucut : ");
    val radius:Double = input.nextDouble();

    //perhitungan
    val volume:Double = (0.33333) * Math.PI * (radius*radius) * tinggi;
    println ("Volume Kerucut Adalah $volume")
    //pembulatan 2 angka belakang
    //saat menggunakan print ala kotlin error tetapi saat nganggunakan print dari java berhasil
    System.out.printf("%.2f",volume)
    println()
    //back to menu
    menu()
    println("=================================");
}

fun tabung(){
    println("============Tabung===============");
    print("Masukan Tinggi tabung : ");
    var tinggi:Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var radius:Double? = null
    radius = input.nextDouble();

    val volume = Math.PI * radius * radius * tinggi
    println("Volume Tabung adalah : $volume")
    //pembulatan 2 angka belakang
    System.out.printf("%.2f",volume)
    println()
    //back to menu
    menu()
}
fun exit(){
    System.exit(0)
}
