package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.messaging.R;
import defpackage.dvxb;
import defpackage.eawt;
import defpackage.eaxc;
import defpackage.eaxd;
import defpackage.eaxe;
import defpackage.eaxf;
import defpackage.ebvw;
import defpackage.efbd;
import defpackage.emxb;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class DrawableBadgeViewHolder {
    public final BadgeFrameLayout a;
    public final AvatarView b;
    public ebvw c;
    public Animator d = null;
    public dvxb e;
    private eawt f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    public static class AlphaLayerDrawable extends LayerDrawable implements Drawable.Callback {
        private final Drawable a;
        private final Drawable b;

        public AlphaLayerDrawable(Drawable drawable, Drawable drawable2) {
            super(new Drawable[]{drawable, drawable2});
            this.a = drawable;
            this.b = drawable2;
            drawable2.setCallback(this);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getAlpha() {
            return this.b.getAlpha();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final int getOpacity() {
            return this.a.getOpacity();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.b.setAlpha(i);
            this.b.invalidateSelf();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.a.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    public DrawableBadgeViewHolder(BadgeFrameLayout badgeFrameLayout, AvatarView avatarView) {
        this.a = badgeFrameLayout;
        avatarView.d();
        this.b = avatarView;
    }

    private static Drawable b(eawt eawtVar) {
        if (eawtVar == null) {
            return null;
        }
        return eawtVar.a();
    }

    public final void a(eawt eawtVar, boolean z) {
        ObjectAnimator ofInt;
        efbd.c();
        if (emxb.a(this.f, eawtVar)) {
            return;
        }
        Drawable b = b(this.f);
        this.f = eawtVar;
        Drawable b2 = b(eawtVar);
        if (b == null) {
            ofInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 0.0f, 1.0f);
            ofInt.addListener(new eaxe(this, b2));
        } else if (eawtVar == null) {
            ofInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 1.0f, 0.0f);
            ofInt.addListener(new eaxf(this));
        } else {
            AlphaLayerDrawable alphaLayerDrawable = new AlphaLayerDrawable(b, b2);
            ofInt = ObjectAnimator.ofInt(alphaLayerDrawable, "alpha", 0, PrivateKeyType.INVALID);
            ofInt.addListener(new eaxd(this, alphaLayerDrawable, b2));
        }
        ofInt.setDuration(z ? this.b.getResources().getInteger(R.integer.og_decoration_transition_duration) : 0L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addListener(new eaxc(this, eawtVar));
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
        }
        this.d = ofInt;
        ofInt.start();
    }
}
