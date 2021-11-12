package site.madcat.testrecyclerview.domain


import java.io.Serializable
import java.util.*

class Obj(id:String,title: String, Detail: String) : Serializable {
        var id: String
        var title: String
        var noteDetail: String

        fun setID(id: String) {
            this.id=id
        }
    fun getId(id: String): String {
        return id
    }
        init {
           this.id=id
            this.title=title
            this.noteDetail=Detail
        }


}

