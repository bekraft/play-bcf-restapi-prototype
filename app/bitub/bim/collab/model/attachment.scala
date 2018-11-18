package bitub.bim.collab.model

trait Attachment {
	def base64: String
	def fileType: String
	def fileName: String
	def fileDate: java.util.Date
}

case class PngAttachment(base64:String, fileName:String, fileDate:java.util.Date) extends Attachment {
	val fileType = "PNG"
}

case class JpgAttachment(base64:String, fileName:String, fileDate:java.util.Date) extends Attachment {
	val fileType = "JPG"
}