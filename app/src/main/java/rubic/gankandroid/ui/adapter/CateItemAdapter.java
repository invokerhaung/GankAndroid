package rubic.gankandroid.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import rubic.gankandroid.data.entry.GankEntity;
import rubic.gankandroid.databinding.ItemCateRecyBinding;
import rubic.gankandroid.utils.BaseAdapter;

/**
 * Created by invokerhuang on 2017/9/19.
 */

public class CateItemAdapter extends BaseAdapter<CateItemAdapter.CateViewHolder,GankEntity.ResultsBean> {
    private List<GankEntity.ResultsBean> entities;

    public CateItemAdapter() {
        entities = new ArrayList<>();
    }

    @Override
    public CateViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return CateViewHolder.creat(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(CateViewHolder holder, int position) {
        holder.onbind(entities.get(position));
    }

    @Override
    public int getItemCount() {
        return entities.size();
    }

    @Override
    public void setData(List<GankEntity.ResultsBean> data) {
        this.entities = data;
        notifyDataSetChanged();
    }

    static class CateViewHolder extends RecyclerView.ViewHolder{
        ItemCateRecyBinding binding;

        public static CateViewHolder creat(LayoutInflater inflater, ViewGroup parent) {
            ItemCateRecyBinding binding = ItemCateRecyBinding.inflate(inflater, parent, false);
            return new CateViewHolder(binding);
        }
        public CateViewHolder(ItemCateRecyBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(view -> {

            });
        }

        public void onbind(GankEntity.ResultsBean data) {
            binding.setCateitem(data);
            binding.executePendingBindings();
        }
    }
}
