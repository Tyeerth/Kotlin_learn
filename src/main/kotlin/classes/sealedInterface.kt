package classes

/**
 * @Author tyeerth
 * @Date 2025/6/5 23:22
 *
 * @Description 密封接口 = 接口+枚举
 */
fun main(){
    handlePlayer(PlayerType1())
}
fun handlePlayer(player: Weapon){
    when(player){
        is PlayerType1 -> TODO()
        is PlayerType2 -> TODO()
        is PlayerType3 -> TODO()
        is PlayerType4 -> TODO()
    }
}
sealed interface Health{}
sealed interface Weapon{}
class PlayerType1: Health,Weapon
class PlayerType2: Health,Weapon
class PlayerType3: Health,Weapon
class PlayerType4: Health,Weapon