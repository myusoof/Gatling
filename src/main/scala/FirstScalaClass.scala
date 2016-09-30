import java.text.DateFormat
import java.util.{Locale, Date}
import javax.security.auth.callback.Callback

/**
  * Created by yusoof on 30/9/16.
  */
object FirstScalaClass {
  def main(args: Array[String]) {
    val now = new Date
    val df = DateFormat.getDateInstance(3, Locale.FRANCE)
    println(df format now)
    println((1).+(2).*(3))
    oncePerSecond(()=>println("testing"))
  }
    def oncePerSecond(callback: () =>Unit){
      while(true){callback(); Thread.sleep(1000)}
    }
}
