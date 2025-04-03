package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivy implements iwc {
    @Override // defpackage.iwc
    public final int a() {
        return 16;
    }

    @Override // defpackage.iwc
    public final void b(iui iuiVar, long j, itl itlVar, int i, boolean z) {
        iuiVar.O(j, itlVar, i, z);
    }

    @Override // defpackage.iwc
    public final boolean c(iui iuiVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [hvh] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.iwc
    public final void d(hvh hvhVar) {
        ?? r1 = 0;
        while (hvhVar != 0) {
            if (hvhVar instanceof ixl) {
                ((ixl) hvhVar).y();
            } else if ((hvhVar.q & 16) != 0 && (hvhVar instanceof isz)) {
                hvh hvhVar2 = hvhVar.n;
                int i = 0;
                r1 = r1;
                hvhVar = hvhVar;
                while (hvhVar2 != null) {
                    if ((hvhVar2.q & 16) != 0) {
                        i++;
                        r1 = r1;
                        if (i == 1) {
                            hvhVar = hvhVar2;
                        } else {
                            if (r1 == 0) {
                                r1 = new hne(new hvh[16]);
                            }
                            if (hvhVar != 0) {
                                r1.n(hvhVar);
                            }
                            r1.n(hvhVar2);
                            hvhVar = 0;
                        }
                    }
                    hvhVar2 = hvhVar2.t;
                    r1 = r1;
                    hvhVar = hvhVar;
                }
                if (i != 1) {
                }
            }
            hvhVar = isx.a(r1);
        }
    }
}
