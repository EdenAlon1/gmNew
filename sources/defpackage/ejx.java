package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejx implements hkx {
    private final int a;
    private final int b;
    private final hho c;
    private int d;

    public ejx(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = new hic(ejw.a(i, i2, i3), hla.a);
        this.d = i;
    }

    @Override // defpackage.hkx
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ffmj a() {
        return (ffmj) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            this.c.b(ejw.a(i, this.a, this.b));
        }
    }
}
