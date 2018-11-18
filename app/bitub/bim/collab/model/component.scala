package bitub.bim.collab.model

case class SharedComponent(sharedId: String,
						   authoringId: Option[String] = None,
						   authoringSystem: Option[String] = None,
						   visible: Option[Boolean] = None)
