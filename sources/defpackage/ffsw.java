package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsw {
    public static final long a(long j) {
        long j2 = ffpw.a;
        if (j > 0) {
            return ffpw.g(ffpw.j(j, ffpy.e(999999L, ffpz.a)));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ffgu r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ffsv
            if (r0 == 0) goto L13
            r0 = r4
            ffsv r0 = (defpackage.ffsv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffsv r0 = new ffsv
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.ffci.b(r4)
            goto L4e
        L2f:
            defpackage.ffci.b(r4)
            r0.b = r3
            ffrh r4 = new ffrh
            ffgu r2 = defpackage.ffhi.c(r0)
            r4.<init>(r2, r3)
            r4.B()
            java.lang.Object r4 = r4.m()
            ffhh r2 = defpackage.ffhh.a
            if (r4 != r2) goto L4b
            r0.getClass()
        L4b:
            if (r4 != r1) goto L4e
            return r1
        L4e:
            ffbx r4 = new ffbx
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffsw.b(ffgu):java.lang.Object");
    }

    public static final Object c(long j, ffgu ffguVar) {
        if (j > 0) {
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            if (j < Long.MAX_VALUE) {
                e(ffrhVar.b).d(j, ffrhVar);
            }
            Object m = ffrhVar.m();
            ffhh ffhhVar = ffhh.a;
            if (m == ffhhVar) {
                ffguVar.getClass();
            }
            if (m == ffhhVar) {
                return m;
            }
        }
        return ffcu.a;
    }

    public static final Object d(long j, ffgu ffguVar) {
        Object c = c(a(j), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    public static final ffsu e(ffhd ffhdVar) {
        ffha ffhaVar = ffhdVar.get(ffgw.k);
        ffsu ffsuVar = ffhaVar instanceof ffsu ? (ffsu) ffhaVar : null;
        return ffsuVar == null ? ffsr.a : ffsuVar;
    }
}
