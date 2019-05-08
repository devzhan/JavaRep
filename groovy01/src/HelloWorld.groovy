3.times {
    println("hello world")
}
println("徐家棚")
def name = "xujiapeng"
println(name)
name = 'huzhiqiang'
println(name)
a= 1;
println(a.class)
def list = [1,2,3]
println(list.size())
def getOdd(n) {
    for (i in 1..n) {
        if (i % 2 == 0)
            println i
    }
}

getOdd(10)
def x=2

def string1= 'price $x'
println(string1)
def string2= "price $x"
println(string2)
def  testClosure(int a1,String b1, Closure closure){
    //do something
    closure() // 调用闭包
}
testClosure (4, "test", {
    println "i am in closure"
} )  // 红色的括号可以不写..


//public static <T> List<T> each(List<T> self, Closure closure)
def iamList = [1,2,3,4,5]  // 定义一个 List
iamList.each{  // 调用它的 each，这段代码的格式看不懂了吧？each 是个函数，圆括号去哪了？
    println it
}


doLast({
    println 'Hello world!'
})
