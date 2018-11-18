package bitub.bim.collab.model

import bitub.geometry._

case class ViewPoint(components: Seq[SharedComponent])

trait Camera {
	def origin: XYZ
	def up: Vector3
	def view: Vector3
}

case class PerspectiveCamera(origin: XYZ, up:Vector3, view:Vector3, fieldOfView:Double) extends Camera

case class OrthogonalCamera(origin: XYZ, up:Vector3, view:Vector3, scale:Double) extends Camera