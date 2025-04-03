package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzm implements dkzs {
    public static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/MoiraiApi");
    public final dlgb b;
    public final dlhj c;
    public final dlfe d;
    public final dkze e;
    public final dlat f;
    public boolean g;
    public final fgjb h;
    private final ffsd i;
    private final dlib j;
    private final dlpw k;
    private final long l;
    private final long m;
    private final boolean n;
    private final akic o;

    public dkzm(dlgb dlgbVar, akic akicVar, dlhj dlhjVar, dlfe dlfeVar, dkze dkzeVar, ffsd ffsdVar, dlib dlibVar, dlpw dlpwVar, long j, long j2, boolean z) {
        akicVar.getClass();
        dlhjVar.getClass();
        dlibVar.getClass();
        dlpwVar.getClass();
        this.b = dlgbVar;
        this.o = akicVar;
        this.c = dlhjVar;
        this.d = dlfeVar;
        this.e = dkzeVar;
        this.i = ffsdVar;
        this.j = dlibVar;
        this.k = dlpwVar;
        this.l = j;
        this.m = j2;
        this.n = z;
        dlij dE = akicVar.a.a.dE();
        ffsd gD = akicVar.a.a.gD();
        akis akisVar = akicVar.a.a;
        this.f = new dlck(dlgbVar, dE, gD, new dlbf(akisVar.dB(), (dlib) akisVar.kN.b(), akisVar.dC()), (dlib) akicVar.a.a.kN.b(), akicVar.a.a.dB());
        this.h = new fgjf();
    }

    private final int i() {
        dlhj dlhjVar = this.c;
        if (dlhjVar instanceof dlhv) {
            return 2;
        }
        if (dlhjVar instanceof dlhr) {
            dlhr dlhrVar = (dlhr) dlhjVar;
            dlhj dlhjVar2 = (dlhj) dlhrVar.c.get(this.b);
            if (ffkj.e(dlhjVar2, dlhrVar.a)) {
                return 2;
            }
            if (ffkj.e(dlhjVar2, dlhrVar.b)) {
                return 3;
            }
        }
        return 1;
    }

    private final Object j(dlgb dlgbVar, int i) {
        dlfk a2 = this.d.a(dlgbVar.b);
        if (a2 != null) {
            a2.f(dlgbVar, i);
        }
        return ffcu.a;
    }

    public final dlia a() {
        return this.j.a(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0114, code lost:
    
        if (r2.f(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010a, code lost:
    
        if (defpackage.ffcu.a != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        if (r11.e(r6, (defpackage.dlhe) r2, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzm.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dkzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dlfy r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dkzg
            if (r0 == 0) goto L13
            r0 = r6
            dkzg r0 = (defpackage.dkzg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkzg r0 = new dkzg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffel r6 = defpackage.ffel.a
            r0.c = r3
            r2 = 0
            java.lang.Object r6 = r4.d(r5, r2, r6, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            dlga r6 = (defpackage.dlga) r6
            dlgu r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzm.c(dlfy, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dlfy r19, defpackage.rum r20, java.util.List r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzm.d(dlfy, rum, java.util.List, ffgu):java.lang.Object");
    }

    @Override // defpackage.dkzs
    public final Object e(ffgu ffguVar) {
        Object c = this.c.c(this.b, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r4.e(r2, r11, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r2.j(r11, 8) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.dkzj
            if (r0 == 0) goto L13
            r0 = r11
            dkzj r0 = (defpackage.dkzj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkzj r0 = new dkzj
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.ffci.b(r11)
            goto Lc7
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            dkzm r2 = r0.d
            defpackage.ffci.b(r11)
            goto L98
        L3f:
            dkzm r2 = r0.d
            defpackage.ffci.b(r11)
            goto L8c
        L45:
            dkzm r2 = r0.d
            defpackage.ffci.b(r11)
            goto L5d
        L4b:
            defpackage.ffci.b(r11)
            dlhj r11 = r10.c
            dlgb r2 = r10.b
            r0.d = r10
            r0.c = r6
            java.lang.Object r11 = r11.d(r2, r0)
            if (r11 == r1) goto Lca
            r2 = r10
        L5d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lc7
            enru r11 = defpackage.dkzm.a
            ensk r11 = r11.h()
            java.lang.String r6 = "ensureProtectionsLoaded"
            r7 = 368(0x170, float:5.16E-43)
            java.lang.String r8 = "com/google/android/libraries/abuse/hades/moirai/MoiraiApi"
            java.lang.String r9 = "MoiraiApi.kt"
            ensk r11 = r11.h(r8, r6, r7, r9)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r6 = "Loading protections from disk since no protections were loaded"
            r11.q(r6)
            dlgb r11 = r2.b
            r0.d = r2
            r0.c = r5
            r5 = 8
            java.lang.Object r11 = r2.j(r11, r5)
            if (r11 == r1) goto Lca
        L8c:
            dlat r11 = r2.f
            r0.d = r2
            r0.c = r4
            java.lang.Object r11 = r11.a(r0)
            if (r11 == r1) goto Lca
        L98:
            dlhe r11 = (defpackage.dlhe) r11
            if (r11 == 0) goto Lac
            dlhj r4 = r2.c
            dlgb r2 = r2.b
            r5 = 0
            r0.d = r5
            r0.c = r3
            java.lang.Object r11 = r4.e(r2, r11, r0)
            if (r11 != r1) goto Lc7
            goto Lca
        Lac:
            r11 = r2
            dlgk r2 = new dlgk
            dlgb r0 = r11.b
            java.lang.String r0 = r0.b
            int r7 = r11.i()
            java.lang.String r11 = "no protections were found on disk for client role "
            java.lang.String r5 = r11.concat(r0)
            r6 = 0
            r8 = 24
            r3 = 15
            r4 = 4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            throw r2
        Lc7:
            ffcu r11 = defpackage.ffcu.a
            return r11
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzm.f(ffgu):java.lang.Object");
    }

    @Override // defpackage.dkzs
    public final Object g(dlfy dlfyVar, rum rumVar, ffgu ffguVar) {
        Object d = d(dlfyVar, rumVar, ffel.a, ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.dkzl
            if (r0 == 0) goto L13
            r0 = r11
            dkzl r0 = (defpackage.dkzl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkzl r0 = new dkzl
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            dkzm r0 = r0.d
            defpackage.ffci.b(r11)
            goto L81
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            dkzm r2 = r0.d
            defpackage.ffci.b(r11)
            goto L52
        L3b:
            defpackage.ffci.b(r11)
            boolean r11 = r10.n
            if (r11 == 0) goto L60
            dlia r11 = r10.a()
            r0.d = r10
            r0.c = r5
            java.lang.Object r11 = r11.g(r0)
            if (r11 != r1) goto L51
            goto L7f
        L51:
            r2 = r10
        L52:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r8 = r2.m
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L61
            r11 = r5
            goto L62
        L60:
            r2 = r10
        L61:
            r11 = r4
        L62:
            if (r11 == 0) goto L69
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        L69:
            long r6 = r2.l
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto La1
            dlia r11 = r2.a()
            r0.d = r2
            r0.c = r3
            java.lang.Object r11 = r11.d(r0)
            if (r11 != r1) goto L80
        L7f:
            return r1
        L80:
            r0 = r2
        L81:
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto La1
            long r1 = r11.longValue()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.DAYS
            long r6 = r0.l
            long r6 = r11.toMillis(r6)
            dlpw r11 = r0.k
            j$.time.Instant r11 = r11.f()
            long r8 = r11.toEpochMilli()
            long r8 = r8 - r1
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 < 0) goto La1
            r4 = r5
        La1:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzm.h(ffgu):java.lang.Object");
    }
}
