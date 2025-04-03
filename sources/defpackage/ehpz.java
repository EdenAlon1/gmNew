package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpz extends AnimatorListenerAdapter {
    final /* synthetic */ SideSheetBehavior a;

    public ehpz(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.w(5);
        WeakReference weakReference = this.a.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) this.a.j.get()).requestLayout();
    }
}
