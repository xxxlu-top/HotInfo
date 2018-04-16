package top.xxxlu.hotinfo.utils;


import top.xxxlu.hotinfo.R;
import top.xxxlu.hotinfo.bean.ChatMessage;
import top.xxxlu.hotinfo.recycleradapter.base.AARecViewHolder;
import top.xxxlu.hotinfo.recycleradapter.base.ItemViewDelegate;

import top.xxxlu.hotinfo.bean.ChatMessage;
import top.xxxlu.hotinfo.recycleradapter.base.AARecViewHolder;
import top.xxxlu.hotinfo.recycleradapter.base.ItemViewDelegate;

/**
 * Created by zhy on 16/6/22.
 */
public class MsgReceiveItemDelagate implements ItemViewDelegate<ChatMessage> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.me_activity_msg_receive_item;
    }

    @Override
    public boolean isForViewType(ChatMessage item, int position) {
        return item.isReveiveMsg();
    }

    @Override
    public void convert(AARecViewHolder holder, ChatMessage chatMessage, int position) {
        holder.setText(R.id.tv_content_receive, chatMessage.getContent());
//        holder.setImageResource(R.id.chat_from_icon, chatMessage.getIcon());
    }
}
