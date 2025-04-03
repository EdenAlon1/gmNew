package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxj implements cvwx {
    public final ffbr a;
    public final cwhc b;
    public final cwis c;
    public final ffsk d;
    public final Context e;
    public final cwde f;
    public final cwiw g;
    public final ffjm h;
    private final ffxx i;
    private final ffxx j;
    private final fgdj k;

    public cvxj(ffbr ffbrVar, cwhc cwhcVar, cwis cwisVar, ffsk ffskVar, Context context, cwde cwdeVar, cwiw cwiwVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        cwhcVar.getClass();
        cwisVar.getClass();
        ffskVar.getClass();
        context.getClass();
        cwdeVar.getClass();
        cwiwVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = cwhcVar;
        this.c = cwisVar;
        this.d = ffskVar;
        this.e = context;
        this.f = cwdeVar;
        this.g = cwiwVar;
        ffxx a = cwisVar.a();
        cvxf cvxfVar = new cvxf(null, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(cvxfVar, a);
        this.i = fgenVar;
        ffxx cvxiVar = new cvxi(fgenVar, this);
        this.j = cvxiVar;
        cvxiVar = ((attl) ffbrVar2.b()).a() ? cvxiVar : new ffyg(null);
        int i2 = fgcz.a;
        this.k = fgbn.b(cvxiVar, ffskVar, fgcy.b, null);
        this.h = axqa.d(new cvwy(this), ffskVar);
    }

    @Override // defpackage.cvwx
    public final fgdj a() {
        return this.k;
    }
}
