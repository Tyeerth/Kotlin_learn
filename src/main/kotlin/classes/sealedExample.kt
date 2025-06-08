package classes

/**
 * @Author tyeerth
 * @Date 2025/6/5 23:03
 *
 * @Description 密封类= 抽象类 + 枚举
 */
sealed class MainIntent{
    data class Login(val username:String,val password:String):MainIntent()//继承父类
    object Logout:MainIntent()
}
fun handleIntent(intent:MainIntent){
    when(intent){
        is MainIntent.Login -> println("登录")
        is MainIntent.Logout -> println("登出")
    }
}
fun main() {
    handleIntent(MainIntent.Login("tyeerth","123456"))
    handleIntent(MainIntent.Logout)
}
