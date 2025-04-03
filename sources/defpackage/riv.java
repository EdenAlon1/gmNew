package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class riv extends rik {
    private final int a;
    private final int b;

    public riv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.rix
    public final void e(riw riwVar) {
        if (rkh.p(this.a, this.b)) {
            riwVar.g(this.a, this.b);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.a + " and height: " + this.b + ", either provide dimensions in the constructor or call override()");
    }

    @Override // defpackage.rix
    public final void h(riw riwVar) {
    }
}
