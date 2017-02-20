package dernik.recyclerviewdatabinding.viewModels.classes;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import dernik.recyclerviewdatabinding.R;
import dernik.recyclerviewdatabinding.ui.adapter.RecyclerViewAdapter;
import dernik.recyclerviewdatabinding.viewModels.ItemViewModel;

/**
 * Created by Nik on 20.02.2017.
 */

public class CustomSetters {
    private static final String TAG = "CustomSetters";

    @BindingAdapter("imgSrc")
    public static void setImgSrc (ImageView view, int imgID)
    {
        // Show / LoadImage  you can getContext()
        view.setImageDrawable(view.getContext().getResources().getDrawable(imgID));
//        String url = "http://i.imgur.com/1NPgvdM.jpg";
//        Glide.with(view.getContext()).load(url).into(view);
        Log.d(TAG,"Image Source Set");
    }

    @BindingAdapter("initializeRecyclerView")
    public static void setInitializeRecyclerView(RecyclerView recyclerView, List<ItemViewModel> list)
    {
        Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(context, list));
    }

}
