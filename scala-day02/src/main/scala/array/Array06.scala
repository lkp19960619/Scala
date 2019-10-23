package array

object Array06 {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](10,15,2,34,58,14,36,20,64,47,87)

    for (i<- 0 until arr.length;j<-i until arr.length if arr(i) > arr(j)){
      var tmp = arr(i)
      arr(i) = arr(j)
      arr(j) = tmp
    }
    for (i<- 0 until arr.length){
      print(arr(i)+" ")
    }
  }

}
