package bitub.bim.collab.model

import java.util.{Date, UUID}

case class Issue(id: ReferenceId,
				 title: String,
				 message: String,
				 reporter: Representative,
				 assignee: Option[Representative],
				 modifier: Option[Representative],
				 issueType: Option[IssueType],
				 issueTag: Option[IssueTag],
				 issueStage: Option[IssueStage],
				 issuePriority: Option[IssuePriority],
				 viewPoint: Seq[ViewPoint] = Nil,
				 comment: Seq[Comment] = Nil)

case class Representative(id: UUID,
						  email: String)

case class Comment(message: String,
				   date: Date,
				   owner: Representative)