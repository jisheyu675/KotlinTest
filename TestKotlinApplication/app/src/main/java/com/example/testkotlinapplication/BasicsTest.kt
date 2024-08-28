package com.example.testkotlinapplication

class BasicsTest {

    fun variable(){
        //val 常量 只读
        //var 变量 可写

        val a = 1
        var b = 1
//        a++
        b++
        "abc".firstChar();
    }
    private fun String.firstChar():String{
        if (this.isEmpty()){
            return ""
        }
        return this[0].toString()
    }

    fun test001(){

        //安全调用符 ?.
        var a:String? = "abc"

        a = null
        a?.length

        //== 值相等
        // ==== 引用相等

    }


}