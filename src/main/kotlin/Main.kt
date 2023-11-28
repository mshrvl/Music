fun main() {
    val totalPrice = 10001.0
    var discount = 0.0
    val alwaysCust = true
    var extraDisc = 0.01

    if (totalPrice >= 1001 && totalPrice <= 10000) {
        discount = 100.0
    } else if (totalPrice >= 10001) {
        discount = totalPrice * 0.05
    }

    if (alwaysCust) {
        discount += totalPrice * extraDisc
    }

    val finalPrice = totalPrice - discount
    println(finalPrice)
}
