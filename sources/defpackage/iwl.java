package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwl implements ipl {
    private final inx a;
    private final int b;
    private final int c;

    public iwl(inx inxVar, int i, int i2) {
        this.a = inxVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.inx
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.inx
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.inx
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.inx
    public final int d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.ipl
    public final iqk e(long j) {
        if (this.c == 1) {
            return new iwm(this.b == 2 ? this.a.b(jzk.a(j)) : this.a.d(jzk.a(j)), jzk.h(j) ? jzk.a(j) : 32767);
        }
        return new iwm(jzk.i(j) ? jzk.b(j) : 32767, this.b == 2 ? this.a.a(jzk.b(j)) : this.a.c(jzk.b(j)));
    }

    @Override // defpackage.inx
    public final Object f() {
        return this.a.f();
    }
}
