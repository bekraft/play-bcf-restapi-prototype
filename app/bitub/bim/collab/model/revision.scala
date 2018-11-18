package bitub.bim.collab.model

import java.util.UUID

trait RevId {
	def id: UUID
	def revision: Long
}

case class AccessGrant(id:UUID, name:String) extends RevId {
	private val _revision: Long = 0
	def revision = _revision
}

trait RevisionAccess {
	def access: Seq[AccessGrant] = Nil
}