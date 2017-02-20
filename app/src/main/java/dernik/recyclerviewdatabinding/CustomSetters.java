package dernik.recyclerviewdatabinding;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by Nik on 20.02.2017.
 */

public class CustomSetters {
    private static final String TAG = "CustomSetters";

    @BindingAdapter("imgSrc")
    public static void setImgSrc (ImageView view, int imgID)
    {
        // Show / LoadImage  you can getContext()
        Log.d(TAG,"Image Source Set");
    }
}
