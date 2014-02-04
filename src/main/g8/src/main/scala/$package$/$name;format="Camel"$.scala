package $package$

import org.rogach.scallop._
import com.typesafe.scalalogging.slf4j.Logging

object $name;format="Camel"$ extends App with Logging {

  object Args extends ScallopConf(args) {
    val param = opt[String]("param", default=Some("default"), descr="This is an example parameter")
    val trailing = trailArg[List[String]]("trailing", required=false, default=Some(Nil), descr="An optional trailing argument.")
  }

  logger.info(s"The parameter was: \${Args.param()}, trailing args: \${Args.trailing()}")
  println("""$name$ awaits your orders. Usage:""")
  Args.printHelp
}