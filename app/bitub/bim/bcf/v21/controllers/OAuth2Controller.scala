package bitub.bim.bcf.v21.controllers

import bitub.bim.bcf.VersionResponse
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.{ExecutionContext, Future}

class OAuth2Controller @Inject()(components: ControllerComponents)(implicit ec: ExecutionContext)
		extends AbstractController(components) {

	case class OAuth2Details(oauth2_auth_url: String,
							 oauth2_token_url: String,
							 http_basic_supported: Boolean,
							 supported_oauth2_flows: Seq[String])

	implicit val oauth2DetailsFormat = Json.format[OAuth2Details]

	def details = Action.async { implicit request =>
		Future( Ok(Json.toJson(
			OAuth2Details(
				"/oauth2/access_token",
				"/oauth2/access_token",
				true,
				Seq(
					"authorization_code_grant",
					"implicit_grant",
					"resource_owner_password_credentials_grant"
				)
			))))
	}
}
