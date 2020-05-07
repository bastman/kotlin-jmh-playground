# kotlin-jmh-playground

status: messy, but seem to work - finally.

the trick is:

code to be benchmarked must be in src/jmh/kotlin !

see: 
- https://medium.com/@imanushin/jmh-how-to-md-9b5df8959874
- https://github.com/imanushin/use-performance-test
- https://www.baeldung.com/java-microbenchmark-harness

- https://github.com/skjolber/java-jwt-benchmark
- https://dev.to/o_a_e/jmh-with-gradle--from-easy-to-simple-52ec

```
$ ./gradlew jmh
```
