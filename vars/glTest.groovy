import com.library.Test

def call(Map<String, Object> config){
  println "${config}"
  Test test = new Test(this)
  test.mapExample(config)
}
