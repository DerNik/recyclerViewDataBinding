package dernik.recyclerviewdatabinding.ui.adapter.viewHolder;

import android.support.v7.widget.RecyclerView;

import dernik.recyclerviewdatabinding.databinding.ItemDataBinding;
import dernik.recyclerviewdatabinding.viewModels.ItemViewModel;

/**
 * Created by Nik on 20.02.2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemDataBinding mDataBinding;

    public ViewHolder(ItemDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.mDataBinding = dataBinding;
    }

    public void bind (ItemViewModel model){
        this.mDataBinding.setViewModel(model);
    }

    public ItemDataBinding getDataBinding() {
        return mDataBinding;
    }
}
