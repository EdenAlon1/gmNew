package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ruw implements Drawable.Callback {
    final /* synthetic */ rux a;

    public ruw(rux ruxVar) {
        this.a = ruxVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        this.a.b.b(Integer.valueOf(this.a.j() + 1));
        rux ruxVar = this.a;
        ruxVar.c.b(new iar(ruz.a(ruxVar.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ruz.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ruz.b().removeCallbacks(runnable);
    }
}
