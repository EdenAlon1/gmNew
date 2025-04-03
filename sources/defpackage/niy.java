package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class niy implements nje {
    public final long a;
    public final long b;
    public final nji c;
    public long d;
    private final njd e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public niy(nji njiVar, long j, long j2, long j3, long j4, boolean z) {
        lti.a(j >= 0 && j2 > j);
        this.c = njiVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new njd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    @Override // defpackage.nje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.ncp r29) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.niy.a(ncp):long");
    }

    @Override // defpackage.nje
    public final /* bridge */ /* synthetic */ ndn b() {
        if (this.d != 0) {
            return new nix(this);
        }
        return null;
    }

    @Override // defpackage.nje
    public final void c(long j) {
        this.h = lvf.q(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}
