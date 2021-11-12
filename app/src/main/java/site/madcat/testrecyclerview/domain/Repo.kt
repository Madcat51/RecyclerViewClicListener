package site.madcat.testrecyclerview.domain

import site.madcat.testrecyclerview.domain.interfases.RepoInt
import java.util.ArrayList

class Repo: RepoInt {


    var cash: ArrayList<Obj> = ArrayList<Obj>()
        private var counter=0


    val objs: List<Obj?>
        get() = ArrayList(cash)

    override fun addObj(obj: Obj?): String {
        val newId=++counter
        obj!!.setID(newId.toString())
        cash.add(obj)
        return newId.toString()
    }

    override fun editObj(id: String, obj: Obj?): Boolean {
        deleteObj(id)
        obj!!.setID(id)
        cash.add(obj)
        return true
    }

    override fun deleteObj(id: String): Boolean {
        for (i in cash.indices) {
            if (cash[i].getId(id).equals(id)) {
                cash.removeAt(i)
                return true
            }
        }
        return false
    }
}