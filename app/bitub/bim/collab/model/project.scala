package bitub.bim.collab.model

import java.util.UUID

case class ReferenceId(id: UUID, external: Option[String] = None)

case class IssueProject(id: ReferenceId, name: String, issues: Seq[Issue] = Nil)
