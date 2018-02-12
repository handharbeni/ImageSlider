package illiyin.mhandharbeni.library.Transformers;

/**
 * Created by root on 2/12/18.
 */

import android.view.View;

public class DefaultTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
    }

    @Override
    public boolean isPagingEnabled() {
        return true;
    }

}