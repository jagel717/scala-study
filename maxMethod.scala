class sample {
def max(x:Int, y:Int):Int = {
  if (x > y) x
  else y
  }
}

val sample = new sample
val x = 4
val y = 2
println(sample.max(x, y))
