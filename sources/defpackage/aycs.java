package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycs implements aycj {
    public static final /* synthetic */ int e = 0;
    private static final entd f = entd.c("BugleContacts");
    public final comc a;
    public final axwf b;
    public final ffbr c;
    public final aydt d;
    private final ffhd g;
    private final ffhd h;
    private final cqoh i;
    private final axwk j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final cbwj r;

    public aycs(ffhd ffhdVar, ffhd ffhdVar2, cqoh cqohVar, cbwj cbwjVar, comc comcVar, axwk axwkVar, axwf axwfVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, aydt aydtVar, ffbr ffbrVar8) {
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
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        aydtVar.getClass();
        ffbrVar8.getClass();
        this.g = ffhdVar;
        this.h = ffhdVar2;
        this.i = cqohVar;
        this.r = cbwjVar;
        this.a = comcVar;
        this.j = axwkVar;
        this.b = axwfVar;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.c = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.d = aydtVar;
        this.q = ffbrVar8;
    }

    @Override // defpackage.aycj
    public final Object a(ayci ayciVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.g), new aycr(null, this, ayciVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ayci r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ayco
            if (r0 == 0) goto L13
            r0 = r7
            ayco r0 = (defpackage.ayco) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayco r0 = new ayco
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ekzz r6 = r0.e
            aycs r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L67
        L2b:
            r7 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ffci.b(r7)
            java.lang.String r7 = "DeletedContactsSync#sync"
            ekzz r7 = defpackage.eleg.f(r7)
            entd r2 = defpackage.aycs.f     // Catch: java.lang.Throwable -> L6f
            ensk r2 = r2.e()     // Catch: java.lang.Throwable -> L6f
            ensz r2 = (defpackage.ensz) r2     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Syncing deleted contacts"
            r2.q(r4)     // Catch: java.lang.Throwable -> L6f
            ffbr r2 = r5.c     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L6f
            r2.getClass()     // Catch: java.lang.Throwable -> L6f
            akzt r2 = (defpackage.akzt) r2     // Catch: java.lang.Throwable -> L6f
            r4 = 2
            defpackage.axuo.b(r2, r4)     // Catch: java.lang.Throwable -> L6f
            r0.d = r5     // Catch: java.lang.Throwable -> L6f
            r0.e = r7     // Catch: java.lang.Throwable -> L6f
            r0.c = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 == r1) goto L6e
            r6 = r7
        L67:
            r7 = 0
            defpackage.ffig.a(r6, r7)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L6e:
            return r1
        L6f:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r5
        L74:
            ffbr r0 = r0.c     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            akzt r0 = (defpackage.akzt) r0     // Catch: java.lang.Throwable -> L84
            r1 = 4
            defpackage.axuo.b(r0, r1)     // Catch: java.lang.Throwable -> L84
            throw r7     // Catch: java.lang.Throwable -> L84
        L84:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycs.b(ayci, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0352, code lost:
    
        if (defpackage.ffra.a(r4, r5, r2) != r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d8, code lost:
    
        if (r1 == r3) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ed A[LOOP:0: B:36:0x02e7->B:38:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ayci r27, defpackage.ffgu r28) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycs.c(ayci, ffgu):java.lang.Object");
    }
}
