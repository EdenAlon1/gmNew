package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rez implements qwv {
    private final AnimatedImageDrawable a;

    public rez(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.qwv
    public final int a() {
        int intrinsicWidth;
        int intrinsicHeight;
        AnimatedImageDrawable animatedImageDrawable = this.a;
        intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
        intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
        int c = intrinsicWidth * intrinsicHeight * rkh.c(Bitmap.Config.ARGB_8888);
        return c + c;
    }

    @Override // defpackage.qwv
    public final Class b() {
        return Drawable.class;
    }

    @Override // defpackage.qwv
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.qwv
    public final void e() {
        this.a.stop();
        this.a.clearAnimationCallbacks();
    }
}
