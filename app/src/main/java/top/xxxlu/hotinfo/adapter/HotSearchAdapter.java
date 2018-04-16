package top.xxxlu.hotinfo.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.net.URLEncoder;

import top.xxxlu.hotinfo.R;
import top.xxxlu.hotinfo.activity.WebActivity;
import top.xxxlu.hotinfo.bean.HotSearch;

/**
 * Created by liu on 2018/3/27.
 */

public class HotSearchAdapter extends RecyclerView.Adapter<HotSearchAdapter.ViewHolder> {

    private HotSearch mHotSearch;

    public HotSearchAdapter(HotSearch hotSearch) {
        mHotSearch = hotSearch;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot_weibo, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.title.setText(mHotSearch.getData().getList().get(position).getWord());
        holder.date.setText("爆发日期："+mHotSearch.getData().getList().get(position).getBurst_time());
        holder.num.setText("热度："+mHotSearch.getData().getList().get(position).getNum());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.mView.getContext(), WebActivity.class);
                String word = mHotSearch.getData().getList().get(position).getWord();
                String encode = URLEncoder.encode(URLEncoder.encode(word));
                intent.putExtra("url","https://s.weibo.com/weibo/"+encode);
                holder.mView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mHotSearch.getData().getList().size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View mView;
        TextView title;
        TextView date;
        TextView num;
        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.hot_title);
            date = (TextView) itemView.findViewById(R.id.hot_date);
            num = (TextView) itemView.findViewById(R.id.hot_num);
        }
    }
}
