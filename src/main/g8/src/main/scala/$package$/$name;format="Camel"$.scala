package $package$

import org.rogach.scallop._
import com.typesafe.scalalogging.StrictLogging

object $name;format="Camel"$ extends App with StrictLogging {

  object Args extends ScallopConf(args) {
    val param = opt[String]("param", default=Some("default"), descr="This is an example parameter")
    val trailing = trailArg[List[String]]("trailing", required=false, default=Some(Nil), descr="An optional trailing argument.")
    verify()
  }

  logger.info(s"The parameter was: \${Args.param()}, trailing args: \${Args.trailing()}")
  println("""$name$ awaits your orders. Usage:""")
  Args.printHelp
}