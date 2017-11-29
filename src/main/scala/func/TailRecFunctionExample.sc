// 递归函数 Recursive Function
// 递归函数在函数式编程是非常重要
// 是实现循环的一种技术
// 缺陷：在现代计算机架构体系中，函数的调用采用(堆栈)栈来实现
// 这就导致一但递归层次越深，栈的数量就越大，会引起栈溢出
// 优化：尾递归 Tail Recursive Function
// 尾递归函数即把所有的递归形式，都放到函数的末尾
// 当编译器检测到函数是一个尾递归的时候，它就会覆盖当前的栈状态
// 而不是去创建一个新的栈来保存下次函数调用的状态

// @annotation.tailrec是告诉scala的编译器这是一个尾递归函数
// m是一个垒乘器，保存它前面递归调用乘到的结果
// 在尾递归优化时，不需要开n个栈，只需要一个栈，再多一块内存m，用来存放当前面垒乘的结果
@annotation.tailrec
def factorial(n:Int, m:Int):Int =
  if(n <= 0) m
  else factorial(n-1, n*m)

factorial(5, 1) // res0: Int = 120