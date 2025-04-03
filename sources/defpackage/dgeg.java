package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgeg {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public dgeg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    final int a() {
        if (!this.a) {
            return 1;
        }
        if (this.c) {
            return 4;
        }
        return this.b ? 3 : 2;
    }

    final boolean b() {
        return c() || a() == 3;
    }

    final boolean c() {
        return a() == 4;
    }
}
