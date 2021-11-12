package site.madcat.testrecyclerview.domain.interfases

import site.madcat.testrecyclerview.domain.Obj
import java.io.Serializable

interface RepoInt  : Serializable {


        fun addObj(obj: Obj?): String
        fun editObj(id: String, obj: Obj?): Boolean
        fun deleteObj(id: String): Boolean
    }
