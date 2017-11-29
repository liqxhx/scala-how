// 柯里化
// 柯里化函数 Curried Function
// 把具有多个参数的函数转换为一条函数链，第个节点上是单一参数

// 常规函数定义
def add(x:Int, y:Int):Int = x+y
// 下是scala中柯里化的语法：单个参数用括号括起来
def curriedAdd(x:Int)(y:Int):Int = x+y

curriedAdd(2)(2) // res0: Int = 4

// _通a配后面所有参数列表，这里通配b
val addOne = curriedAdd(1)_ //addOne: Int => Int = <function1>
addOne(2) // res1: Int = 3

