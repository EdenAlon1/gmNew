package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class noe implements nbz {
    private final lvc a;
    private final luv b = new luv();
    private final int c;

    public noe(int i, lvc lvcVar) {
        this.c = i;
        this.a = lvcVar;
    }

    @Override // defpackage.nbz
    public final nby a(ncp ncpVar, long j) {
        int a;
        int a2;
        nce nceVar = (nce) ncpVar;
        long j2 = nceVar.a;
        long j3 = nceVar.b;
        int min = (int) Math.min(112800L, j2 - j3);
        this.b.G(min);
        ncpVar.i(this.b.a, 0, min);
        luv luvVar = this.b;
        int i = luvVar.c;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        long j6 = -1;
        while (luvVar.b() >= 188 && (a2 = (a = noo.a(luvVar.a, luvVar.b, i)) + 188) <= i) {
            long b = noo.b(luvVar, a, this.c);
            if (b != -9223372036854775807L) {
                long b2 = this.a.b(b);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new nby(-1, b2, j3) : new nby(0, -9223372036854775807L, j3 + j6);
                }
                long j7 = a;
                if (100000 + b2 > j) {
                    return new nby(0, -9223372036854775807L, j3 + j7);
                }
                j5 = b2;
                j6 = j7;
            }
            luvVar.K(a2);
            j4 = a2;
        }
        return j5 != -9223372036854775807L ? new nby(-2, j5, j3 + j4) : nby.a;
    }

    @Override // defpackage.nbz
    public final void b() {
        this.b.H(lvf.c);
    }
}
