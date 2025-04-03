package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fitg extends fisz {
    private final firl a;
    final long b;

    public fitg(firf firfVar, long j) {
        super(firfVar);
        this.b = j;
        this.a = new fitf(this, ((fire) firfVar).a);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl q() {
        return this.a;
    }

    public abstract long x(long j, long j2);
}
