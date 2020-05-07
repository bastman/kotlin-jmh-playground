package com.example


import org.openjdk.jmh.annotations.Benchmark
import java.util.*

class JwtVerifyBenchmark {

    @Benchmark
    fun foo() {
        UUID.randomUUID()
    }
}
/*
class BenchMark {
    @State(Scope.Benchmark)
    class ExecutionPlan {
        @Param("100", "200", "300", "500", "1000")
        var iterations = 0
        //var murmur3: Hasher? = null
        //var password = "4v3rys3kur3p455w0rd"

        @Setup(Level.Invocation)
        fun setUp() {
            //murmur3 = Hashing.murmur3_128().newHasher()
        }
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 5)
    fun benchMurmur3_128(plan: ExecutionPlan) {
        for (i in plan.iterations downTo 1) {
            //plan.murmur3.putString(plan.password, Charset.defaultCharset())
            println(i)
        }
        //plan.murmur3.hash()
        println("x")
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @BenchmarkMode(Mode.Throughput)
    fun init() {
        // Do nothing
    }
}
*/
