package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ej {
    static eh a(Context context, ea eaVar, boolean z, boolean z2) {
        int v;
        boolean z3;
        dv dvVar = eaVar.T;
        int i = 0;
        int i2 = dvVar == null ? 0 : dvVar.f;
        if (z2) {
            if (z) {
                v = eaVar.w();
                z3 = true;
            } else {
                v = eaVar.x();
                z3 = false;
            }
        } else if (z) {
            v = eaVar.u();
            z3 = true;
        } else {
            v = eaVar.v();
            z3 = false;
        }
        boolean z4 = z3;
        eaVar.as(0, 0, 0, 0);
        ViewGroup viewGroup = eaVar.P;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            eaVar.P.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = eaVar.P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        eaVar.aR(i2, v);
        Animator y = eaVar.y(i2, z3, v);
        if (y != null) {
            return new eh(y);
        }
        if (v != 0) {
            i = v;
        } else if (i2 != 0) {
            i = i2 != 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z3 ? b(context, android.R.attr.activityOpenEnterAnimation) : b(context, android.R.attr.activityOpenExitAnimation) : true != z4 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z3 ? b(context, android.R.attr.activityCloseEnterAnimation) : b(context, android.R.attr.activityCloseExitAnimation) : true != z4 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z4 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (i != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                    if (loadAnimation != null) {
                        return new eh(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                if (loadAnimator != null) {
                    return new eh(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                if (loadAnimation2 != null) {
                    return new eh(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
