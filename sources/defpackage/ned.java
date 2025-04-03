package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ned implements ndn {
    final /* synthetic */ nef a;
    private final long b;

    public ned(nef nefVar, long j) {
        this.a = nefVar;
        this.b = j;
    }

    @Override // defpackage.ndn
    public final ndl b(long j) {
        ndl c = this.a.a[0].c(j);
        int i = 1;
        while (true) {
            nei[] neiVarArr = this.a.a;
            if (i >= neiVarArr.length) {
                return c;
            }
            ndl c2 = neiVarArr[i].c(j);
            if (c2.a.c < c.a.c) {
                c = c2;
            }
            i++;
        }
    }

    @Override // defpackage.ndn
    public final long w() {
        return this.b;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return true;
    }
}
