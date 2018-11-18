package bitub.bim.bcf

import javax.inject.Inject
import play.api.libs.json._
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.{ExecutionContext, Future}

class PublicController @Inject()(components: ControllerComponents)(implicit ec: ExecutionContext)
		extends AbstractController(components) {

	case class Version(version_id: String, detailed_version: String)

	case class VersionResponse(versions: Seq[Version])

	implicit val versionFormat = Json.format[Version]
	implicit val infoFormat = Json.format[VersionResponse]

	val bcfApiVersions = Seq(
		Version("2.1", "https://github.com/BuildingSMART/BCF-API")
	)

	def versions = Action.async { implicit request =>
		Future(Ok(Json.toJson(VersionResponse(bcfApiVersions))))
	}
}
