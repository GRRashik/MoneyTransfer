const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VKPAY = "VK Pay"
val rubSymbol = '\u20BD'
val amount = 760000
val sumMoneyTranfersCoins = amount%100
val sumMoneyTranfersRub = (amount - sumMoneyTranfersCoins )/100
var transferSumCount = 0

fun main() {
    ifTypeCard("VK Pay", amount)
    transferSumCount()
    ifTypeCard("Maestro", amount)
    transferSumCount()
    ifTypeCard("Mastercard", amount)
    transferSumCount()
    ifTypeCard("Visa", amount)
    transferSumCount()
    ifTypeCard("Мир", amount)
    transferSumCount

}
fun ifTypeCard(
    type: String,
    amount: Int): Int {
    val result = when (type){
        MASTERCARD -> transferMastercad(amount)
        MAESTRO -> transferMaestro(amount)
        VISA -> transferVisa(amount)
        MIR -> transferMir(amount)
        VKPAY -> transferVkPay(amount)
        else ->0
    }
    return result
    transferSumCount+=amount
}

fun transferSumCount(){
    val transferSumCountCoins = transferSumCount%100
    val transferSumCountRub = (transferSumCount - transferSumCountCoins)/100
    println("Общая сумма переводов $transferSumCountRub $rubSymbol $transferSumCountCoins коп.")

}

fun transferVkPay(amount: Int): Int {
    val result = amount
    println("Сумма перевода на счет VK Pay  составит - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
    println("Коммисия взыматься не будет")
    return result
}


fun transferMastercad(amount: Int): Int {
    val commission = Math.round(amount * 0.006) + 2000
    when {
        amount <= 7500000 -> {
            val result = amount + 0
            println("Сумма перевода с карты Mastercard составит - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println("Коммисия взыматься не будет")
            return result


        } else -> {
            val result = amount + commission
            val commissionCoins = commission % 100
            val commissionRub = (commission - commissionCoins) / 100
            println("Сумма перевода с карты Mastercard составит  - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println("Коммисия за перевод $commissionRub $rubSymbol $commissionCoins коп.")
            return result.toInt()
        }
    }
}

fun transferMaestro(amount: Int): Int {
    val commission = Math.round(amount * 0.006) + 2000
    when {
        amount <= 7500000 -> {
            val result = amount + 0
            println("Сумма перевода с карты Maestro составит - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println("Коммисия взыматься не будет")
            return result


        } else -> {
         val result = amount + commission
         val commissionCoins = commission % 100
         val commissionRub = (commission - commissionCoins) / 100
         println("Сумма перевода с карты Maestro составит  - $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
         println("Коммисия за перевод $commissionRub $rubSymbol $commissionCoins коп.")
         return result.toInt()
        }
    }
}

fun transferVisa(amount: Int): Int {
    val commission = Math.round(amount * 0.0075)
    when {
        commission <= 3500 -> {
            val result = amount + 3500
            println("Сумма перевода с карты Visa составит $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println("Коммисия за перевод  35 $rubSymbol 00 коп.")
            return result
        }
        else -> {
            val result = amount + commission
            val commissionCoins = commission % 100
            val commissionRub = (commission - commissionCoins) / 100
            println("Сумма перевода с карты Visa составит $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
            println("Коммисия за переод $commissionRub $rubSymbol $commissionCoins коп.")
            return result.toInt()
        }
    }
}

fun transferMir(amount: Int): Int {
        val commission = Math.round(amount * 0.0075)
        when {
            commission <= 3500 -> {
                val result = amount + 3500
                println("Сумма перевода с карты Мир составит $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
                println("Коммисия за перевод  35 $rubSymbol 00 коп.")
                return result
            }
            else -> {
                val result = amount + commission
                val commissionCoins = commission % 100
                val commissionRub = (commission - commissionCoins) / 100
                println("Сумма перевода с карты Мир составит $sumMoneyTranfersRub $rubSymbol $sumMoneyTranfersCoins коп.")
                println("Коммисия за переод $commissionRub $rubSymbol $commissionCoins коп.")
                return result.toInt()
            }
        }
    }

