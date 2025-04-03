package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvt extends ewzd {
    public boolean a;
    public boolean b;
    public boolean c;
    public engw d;
    public byte e;
    public ewyr f;

    @Override // defpackage.ewzd
    public final void a(boolean z) {
        this.b = z;
        this.e = (byte) (this.e | 2);
    }

    @Override // defpackage.ewzd
    public final void b(boolean z) {
        this.a = z;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.ewzd
    public final void c(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 8);
    }
}
