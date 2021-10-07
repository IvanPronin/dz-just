const val USER_1 = "Alex"
const val USER_2 = "Вася"
const val USER_3 = "Женя :)"
const val USER_4 = "Олег"
const val USER_5 = "Аркадий"
const val USER_6 = "Crazy frog"

fun main() {
    print(agoText(3480))
}

fun toHours(seconds: Int): Int {
    return seconds / 3600
}

fun toMinutes(seconds: Int): Int {
    return seconds / 60
}

fun minutesText(seconds: Int): String {
    var minutes = toMinutes(seconds)
    return when (minutes) {
        1, 21, 31, 41, 51 -> "$minutes минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "$minutes минуты назад"
        else -> "$minutes минут назад"
    }
}

fun hoursText(seconds: Int): String {
    var hours = toHours(seconds)
    return when (hours) {
        1, 21 -> "$hours час назад"
        2, 3, 4, 22 -> "$hours часа назад"
        else -> "$hours часов назад"
    }
}

fun agoText(seconds: Int): String {
    return when (seconds) {
        in 0..60 -> "$USER_1 \nбыл(а) только что"
        in 61..3600 -> "$USER_2 \nбыл(а) " + minutesText(seconds)
        in 3601..86400 -> "$USER_3 \nбыл(а) в сети " + hoursText(seconds)
        in 86401..172800 -> "$USER_4 \nбыла(а) сегодня"
        in 172801..259200 -> "$USER_5 \nбыл(а) вчера"
        else -> "$USER_6 \nбыл(а) давно"
    }

}



