package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rim implements rix {
    private final int a;
    private final int b;
    public rib c;

    public rim() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.rix
    public final rib d() {
        return this.c;
    }

    @Override // defpackage.rix
    public final void e(riw riwVar) {
        riwVar.g(this.a, this.b);
    }

    @Override // defpackage.rix
    public final void i(rib ribVar) {
        this.c = ribVar;
    }

    public rim(int i, int i2) {
        if (!rkh.p(i, i2)) {
            throw new IllegalArgumentException(a.r(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.rgu
    public final void m() {
    }

    @Override // defpackage.rgu
    public final void n() {
    }

    @Override // defpackage.rgu
    public final void o() {
    }

    @Override // defpackage.rix
    public void a(Drawable drawable) {
    }

    @Override // defpackage.rix
    public void g(Drawable drawable) {
    }

    @Override // defpackage.rix
    public final void h(riw riwVar) {
    }
}
