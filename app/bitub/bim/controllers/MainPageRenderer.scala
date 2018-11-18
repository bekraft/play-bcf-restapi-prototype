package bitub.bim.controllers

import javax.inject.Inject
import play.api.mvc._

/**
  * Root entry point.
  */
class MainPageRenderer @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }
}
