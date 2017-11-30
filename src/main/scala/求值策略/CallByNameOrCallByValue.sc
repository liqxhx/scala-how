// Call By Value 对函数实参进行求值，且仅求值一次，再将求得到值传入函数，直接替换函数中的形式参数
// Call By Name 不会对函数的实参进行表达式的求值，用表达式直接替换函数体内的形参，然后在函数体内每次使用到这个表达式时再进行求值
// 通过使用Call By Value
// Call By Name的申明方式为：函数形参类型以 => 开头

def test1(x: Int, y: Int) = x * x
def test2(x: => Int, y: => Int) = x * x

// test1(7, 8)
// 7 * 7
// 49
test1(3+4, 8)

// test2(3+4, 8)
// (3+4) * (3+4)
// 7 * (3+4)
// 7 * 7
// 49
test2(3+4, 8)

def foo(x: Int, y: => Int): Int = x
def loop():Int = loop

foo(1, loop)

//foo(loop, 1) // 死循环