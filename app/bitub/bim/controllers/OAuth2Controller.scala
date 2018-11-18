package bitub.bim.controllers

import bitub.bim.auth.{AuthDataProvider, AuthTokenEndpoint}
import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import scalaoauth2.provider.OAuth2Provider

import scala.concurrent.ExecutionContext

class OAuth2Controller @Inject()(components: ControllerComponents)(implicit ec: ExecutionContext)
		extends AbstractController(components) with OAuth2Provider {
	override val tokenEndpoint = new AuthTokenEndpoint

	def accessToken = Action.async { implicit request =>
		issueAccessToken(new AuthDataProvider())
	}

}
