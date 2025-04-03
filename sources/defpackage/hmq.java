package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hmq {
    public final int b;
    public final int c;

    public hmq(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar);

    protected hen b(hmv hmvVar) {
        return null;
    }

    public final String toString() {
        int i = fflc.a;
        String c = new ffkb(getClass()).c();
        return c == null ? "" : c;
    }

    public /* synthetic */ hmq(int i, int i2, int i3) {
        this(1 == (i3 & 1) ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
