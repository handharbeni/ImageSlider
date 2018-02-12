package illiyin.mhandharbeni.library.Animations;

import android.view.View;
/**
 * Created by root on 2/12/18.
 */

public interface BaseAnimationInterface {
    public void onPrepareCurrentItemLeaveScreen(View current);
    public void onPrepareNextItemShowInScreen(View next);
    public void onCurrentItemDisappear(View view);
    public void onNextItemAppear(View view);
}