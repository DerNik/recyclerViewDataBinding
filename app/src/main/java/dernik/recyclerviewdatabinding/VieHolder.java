package dernik.recyclerviewdatabinding;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import dernik.recyclerviewdatabinding.databinding.ItemDataBinding;

/**
 * Created by Nik on 20.02.2017.
 */

public class VieHolder extends RecyclerView.ViewHolder {
    private ItemDataBinding mDataBinding;

    public VieHolder(ItemDataBinding dataBinding) {
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
