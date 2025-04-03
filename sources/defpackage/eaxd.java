package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxd extends AnimatorListenerAdapter {
    final /* synthetic */ DrawableBadgeViewHolder.AlphaLayerDrawable a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ DrawableBadgeViewHolder c;

    public eaxd(DrawableBadgeViewHolder drawableBadgeViewHolder, DrawableBadgeViewHolder.AlphaLayerDrawable alphaLayerDrawable, Drawable drawable) {
        this.a = alphaLayerDrawable;
        this.b = drawable;
        this.c = drawableBadgeViewHolder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b.f(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.b.f(this.a);
    }
}
