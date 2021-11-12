package site.madcat.testrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ObjVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleTextView=itemView.findViewById<TextView>(R.id.title_text_view)
    var detailTextView=itemView.findViewById<TextView>(R.id.detail_text_view)



}
