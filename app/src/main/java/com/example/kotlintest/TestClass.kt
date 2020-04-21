package com.example.kotlintest

open class BaseTestClass constructor(TestVaraible:String)
{
    constructor() : this("test")

    var testString:String = ""

    init
    {
        testString = TestVaraible
    }
}


class TestClass : BaseTestClass()
{

}


data class DataClass(var string: String)
{

}

interface TestInterface
{
    fun Test(str:String)
}

class Test<T>(t: T) : TestInterface
{
    override fun Test(str: String)
    {
        TODO("Not yet implemented")
    }
}