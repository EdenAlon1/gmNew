package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duh extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffhd b;
    final /* synthetic */ ffwm c;
    final /* synthetic */ dlz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duh(ffhd ffhdVar, dlz dlzVar, ffwm ffwmVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffhdVar;
        this.d = dlzVar;
        this.c = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((duh) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r9 != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #0 {all -> 0x0019, blocks: (B:6:0x000d, B:7:0x0074, B:9:0x0078, B:10:0x0042, B:18:0x002b, B:20:0x0037, B:25:0x0015), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:6:0x000d, B:7:0x0074, B:9:0x0078, B:10:0x0042, B:18:0x002b, B:20:0x0037, B:25:0x0015), top: B:2:0x0005 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0071 -> B:7:0x0074). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L11
            java.lang.Object r1 = r8.e
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L74
        L11:
            java.lang.Object r1 = r8.e
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L37
        L19:
            r9 = move-exception
            goto L84
        L1b:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.e
            iju r9 = (defpackage.iju) r9
            r1 = r9
        L23:
            ffhd r9 = r8.b
            boolean r9 = defpackage.ffui.h(r9)
            if (r9 == 0) goto L8c
            dlz r9 = r8.d     // Catch: java.lang.Throwable -> L19
            r8.e = r1     // Catch: java.lang.Throwable -> L19
            r8.a = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = defpackage.dui.b(r1, r9, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 == r0) goto L83
        L37:
            iak r9 = (defpackage.iak) r9     // Catch: java.lang.Throwable -> L19
            long r3 = r9.a     // Catch: java.lang.Throwable -> L19
            ffwm r9 = r8.c     // Catch: java.lang.Throwable -> L19
            dty r5 = defpackage.dty.a     // Catch: java.lang.Throwable -> L19
            r9.b(r5)     // Catch: java.lang.Throwable -> L19
        L42:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r9 = (int) r3     // Catch: java.lang.Throwable -> L19
            float r9 = java.lang.Float.intBitsToFloat(r9)     // Catch: java.lang.Throwable -> L19
            r3 = 1141391360(0x44084000, float:545.0)
            float r9 = r9 / r3
            double r3 = (double) r9     // Catch: java.lang.Throwable -> L19
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r5, r3)     // Catch: java.lang.Throwable -> L19
            float r9 = (float) r3     // Catch: java.lang.Throwable -> L19
            ffwm r3 = r8.c     // Catch: java.lang.Throwable -> L19
            dtx r4 = new dtx     // Catch: java.lang.Throwable -> L19
            r5 = 0
            r7 = 0
            r4.<init>(r9, r5, r7)     // Catch: java.lang.Throwable -> L19
            r3.b(r4)     // Catch: java.lang.Throwable -> L19
            dlz r9 = r8.d     // Catch: java.lang.Throwable -> L19
            r8.e = r1     // Catch: java.lang.Throwable -> L19
            r3 = 2
            r8.a = r3     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = defpackage.dui.a(r1, r9, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L74
            goto L83
        L74:
            iak r9 = (defpackage.iak) r9     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L7b
            long r3 = r9.a     // Catch: java.lang.Throwable -> L19
            goto L42
        L7b:
            ffwm r9 = r8.c
            dtz r3 = defpackage.dtz.a
            r9.b(r3)
            goto L23
        L83:
            return r0
        L84:
            ffwm r0 = r8.c
            dtz r1 = defpackage.dtz.a
            r0.b(r1)
            throw r9
        L8c:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        duh duhVar = new duh(this.b, this.d, this.c, ffguVar);
        duhVar.e = obj;
        return duhVar;
    }
}
