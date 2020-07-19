object caeserCipher extends App{

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

var s="MY NAME IS CHAMODHI DEWWANDI"

val E=(c:Char,key:Int,a:String) => if(c==' ') ' ' else a((a.indexOf(c.toUpper)+key)%a.size)

val D=(c:Char,key:Int,a:String) => if(c==' ') ' ' else a(if(((a.indexOf(c.toUpper)-key)%a.size)<0) 26+(a.indexOf(c.toUpper)-key)%a.size else (a.indexOf(c.toUpper)-key)%a.size )

val cipher=(algo:(Char,Int,String) => Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

val ct=cipher(E,s,5,alphabet)

val pt=cipher(D,ct,5,alphabet)

println("Message : "+s)

println("Encrypted message : "+ct)

println("Decrypted message : "+pt)
}