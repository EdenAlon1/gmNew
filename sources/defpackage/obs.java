package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obs extends obr {
    private final iy a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public obs(defpackage.iy r2, defpackage.obt r3) {
        /*
            r1 = this;
            jl r0 = r2.hr()
            jz r0 = r0.a
            android.content.Context r0 = r0.u()
            r0.getClass()
            r1.<init>(r0, r3)
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obs.<init>(iy, obt):void");
    }

    @Override // defpackage.obr
    protected final void b(Drawable drawable, int i) {
        im k = this.a.k();
        if (k == null) {
            throw new IllegalStateException("Activity " + this.a + " does not have an ActionBar set via setSupportActionBar()");
        }
        k.setDisplayHomeAsUpEnabled(drawable != null);
        im b = this.a.hr().a.b();
        if (b != null) {
            b.setHomeAsUpIndicator(drawable);
            b.setHomeActionContentDescription(i);
        }
    }

    @Override // defpackage.obr
    protected final void c(CharSequence charSequence) {
        im k = this.a.k();
        if (k != null) {
            k.setTitle(charSequence);
            return;
        }
        throw new IllegalStateException("Activity " + this.a + " does not have an ActionBar set via setSupportActionBar()");
    }
}
