package site.madcat.testrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import androidx.recyclerview.widget.RecyclerView
import site.madcat.testrecyclerview.domain.Obj

import java.util.ArrayList





class HomeAdapter : RecyclerView.Adapter<ObjVH>() {
    private var data: MutableList<Obj> = ArrayList<Obj>()
    private var itemClickListener: IKotlinItemClickListener? = null




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObjVH {
        val view: View=LayoutInflater.from(parent.context).inflate(R.layout.items_obj, parent, false)
        return ObjVH(view)
    }
    override fun onBindViewHolder(holder: ObjVH, position: Int)
    {
        val obj: Obj = getItem(position)
        holder.titleTextView.text=(obj.title)
        holder.detailTextView.text=(obj.noteDetail+" "+obj.id)
        // Нажмите событие
        holder.titleTextView.setOnClickListener {
            itemClickListener!!.onItemClickListener(position)

        }
    }



    fun setData(data: List<Obj?>) {
        this.data = data as MutableList<Obj>
    }


    override fun getItemCount() = data.size


    private fun getItem(position: Int): Obj {
        return data[position]
    }
    // Предоставляем заданный метод
    fun setOnKotlinItemClickListener(itemClickListener: IKotlinItemClickListener) {
        this.itemClickListener = itemClickListener

    }

    // Пользовательский интерфейс
    interface IKotlinItemClickListener {
        fun onItemClickListener(position: Int)
    }

}







