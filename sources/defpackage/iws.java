package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iws {
    public final hne a = new hne(new iui[16]);
    public iui[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a(iui iuiVar) {
        if (iuiVar.aD() == 5 && !iuiVar.al() && !iuiVar.ao() && !iuiVar.D && iuiVar.g()) {
            ivu ivuVar = iuiVar.x;
            if ((ivuVar.a() & 256) != 0) {
                for (hvh hvhVar = ivuVar.e; hvhVar != null; hvhVar = hvhVar.t) {
                    if ((hvhVar.q & 256) != 0) {
                        isz iszVar = hvhVar;
                        ?? r5 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof iti) {
                                iti itiVar = (iti) iszVar;
                                itiVar.dQ(isx.e(itiVar, 256));
                            } else if ((iszVar.q & 256) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r5 = r5;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 256) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r5.n(iszVar);
                                            }
                                            r5.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r5 = r5;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r5);
                        }
                    }
                    if ((hvhVar.r & 256) == 0) {
                        break;
                    }
                }
            }
        }
        iuiVar.C = false;
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i2 = s.b;
        for (int i3 = 0; i3 < i2; i3++) {
            a((iui) objArr[i3]);
        }
    }

    public final void b(iui iuiVar) {
        this.a.n(iuiVar);
        iuiVar.C = true;
    }
}
