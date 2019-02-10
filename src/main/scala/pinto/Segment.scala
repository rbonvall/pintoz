package pintoz

final case class Segment(from: Point, to: Point) {
  def length = from distTo to
  def reverse = Segment(to, from)
  def sameAs(that: Segment) = this == that || reverse == that
  def mid = (from + to) * 0.5
  def isVertical   = from.x == to.x
  def isHorizontal = from.y == to.y


}
