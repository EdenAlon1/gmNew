package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhg extends ncd implements nhl {
    public final long a;
    public final int b;
    public final int c;
    private final long d;

    public nhg(long j, long j2, int i, int i2) {
        super(j, j2, i, i2);
        long j3 = j;
        this.a = j2;
        this.b = i;
        this.c = i2;
        this.d = j3 == -1 ? -1L : j3;
    }

    @Override // defpackage.nhl
    public final int e() {
        return this.b;
    }

    @Override // defpackage.nhl
    public final long f() {
        return this.d;
    }

    @Override // defpackage.nhl
    public final long g(long j) {
        return d(j);
    }
}
