package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxe extends AnimatorListenerAdapter {
    final /* synthetic */ Drawable a;
    final /* synthetic */ DrawableBadgeViewHolder b;

    public eaxe(DrawableBadgeViewHolder drawableBadgeViewHolder, Drawable drawable) {
        this.a = drawable;
        this.b = drawableBadgeViewHolder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.f(this.a);
        this.b.a.setVisibility(0);
    }
}
