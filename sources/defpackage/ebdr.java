package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebdr implements llh {
    final /* synthetic */ ebds a;
    private final int b;

    public ebdr(ebds ebdsVar, int i) {
        this.a = ebdsVar;
        this.b = i;
    }

    @Override // defpackage.llh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.a.a.a(Integer.valueOf(this.b));
            return;
        }
        ebds ebdsVar = this.a;
        int i = this.b;
        mz mzVar = ebdsVar.a;
        Integer valueOf = Integer.valueOf(i);
        mzVar.j();
        int c = mzVar.c(valueOf, mzVar.a, 0, mzVar.g, 2);
        if (c == -1) {
            return;
        }
        mzVar.i(c, true);
    }
}
