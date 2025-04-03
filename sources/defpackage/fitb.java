package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fitb extends fisz {
    public final fird b;

    protected fitb(fird firdVar, firf firfVar) {
        super(firfVar);
        if (firdVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!firdVar.u()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.b = firdVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.fisz, defpackage.fird
    public int c() {
        throw null;
    }

    @Override // defpackage.fird
    public int d() {
        throw null;
    }

    @Override // defpackage.fisz, defpackage.fird
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.fisz, defpackage.fird
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.fisz, defpackage.fird
    public firl q() {
        return this.b.q();
    }

    @Override // defpackage.fird
    public firl s() {
        return this.b.s();
    }

    @Override // defpackage.fird
    public final void v() {
    }
}
