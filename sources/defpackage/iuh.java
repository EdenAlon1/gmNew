package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iuh extends ffkk implements ffix {
    final /* synthetic */ iui a;
    final /* synthetic */ fflb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuh(iui iuiVar, fflb fflbVar) {
        super(0);
        this.a = iuiVar;
        this.b = fflbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ivu ivuVar = this.a.x;
        if ((ivuVar.a() & 8) != 0) {
            for (hvh hvhVar = ivuVar.d; hvhVar != null; hvhVar = hvhVar.s) {
                if ((hvhVar.q & 8) != 0) {
                    isz iszVar = hvhVar;
                    ?? r3 = 0;
                    while (iszVar != 0) {
                        if (iszVar instanceof ixn) {
                            fflb fflbVar = this.b;
                            ixn ixnVar = (ixn) iszVar;
                            if (ixnVar.dZ()) {
                                fflbVar.a = new jjn();
                                ((jjn) fflbVar.a).c = true;
                            }
                            if (ixnVar.ea()) {
                                ((jjn) fflbVar.a).b = true;
                            }
                            ixnVar.dO((jkv) fflbVar.a);
                        } else if ((iszVar.q & 8) != 0 && (iszVar instanceof isz)) {
                            hvh hvhVar2 = iszVar.n;
                            int i = 0;
                            iszVar = iszVar;
                            r3 = r3;
                            while (hvhVar2 != null) {
                                if ((hvhVar2.q & 8) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        iszVar = hvhVar2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new hne(new hvh[16]);
                                        }
                                        if (iszVar != 0) {
                                            r3.n(iszVar);
                                        }
                                        r3.n(hvhVar2);
                                        iszVar = 0;
                                    }
                                }
                                hvhVar2 = hvhVar2.t;
                                iszVar = iszVar;
                                r3 = r3;
                            }
                            if (i != 1) {
                            }
                        }
                        iszVar = isx.a(r3);
                    }
                }
            }
        }
        return ffcu.a;
    }
}
