package bitub.geometry

trait Vector {
	val dim: Int

	def v: Seq[Double]
}

case class XYZ(x: Double, y: Double, z: Double) extends Vector {
	val dim = 3

	override def v: Seq[Double] = Seq(x, y, z)
}

case class Vector3(dx: Double, dy: Double, dz: Double) extends Vector {
	val dim = 3

	override def v: Seq[Double] = Seq(dx, dy, dz)
}

case class Plane3(xyz: XYZ, n: Vector3)