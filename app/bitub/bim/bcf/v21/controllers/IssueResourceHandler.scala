package bitub.bim.bcf.v21.controllers

import bitub.bim.collab.model.IssueProject
import bitub.bim.collab.store.IssueRepository
import javax.inject.Inject

import scala.concurrent.{ExecutionContext, Future}

class IssueResourceHandler @Inject()
	(repository: IssueRepository)(implicit ec:ExecutionContext) {

	def create(project:IssueProject): Future[IssueProject] = ???
}
