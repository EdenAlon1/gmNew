package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehob extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ehoc b;

    public ehob(ehoc ehocVar, boolean z) {
        this.a = z;
        this.b = ehocVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f(true != this.a ? 0.0f : 1.0f);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b.b;
        clippableRoundedCornerLayout.a = null;
        clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        clippableRoundedCornerLayout.invalidate();
        if (this.a) {
            return;
        }
        this.b.e.i = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.f(true != this.a ? 1.0f : 0.0f);
    }
}
