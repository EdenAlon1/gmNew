package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehax extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public ehax(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.E(5);
        WeakReference weakReference = this.a.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) this.a.B.get()).requestLayout();
    }
}
