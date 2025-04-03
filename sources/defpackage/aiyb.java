package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiyb implements aixt {
    public final ffbr b;
    public final ffbr c;
    private final eisx d;
    private final aepg e;
    private final ejar f;
    private final ffbr g;
    private final ffsk h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final atte q;
    private final attd r;
    private final enru s;

    public aiyb(eisx eisxVar, aepg aepgVar, ejar ejarVar, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, atte atteVar, attd attdVar) {
        eisxVar.getClass();
        aepgVar.getClass();
        ejarVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar9.getClass();
        ffbrVar11.getClass();
        atteVar.getClass();
        attdVar.getClass();
        this.d = eisxVar;
        this.e = aepgVar;
        this.f = ejarVar;
        this.g = ffbrVar;
        this.b = ffbrVar2;
        this.h = ffskVar;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.c = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.o = ffbrVar10;
        this.p = ffbrVar11;
        this.q = atteVar;
        this.r = attdVar;
        this.s = enru.c("com/google/android/apps/messaging/penpal/PenpalAvailabilityCheckerImpl");
    }

    private final void g(List list, boolean z) {
        List list2;
        if (list.isEmpty()) {
            list2 = list;
        } else {
            ensk h = this.s.h();
            h.Y(ente.a, "BuglePenpal");
            list2 = list;
            ((enrr) h.h("com/google/android/apps/messaging/penpal/PenpalAvailabilityCheckerImpl", "logUnavailableReasons", 285, "PenpalAvailabilityCheckerImpl.kt")).t("Penpal availability check results: %s", ffdx.aA(list2, ",", null, null, null, 62));
        }
        if (z) {
            akzt akztVar = (akzt) this.n.b();
            if (list2.isEmpty()) {
                akztVar.c("Bugle.Penpal.PenpalAvailabilityChecker.Success");
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                akztVar.c("Bugle.Penpal.PenpalAvailabilityChecker.".concat(String.valueOf(((aixs) it.next()).name())));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0159, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.aixt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r10, boolean r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.a(java.util.List, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5 A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0039, B:13:0x009f, B:15:0x00a5), top: B:10:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r19, java.util.ArrayList r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.b(java.util.List, java.util.ArrayList, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.ArrayList r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aixv
            if (r0 == 0) goto L13
            r0 = r7
            aixv r0 = (defpackage.aixv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aixv r0 = new aixv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            goto L73
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            emyl r7 = defpackage.ctjd.ak
            java.lang.Object r7 = r7.get()
            cfup r7 = (defpackage.cfup) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La5
            cfup r7 = defpackage.ctjd.aJ
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L57
            goto La5
        L57:
            ffbr r7 = r5.g
            java.lang.Object r7 = r7.b()
            adkp r7 = (defpackage.adkp) r7
            eisx r2 = r5.d
            evsb r4 = defpackage.evse.a
            java.lang.String r4 = r4.a
            elfl r7 = r7.a(r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto La4
        L73:
            adko r7 = (defpackage.adko) r7
            if (r7 != 0) goto L78
            goto L86
        L78:
            int r7 = r7.ordinal()
            if (r7 == 0) goto La5
            if (r7 == r3) goto L9c
            r0 = 2
            if (r7 == r0) goto L94
            r0 = 3
            if (r7 != r0) goto L8e
        L86:
            aixs r7 = defpackage.aixs.f
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto La5
        L8e:
            ffcd r6 = new ffcd
            r6.<init>()
            throw r6
        L94:
            aixs r7 = defpackage.aixs.a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto La5
        L9c:
            aixs r7 = defpackage.aixs.e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto La5
        La4:
            return r1
        La5:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.c(java.util.ArrayList, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.ArrayList r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aixw
            if (r0 == 0) goto L13
            r0 = r7
            aixw r0 = (defpackage.aixw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aixw r0 = new aixw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.g
            java.lang.Object r7 = r7.b()
            adkp r7 = (defpackage.adkp) r7
            eisx r2 = r5.d
            evsb r4 = defpackage.evsf.a
            java.lang.String r4 = r4.a
            elfl r7 = r7.a(r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L9f
        L50:
            adko r7 = (defpackage.adko) r7
            if (r7 != 0) goto L55
            goto L63
        L55:
            int r7 = r7.ordinal()
            if (r7 == 0) goto L9c
            if (r7 == r3) goto L95
            r0 = 2
            if (r7 == r0) goto L8d
            r0 = 3
            if (r7 != r0) goto L87
        L63:
            cfup r7 = defpackage.ctjd.bd
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7f
            cfup r7 = defpackage.ctjd.bg
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9c
        L7f:
            aixs r7 = defpackage.aixs.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto L9c
        L87:
            ffcd r6 = new ffcd
            r6.<init>()
            throw r6
        L8d:
            aixs r7 = defpackage.aixs.a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto L9c
        L95:
            aixs r7 = defpackage.aixs.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
        L9c:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.d(java.util.ArrayList, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (((defpackage.ejbo) (r6 != null ? r0.b : r0.c(r6))).c != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aixx
            if (r0 == 0) goto L13
            r0 = r6
            aixx r0 = (defpackage.aixx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aixx r0 = new aixx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            aiyb r0 = r0.e
            defpackage.ffci.b(r6)
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            cfup r6 = defpackage.ctjd.aR
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L87
            aepg r6 = r4.e
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r4
        L54:
            eixz r6 = (defpackage.eixz) r6
            if (r6 == 0) goto L80
            ejar r0 = r0.f
            boolean r0 = r0.f(r6)
            if (r0 == 0) goto L80
            eyfw r0 = defpackage.ejbv.a
            eyfw r0 = defpackage.eyfy.m378$$Nest$smcheckIsLite(r0)
            r6.b(r0)
            eyfj r6 = r6.r
            eyfv r1 = r0.d
            java.lang.Object r6 = r6.l(r1)
            if (r6 != 0) goto L76
            java.lang.Object r6 = r0.b
            goto L7a
        L76:
            java.lang.Object r6 = r0.c(r6)
        L7a:
            ejbo r6 = (defpackage.ejbo) r6
            boolean r6 = r6.c
            if (r6 != 0) goto L87
        L80:
            aixs r6 = defpackage.aixs.b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
        L87:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.e(java.util.ArrayList, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[Catch: Exception -> 0x0033, TryCatch #2 {Exception -> 0x0033, blocks: (B:11:0x002f, B:12:0x008b, B:14:0x0093, B:16:0x009e, B:19:0x00b0, B:20:0x00b4, B:22:0x00ba, B:31:0x00d0, B:33:0x0129, B:39:0x010b, B:36:0x00f6), top: B:10:0x002f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.ArrayList r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb.f(java.util.ArrayList, ffgu):java.lang.Object");
    }
}
