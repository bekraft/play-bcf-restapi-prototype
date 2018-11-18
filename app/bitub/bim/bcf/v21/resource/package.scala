package bitub.bim.bcf.v21

import bitub.bim.collab.model.IssueProject
import play.api.libs.functional.syntax._
import play.api.libs.json.{JsPath, Json, Reads, Writes}

package object resource {
	object Decoders {
		implicit val projectDecoder = (
				( JsPath \ "project_id").read[String] and
				( JsPath \ "name").read[String]
		)(IssueProject.apply _)
	}

	object Encoders {

	}
}
