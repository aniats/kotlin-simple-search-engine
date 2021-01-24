fun rangeMultiply(leftBorder: Long, rightBorder: Long): Long {
    if (leftBorder == rightBorder) {
        return leftBorder
    }
    var res = 1.toLong()
    for (i in leftBorder..rightBorder) {
        res *= i
    }
    return res
}
val lambda: (Long, Long) -> Long = { leftBorder, rightBorder -> rangeMultiply(leftBorder, rightBorder) }
