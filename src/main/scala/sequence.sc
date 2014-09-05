import scala.concurrent.{ExecutionContext, Future}
import scalaz.Scalaz._

implicit val gl = ExecutionContext.global

def sequence[T](x: List[Future[T]]): Future[List[T]] = {
  if (x == Nil) Future(Nil)
  else x.head.flatMap(a => sequence(x.tail).map(a :: _))
}

val l = List(some(1), some(2))

l.sequence