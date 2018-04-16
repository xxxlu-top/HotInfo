package top.xxxlu.hotinfo.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URLEncoder;

import top.xxxlu.hotinfo.R;
import top.xxxlu.hotinfo.activity.WebActivity;
import top.xxxlu.hotinfo.bean.HotSearch;
import top.xxxlu.hotinfo.bean.TouTiaoBean;
import top.xxxlu.hotinfo.utils.AACom;
import top.xxxlu.hotinfo.utils.AADate;

/**
 * Created by liu on 2018/3/27.
 */

public class TouTiaoAdapter extends RecyclerView.Adapter<TouTiaoAdapter.ViewHolder> {

    private TouTiaoBean mHotSearch;

    public TouTiaoAdapter(TouTiaoBean hotSearch) {
        mHotSearch = hotSearch;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot_toutiao, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.title.setText(mHotSearch.getData().get(position).getTitle());
        AACom.displayFitImage(holder.img,"http:"+mHotSearch.getData().get(position).getImage_url());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.mView.getContext(), WebActivity.class);
                String url = mHotSearch.getData().get(position).getOpen_url();
                intent.putExtra("url","https://www.toutiao.com"+url);
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
        ImageView img;
        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.hot_title);
            img = (ImageView) itemView.findViewById(R.id.hot_img);
        }
    }
}
