package bitub.bim.collab.model

case class IssueType(name: String) extends AnyVal

object IssueType {
	val Comment = IssueType("Comment")
	val Issue = IssueType("Issue")
	val Request = IssueType("Request")
	val Solution = IssueType("Solution")
	val Clash = IssueType("Clash")
	val Deficiency = IssueType("Deficiency")
	val defaults = Seq(Comment, Issue, Request, Solution, Clash, Deficiency)
}

case class IssueStatus(name: String) extends AnyVal

object IssueStatus {
	val Open = IssueStatus("Open")
	val Closed = IssueStatus("Closed")
	val InProgress = IssueStatus("In Progress")
	val ReOpened = IssueStatus("ReOpened")
	val defaults = Seq(Open, InProgress, Closed, ReOpened)
}

case class IssueTag(name:String) extends AnyVal

object IssueTag {
	val Architecture = IssueTag("Architecture")
	val Structure = IssueTag("Structure")
	val Mechanical = IssueTag("Mechanical")
	val defaults = Seq(Architecture, Structure, Mechanical)
}

case class IssuePriority(name:String) extends AnyVal

object IssuePriority {
	val Low = IssuePriority("Low")
	val Medium = IssuePriority("Medium")
	val High = IssuePriority("High")
	val defaults = Seq(Low, Medium, High)
}

case class IssueStage(name:String) extends AnyVal

object IssueStage {
	val Preliminary = IssueStage("Preliminary")
	val Design = IssueStage("Design")
	val defaults = Seq(Preliminary, Design)
}