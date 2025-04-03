package defpackage;

import android.app.Notification;
import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdwo extends ceut {
    public static final cfup a = cfvl.k(cfvl.b, "default_cms_work_handler_attempt_limit", 10);
    public static final cfup b = cfvl.l(cfvl.b, "default_cms_work_handler_retry_delay_millis", 10000);
    public final babm c;
    public final cdws d;
    public final asjt e;
    public final cfyt f;
    private final Context g;
    private final poj h;
    private final ffsk i;
    private final cdwp j;
    private final Class k;
    private final Class l;
    private final eyhz m;
    private final poa n;
    private final int o;
    private final long p;
    private final cevc q;
    private final Optional r;
    private final Notification s;

    public cdwo(Context context, poj pojVar, ffsk ffskVar, cdwp cdwpVar, Class cls, babm babmVar, cdws cdwsVar, Class cls2, eyhz eyhzVar, poa poaVar, asjt asjtVar, int i, long j, cevc cevcVar, Optional optional, Notification notification, cfyt cfytVar) {
        pojVar.getClass();
        poaVar.getClass();
        cevcVar.getClass();
        this.g = context;
        this.h = pojVar;
        this.i = ffskVar;
        this.j = cdwpVar;
        this.k = cls;
        this.c = babmVar;
        this.d = cdwsVar;
        this.l = cls2;
        this.m = eyhzVar;
        this.n = poaVar;
        this.e = asjtVar;
        this.o = i;
        this.p = j;
        this.q = cevcVar;
        this.r = optional;
        this.s = notification;
        this.f = cfytVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(this.o);
        l.f(this.n);
        l.g(this.p);
        ceti cetiVar = (ceti) l;
        cetiVar.a = this.h;
        l.b(this.q);
        cetiVar.e = this.r;
        cetiVar.b = this.s;
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsSingleItemWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return this.m;
    }

    @Override // defpackage.ceut
    protected final elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        eyhsVar.getClass();
        c = axol.c(this.i, ffhe.a, ffsm.a, new cdwl(this, eyhsVar, ceuwVar, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ceuw r6, java.lang.Object r7, defpackage.eyhs r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cdwj
            if (r0 == 0) goto L13
            r0 = r9
            cdwj r0 = (defpackage.cdwj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdwj r0 = new cdwj
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r9)
            goto L49
        L36:
            defpackage.ffci.b(r9)
            cdws r9 = r5.d
            boolean r2 = r9 instanceof defpackage.cdwr
            if (r2 == 0) goto L4c
            cdwr r9 = (defpackage.cdwr) r9
            r0.c = r4
            java.lang.Object r9 = r9.d(r7, r6, r8, r0)
            if (r9 == r1) goto L64
        L49:
            ceyt r9 = (defpackage.ceyt) r9
            return r9
        L4c:
            boolean r2 = r9 instanceof defpackage.cdwq
            if (r2 == 0) goto L65
            cdwq r9 = (defpackage.cdwq) r9
            elfl r6 = r9.c(r6, r7, r8)
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r6, r0)
            if (r9 == r1) goto L64
        L5e:
            r9.getClass()
            ceyt r9 = (defpackage.ceyt) r9
            return r9
        L64:
            return r1
        L65:
            ffcd r6 = new ffcd
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdwo.k(ceuw, java.lang.Object, eyhs, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.eisx r9, defpackage.eyhs r10, defpackage.ceuw r11, java.lang.Exception r12, defpackage.ffgu r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.cdwk
            if (r0 == 0) goto L13
            r0 = r13
            cdwk r0 = (defpackage.cdwk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdwk r0 = new cdwk
            r0.<init>(r8, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            java.lang.Object r12 = r7.a
            defpackage.ffci.b(r13)
            goto L80
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            defpackage.ffci.b(r13)
            cdwp r1 = r8.j
            cskc r13 = defpackage.ceut.D
            csjb r13 = r13.e()
            java.lang.String r3 = "Queue hit a permanent failure. Calling the ErrorHandler."
            r13.I(r3)
            cdws r3 = r8.d
            java.lang.Class r3 = r3.getClass()
            java.lang.String r4 = "processor"
            java.lang.String r3 = r3.getCanonicalName()
            r13.A(r4, r3)
            cdwp r3 = r8.j
            java.lang.Class r3 = r3.getClass()
            java.lang.String r4 = "errorHandler"
            java.lang.String r3 = r3.getCanonicalName()
            r13.A(r4, r3)
            r13.r()
            android.content.Context r13 = r8.g
            java.lang.Class r3 = r8.k
            java.lang.Object r9 = defpackage.ekhv.a(r13, r3, r9)
            r9.getClass()
            cdws r5 = r8.d
            r7.a = r12
            r7.d = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L7f
            return r0
        L7f:
            r12 = r6
        L80:
            java.lang.Exception r12 = (java.lang.Exception) r12
            ceyt r9 = defpackage.ceyt.l(r12)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdwo.l(eisx, eyhs, ceuw, java.lang.Exception, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(2:48|(1:(1:(3:52|38|39)(2:53|54))(6:55|56|57|27|28|29))(3:58|59|60))(5:8|9|10|(1:12)|44)|13|14|(2:16|(1:18)(2:19|(2:21|(1:23))(1:24)))|(4:26|27|28|29)|44))|63|6|(0)(0)|13|14|(0)|(0)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        r3 = defpackage.ekxi.a(defpackage.ffuw.a);
        r13 = new defpackage.cdwm(null, r15, r0, r2, r18, r19);
        r11.g = null;
        r11.a = null;
        r11.b = null;
        r11.c = null;
        r11.f = 3;
        r0 = defpackage.ffra.a(r3, r13, r11);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:
    
        if (r0 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        r15 = r6;
        r18 = r8;
        r19 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:14:0x008a, B:16:0x009c, B:19:0x00a3, B:21:0x00a9, B:23:0x00bc, B:24:0x00c8), top: B:13:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [eyhs] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [eyhs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.eisx r21, defpackage.ceuw r22, defpackage.eyhs r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdwo.m(eisx, ceuw, eyhs, ffgu):java.lang.Object");
    }
}
