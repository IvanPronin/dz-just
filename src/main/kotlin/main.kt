fun main() {
    var second = 60

    if(second <= 60) {
        println("был(а) только что")
    } else if (second == 61 || second <= 60 * 60) {
        println("был(а) $second минут назад")
    } else if (second == 60 * 60 + 1 || second <= 24 * 60 * 60) {
        println("был(а) $second часов назад")
    }
}