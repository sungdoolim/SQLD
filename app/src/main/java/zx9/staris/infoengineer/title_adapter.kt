package zx9.staris.infoengineer

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import zx9.staris.infoengineer.companion.Companion.TitleList
import kotlinx.android.synthetic.main.titleadapter.view.*


class title_adapter(val context: Context?): RecyclerView.Adapter<title_adapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.titleadapter,parent,false)
        // 내가 쓸 custom_rev지정!
        return CustomViewHolder(
            view
        ).apply {
            itemView.setOnClickListener {
                var pref=context?.getSharedPreferences("session",0)
                var sessionNum=pref?.getInt("num",0)
                var edit=pref?.edit()

                //itemView.setBackgroundColor(Color.parseColor("#F1ECD2"))
               // Toast.makeText(context,"color",Toast.LENGTH_SHORT).show()
                val curPos:Int=adapterPosition
                edit?.putInt("num",curPos)
                edit?.apply()


                view.titleid.setBackgroundColor(Color.parseColor("#F1ECD2"))
                var title: String =TitleList.get(curPos).title
                var contents: String =TitleList.get(curPos).url

                TitleList.get(curPos).color=1

             //   val intent = Intent(view.getContext(), WebView::class.java)
                   val intent = Intent(view.getContext(), content::class.java)
//                val pref=context!!.getSharedPreferences("selected_coupon",0)
//                val edit=pref.edit()
//                edit.clear()
//                edit.putString("url",dl)
//                edit.apply()
                intent.putExtra("contents",contents);
                intent.putExtra("title",title)
                context!!.startActivity(intent)//intent.getStringExtra("url")?:"null?"

            }
        }
    }
    override fun getItemCount(): Int {
        return TitleList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        // holder.memo.setImageResource(1)
        var pref=context?.getSharedPreferences("session",0)
        var sessionNum:Int?=pref?.getInt("num",0)
        if(TitleList.get(position).color==0){
            holder.title.setBackgroundColor(Color.parseColor("#E6F8FA"))
        }

        holder.title.text=position.toString()+" ): "+TitleList.get(position).title


    }
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title=itemView.findViewById<TextView>(R.id.titleid)

    }

}