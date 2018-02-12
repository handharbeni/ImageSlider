package illiyin.mhandharbeni.library.Transformers;

/**
 * Created by root on 2/12/18.
 */

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

public class StackTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        ViewHelper.setTranslationX(view,position < 0 ? 0f : -view.getWidth() * position);
    }

}