package julio.com.br.kotlinbasicsoreilly.basics.stdlib

import java.security.Permission

/**
 * Created by Shido on 25/06/2017.
 */
class DirectoryExplorer(val user: String){

    inner class PermissionCheck(){
        fun  validatePermission() {
            if(user.equals("dsadsd")){
                print("OK")
            }
        }

    }
    fun listFolder(folder: String, user: String){
        val  permissionCheck= PermissionCheck()
            permissionCheck.validatePermission()
    }
}


fun main(args: Array<String>) {
    val de = DirectoryExplorer("dhasdh")
    de.listFolder("","")
    val pc = DirectoryExplorer("shido").PermissionCheck() //Com inner class ele é acessado como parte da instancia da classe

}