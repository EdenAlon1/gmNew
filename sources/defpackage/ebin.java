package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebin {
    public final CirclePulseDrawable a;
    public AnimatorSet b;
    public boolean c;

    public ebin(Context context) {
        int b = ebnr.b(context, R.attr.ogCriticalAlertRingColor);
        this.a = new CirclePulseDrawable(new ColorDrawable(0), b, b);
    }

    public static AnimatorSet a(CirclePulseDrawable circlePulseDrawable, String str, int i, long j, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofInt(circlePulseDrawable, str, 0, i).setDuration(j);
        duration.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofInt(circlePulseDrawable, str, i, 0).setDuration(j2);
        duration2.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        return animatorSet;
    }
}
