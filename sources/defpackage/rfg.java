package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rfg extends rfe {
    private rfg(Drawable drawable) {
        super(drawable);
    }

    static qwv g(Drawable drawable) {
        if (drawable != null) {
            return new rfg(drawable);
        }
        return null;
    }

    @Override // defpackage.qwv
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.qwv
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.qwv
    public final void e() {
    }
}
