package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ndm implements ndn {
    private final long a;
    private final ndl b;

    public ndm(long j) {
        this(j, 0L);
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        return this.b;
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.a;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return false;
    }

    public ndm(long j, long j2) {
        this.a = j;
        ndo ndoVar = j2 == 0 ? ndo.a : new ndo(0L, j2);
        this.b = new ndl(ndoVar, ndoVar);
    }
}
