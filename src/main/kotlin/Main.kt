val rubSymbol = '\u20BD'
val amount = 46999
val commission = Math.round(amount * 0.075)

fun main() {

    val sumMoneyTranfersCoins = amount%100
    val sumMoneyTranfersRub = (amount - sumMoneyTranfersCoins )/100
    println(" Сумма перевода $sumMoneyTranfersRub.$sumMoneyTranfersCoins $rubSymbol")

    val commissionCoins = commission%100
    val commissionRub = (commission - commissionCoins)/100
    if (commissionRub>=35) {
        println(" Коммисия за переод $commissionRub.$commissionCoins $rubSymbol")
    } else {
        println(" Коммисия за перевод 35.0 $rubSymbol")
    }
}