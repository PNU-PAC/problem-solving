import java.util.HashMap
import java.util.stream.Collectors
import java.util.Arrays

class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var hm:HashMap<String, Int> = HashMap()
        for(cloth in clothes) hm.put(cloth[1], hm.getOrDefault(cloth[1], 0) + 1)
        val quantities:MutableList<Int> = hm.values.stream().collect(Collectors.toList())
        var answer = 1
        for(quantity in quantities) answer *= quantity + 1
        answer -= 1
        return answer
    }
}

fun main(args: Array<String>){
  var clothes:Array<Array<String>> = arrayOf(
  	arrayOf("yellowhat", "headgear"),
  	arrayOf("bluesunglasses", "eyewear"),
    arrayOf("green_turban", "headgear")
  )
  val sol:Solution = Solution()
  println(sol.solution(clothes))
}
