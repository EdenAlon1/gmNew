package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgv {
    public boolean a;
    public mhz b;
    public int c;
    public boolean d;
    public int e;

    public mgv(mhz mhzVar) {
        this.b = mhzVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }
}
