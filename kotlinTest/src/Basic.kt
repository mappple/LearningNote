import java.lang.reflect.Field

/**
 * https://www.jianshu.com/p/cc65e88d86ce
 */
class Basic {

    /**
     * with函数和前面的几个函数使用方式略有不同，因为它不是以扩展的形式存在的。
     * 它是将某对象作为函数的参数，在函数块内可以通过 this 指代该对象。
     * 返回值为函数块的最后一行或指定return表达式。
     */
    fun testWith() {
        val test = "test"
        val res = with(test) {
            println(length)
            1000
        }
        println(res)

        test.length
        test.toBigDecimal()
        //转换为
        with(test) {
            length
            toBigDecimal()
        }
    }

    /**
     * let和with两个函数的结合体，run函数只接收一个lambda函数为参数，以闭包形式返回，
     * 返回值为最后一行的值或者指定的return的表达式。
     */
    fun testRun() {
        val user = User("Kotlin", 1, "111111")
        val res = user.run {
            println("my name is $name, my age is $age, my desc is $desc")
            2000
        }
        println(res)
    }

    /**
     * 从结构上来看apply函数和run函数很像，唯一不同点就是它们各自返回的值不一样。
     * run函数是以闭包形式返回最后一行代码的值，而apply函数的返回的是传入对象的本身。
     */
    fun testApply() {
        val test = "test"
        val res = test.apply {
            println(123)
        }
        println(res)
    }

    /**
     * let扩展函数的实际上是一个作用域函数，当你需要去定义一个变量在一个特定的作用域范围内，let函数的是一个不错的选择；
     * let函数另一个作用就是可以避免写一些判断null的操作。
     */
    fun testLet() {
        val test = "test"
        val res = test.let {
            println(123)
        }
        println(res)
        test?.let {
            it.indexOf('1', 0)
        }

        test?.toSet()
        test?.toBigDecimal()
        //转换为
        test?.let {
            it.toSet()
            it.toBigDecimal()
        }
    }

    /**
     * also函数的结构实际上和let很像唯一的区别就是返回值的不一样。
     * let是以闭包的形式返回，返回函数体内最后一行的值，如果最后一行为空就返回一个Unit类型的默认值。
     * 而also函数返回的则是传入对象的本身。
     */
    fun testAlso() {
        val test = "test"
        val res = test.also {
            println(123)
        }
        println(res)
    }

    fun testByLazy() {
        val test: Field by lazy {
            requireNotNull(String::class.java.getDeclaredField("lalala")) {
                "No constructor arguments field found in LayoutInflater!"
            }.apply {
                isAccessible = true
            }
        }
        println(test)
    }
}

fun main() {
    Basic().testByLazy()
}

