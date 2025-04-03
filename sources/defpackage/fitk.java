package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fitk extends fisz {
    final long a;
    private final firl b;

    public fitk(firf firfVar, firl firlVar) {
        super(firfVar);
        if (!firlVar.e()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long c = firlVar.c();
        this.a = c;
        if (c < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.b = firlVar;
    }

    @Override // defpackage.fird
    public int d() {
        return 0;
    }

    @Override // defpackage.fisz, defpackage.fird
    public long f(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.fisz, defpackage.fird
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.fisz, defpackage.fird
    public long h(long j, int i) {
        fite.c(this, i, d(), x(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl q() {
        return this.b;
    }

    protected int x(long j, int i) {
        return w(j);
    }

    @Override // defpackage.fird
    public final void v() {
    }
}
