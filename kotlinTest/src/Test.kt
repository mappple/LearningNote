class Test {

    data class NumArray(val name: String, val values: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as NumArray

            if (name != other.name) return false
            if (!values.contentEquals(other.values)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + values.contentHashCode()
            return result
        }
    }


}

fun main() {
    val n1 = Test.NumArray("1", intArrayOf(1, 2, 3, 4))
    val n2 = Test.NumArray("1", intArrayOf(1, 2, 3, 4))
    val result = n1==n2
    println("result=$result")
}