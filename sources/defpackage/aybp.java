package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybp implements aybe {
    public static final entd a = entd.c("BugleContacts");
    public final comc b;
    public final axwk c;
    public final axwf d;
    public final ffbr e;
    public final aydo f;
    public final aydt g;
    private final ffhd h;
    private final ffhd i;
    private final cqoh j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final cbwj q;

    public aybp(ffhd ffhdVar, ffhd ffhdVar2, cqoh cqohVar, cbwj cbwjVar, comc comcVar, axwk axwkVar, axwf axwfVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, aydo aydoVar, aydt aydtVar, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        cqohVar.getClass();
        cbwjVar.getClass();
        comcVar.getClass();
        axwkVar.getClass();
        axwfVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        aydoVar.getClass();
        aydtVar.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.h = ffhdVar;
        this.i = ffhdVar2;
        this.j = cqohVar;
        this.q = cbwjVar;
        this.b = comcVar;
        this.c = axwkVar;
        this.d = axwfVar;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.e = ffbrVar4;
        this.n = ffbrVar5;
        this.f = aydoVar;
        this.g = aydtVar;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
    }

    @Override // defpackage.aybe
    public final Object a(int i, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.h), new aybo(null, this, i), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        if (defpackage.ffsw.c(r5, r1) == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x013c -> B:17:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r20, double r22, defpackage.ffji r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aybp.b(long, double, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aybj
            if (r0 == 0) goto L13
            r0 = r7
            aybj r0 = (defpackage.aybj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aybj r0 = new aybj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ekzz r6 = r0.e
            aybp r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L66
        L2b:
            r7 = move-exception
            goto L73
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ffci.b(r7)
            java.lang.String r7 = "ContactsChangeSync#sync"
            ekzz r7 = defpackage.eleg.f(r7)
            entd r2 = defpackage.aybp.a     // Catch: java.lang.Throwable -> L6e
            ensk r2 = r2.e()     // Catch: java.lang.Throwable -> L6e
            ensz r2 = (defpackage.ensz) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "Syncing changed contacts"
            r2.q(r4)     // Catch: java.lang.Throwable -> L6e
            ffbr r2 = r5.m     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6e
            r2.getClass()     // Catch: java.lang.Throwable -> L6e
            akzt r2 = (defpackage.akzt) r2     // Catch: java.lang.Throwable -> L6e
            defpackage.axuo.b(r2, r3)     // Catch: java.lang.Throwable -> L6e
            r0.d = r5     // Catch: java.lang.Throwable -> L6e
            r0.e = r7     // Catch: java.lang.Throwable -> L6e
            r0.c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r5.d(r6, r0)     // Catch: java.lang.Throwable -> L6e
            if (r6 == r1) goto L6d
            r6 = r7
        L66:
            r7 = 0
            defpackage.ffig.a(r6, r7)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L6d:
            return r1
        L6e:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r5
        L73:
            ffbr r0 = r0.m     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L83
            r0.getClass()     // Catch: java.lang.Throwable -> L83
            akzt r0 = (defpackage.akzt) r0     // Catch: java.lang.Throwable -> L83
            r1 = 3
            defpackage.axuo.b(r0, r1)     // Catch: java.lang.Throwable -> L83
            throw r7     // Catch: java.lang.Throwable -> L83
        L83:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aybp.c(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0429, code lost:
    
        if (defpackage.ffra.a(r3, r4, r9) != r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01ed, code lost:
    
        if (defpackage.fgfz.c(r1, r9) == r2) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ac A[LOOP:8: B:160:0x01a6->B:162:0x01ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r17v1, types: [aybp, ecri, ffgu, java.lang.Object, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r30, defpackage.ffgu r31) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aybp.d(int, ffgu):java.lang.Object");
    }
}
