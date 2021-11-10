fun solve_mumple(list:List<String>):Boolean{
    var prosses_index=0
    for(item in list){
        if (item=="mumble"){
            prosses_index++
        }
        else if(item!="mumble"){
            if(item.toInt()!=prosses_index+1)
                return false
            else
                prosses_index++

        }
    }
    return true
}
fun main(){
    readLine()
    val listofname:List<String> = readLine()!!.split(" ")
    if(solve_mumple(listofname))
        print("makes sense")
    else
        print("something is fishy")
}


