package org.techtown.realtimedbtest_20220322.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.realtimedbtest_20220322.R
import org.techtown.realtimedbtest_20220322.datas.ChattingData

class ChattingRecyclerAdapter(
    val mContext : Context,
    val mList : List<ChattingData>
) : RecyclerView.Adapter<ChattingRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        fun bind(data: ChattingData) {      // 실제 값을 붙여주는 함수, 이너클래스 기능만 담당. 실제 사용은 바인드뷰홀더에서


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {   // 위의 ViewHolder 객체 만들어달라.

        val view = LayoutInflater.from(mContext).inflate(R.layout.chatting_list_item,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {        //실제 데이터 뽑아서 연동

        val data = mList[position]
        holder.bind(data)       // 홀더가 가지고 있는 바인드 함수에 데이터 넣어서 실행




    }

    override fun getItemCount() = mList.size

}

