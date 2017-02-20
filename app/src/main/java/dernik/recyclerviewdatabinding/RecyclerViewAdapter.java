package dernik.recyclerviewdatabinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import dernik.recyclerviewdatabinding.databinding.ItemDataBinding;

/**
 * Created by Nik on 20.02.2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<VieHolder> {
    private final String TAG = getClass().getSimpleName();
    private Context mContext;
    private List<ItemViewModel> mModels;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(Context context, List<ItemViewModel> models)
    {
        this.mContext = context;
        this.mModels = models;
    }

    @Override
    public VieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(inflater == null){
            inflater= LayoutInflater.from(parent.getContext());
        }
        ItemDataBinding dataBinding = ItemDataBinding.inflate(inflater, parent, false);
        return new VieHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(VieHolder holder, int position) {
        final ItemViewModel model = mModels.get(position);
        holder.bind(model);

        final ItemDataBinding dataBinding = holder.getDataBinding();
        dataBinding.setHandler(new ImgClickHandler() {
            @Override
            public void onImgClick() {
                Log.d(TAG,"Image Click");
            }
        });
    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }
}
