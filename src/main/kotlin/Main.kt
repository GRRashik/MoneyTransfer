const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VKPAY = "VK Pay"
val rubSymbol = '\u20BD'
val amount = 64635
val sumMoneyTranfersCoins = amount%100
val sumMoneyTranfersRub = (amount - sumMoneyTranfersCoins )/100
var transferSumCount = 0

fun main() {


    ifTypeCard("VK Pay")
    transferSumCount()
    ifTypeCard("Mastercard")
    transferSumCount()

}
fun ifTypeCard(type: String){
    val result = when (type){
        MASTERCARD -> transferMastercadAndMaestro()
        MAESTRO -> transferMastercadAndMaestro()
        VISA -> transferVisaAndMir()
        MIR -> transferVisaAndMir()
        VKPAY -> transferVkPay()
        else ->0
    }
    transferSumCount+=amount
}

fun transferSumCount(){
    val transferSumCountCoins = transferSumCount%100
    val transferSumCountRub = (transferSumCount - transferSumCountCoins)/100
    println("Общая сумма переводов $transferSumCountRub $rubSymbol $transferSumCountCoins коп.")

}

fun transferVkPay(){
    println(" Сумма перевода на счет VK Pay  составит - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
    println(" Коммисия взыматься не будет")
}


fun transferMastercadAndMaestro(){
    when {
        sumMoneyTranfersRub <= 75000 -> {
            println(" Сумма перевода с карты Mastercard & Maestro составит - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println(" Коммисия взыматься не будет")
        }
        sumMoneyTranfersRub > 75000 -> {
            val commission = Math.round(amount * 0.006) + 2000
            val commissionCoins = commission%100
            val commissionRub = (commission - commissionCoins)/100
            println(" Сумма перевода с карты Mastercard & Maestro составит  - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println(" Коммисия за перевод $commissionRub $rubSymbol $commissionCoins коп.")
        }
    }
}

fun transferVisaAndMir(){
    val commission = Math.round(amount * 0.0075)
    when {
        commission <= 3500 -> {

            println(" Сумма перевода с карты Visa & Мир составит $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println(" Коммисия за перевод  35 $rubSymbol 00 коп.")
        }
        else ->{
            val commissionCoins = commission%100
            val commissionRub = (commission - commissionCoins)/100
            println(" Сумма перевода с карты Visa & Мир составит $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println(" Коммисия за переод $commissionRub $rubSymbol $commissionCoins коп.")
        }
    }
}
