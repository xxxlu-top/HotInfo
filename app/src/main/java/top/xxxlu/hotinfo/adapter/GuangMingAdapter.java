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
import top.xxxlu.hotinfo.activity.content.ContentActivity;
import top.xxxlu.hotinfo.bean.CurrentArticleBean;
import top.xxxlu.hotinfo.bean.HotSearch;

/**
 * Created by liu on 2018/3/27.
 */

public class GuangMingAdapter extends RecyclerView.Adapter<GuangMingAdapter.ViewHolder> {

    private CurrentArticleBean mHotSearch;

    public GuangMingAdapter(CurrentArticleBean hotSearch) {
        mHotSearch = hotSearch;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot_news, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.title.setText(mHotSearch.getData().get(position).getTitle());
        holder.date.setText(mHotSearch.getData().get(position).getWriter());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.mView.getContext(), WebActivity.class);
                String content = mHotSearch.getData().get(position).getContent();
                intent.putExtra("content",content);
                holder.mView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mHotSearch.getData().size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View mView;
        TextView title;
        TextView date;
        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.hot_title);
            date = (TextView) itemView.findViewById(R.id.hot_date);
        }
    }
}
