package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cicd implements cifg {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/ditto/ConversationGroupNameSearchDelegate");
    private final ffsk b;
    private final chqc c;
    private final amav d;
    private final alxl e;
    private final aqkp f;
    private final ffbr g;
    private final ffbr h;
    private final aolr i;

    public cicd(ffsk ffskVar, ffsk ffskVar2, chqc chqcVar, amav amavVar, alxl alxlVar, aqkp aqkpVar, ffbr ffbrVar, ffbr ffbrVar2, aolr aolrVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        chqcVar.getClass();
        amavVar.getClass();
        alxlVar.getClass();
        aqkpVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        aolrVar.getClass();
        this.b = ffskVar2;
        this.c = chqcVar;
        this.d = amavVar;
        this.e = alxlVar;
        this.f = aqkpVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = aolrVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        elfl c;
        erxk erxkVar = (erxk) eyhsVar;
        erxkVar.getClass();
        ensk e = a.e();
        e.Y(ente.a, "BugleDitto");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.O, "ConversationGroupNameSearchDelegate");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/ConversationGroupNameSearchDelegate", "handleRequestInternal", 68, "ConversationGroupNameSearchDelegate.kt")).q("Handle Group Conversation Search Request.");
        c = axol.c(this.b, ffhe.a, ffsm.a, new cicc(this, erxkVar, null));
        return c;
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        erxk erxkVar = (erxk) eyfy.parseFrom(erxk.a, eyeeVar);
        erxkVar.getClass();
        return erxkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00d3 -> B:11:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.bfki r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cicd.d(bfki, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.erxk r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ciby
            if (r0 == 0) goto L13
            r0 = r7
            ciby r0 = (defpackage.ciby) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ciby r0 = new ciby
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            cicd r6 = r0.d
            defpackage.ffci.b(r7)
            goto L46
        L38:
            defpackage.ffci.b(r7)
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 == r1) goto L88
            r6 = r5
        L46:
            engw r7 = (defpackage.engw) r7
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L63
            erxm r6 = defpackage.erxm.a
            eyfq r6 = r6.createBuilder()
            erxl r6 = (defpackage.erxl) r6
            r6.getClass()
            eyfy r6 = r6.build()
            r6.getClass()
            erxm r6 = (defpackage.erxm) r6
            return r6
        L63:
            bfkr r2 = defpackage.bfks.n()
            r2.b(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r4 = r2
            becl r4 = (defpackage.becl) r4
            r4.b = r7
            bfks r7 = r2.a()
            bfki r7 = r7.l()
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.d(r7, r0)
            if (r6 != r1) goto L87
            goto L88
        L87:
            return r6
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cicd.e(erxk, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[LOOP:0: B:11:0x006f->B:13:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[LOOP:1: B:16:0x0090->B:18:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cibz
            if (r0 == 0) goto L13
            r0 = r6
            cibz r0 = (defpackage.cibz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cibz r0 = new cibz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cicd r5 = r0.d
            defpackage.ffci.b(r6)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            int r6 = r5.length()
            if (r6 != 0) goto L42
            int r5 = defpackage.engw.d
            engw r5 = defpackage.enou.a
            r5.getClass()
            return r5
        L42:
            amav r6 = r4.d
            amaw r6 = r6.b()
            elfl r5 = r6.b(r5)
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            r5 = r4
        L5b:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = defpackage.ffdx.n(r6, r1)
            r0.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r6.next()
            ambn r2 = (defpackage.ambn) r2
            aoku r2 = r2.b()
            r0.add(r2)
            goto L6f
        L83:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r1 = defpackage.ffdx.n(r0, r1)
            r6.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            aoku r1 = (defpackage.aoku) r1
            aqkp r2 = r5.f
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r1 = r2.f(r1)
            r6.add(r1)
            goto L90
        La6:
            engw r5 = defpackage.engq.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cicd.f(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        if (r2 == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e A[LOOP:1: B:23:0x0098->B:25:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[LOOP:2: B:28:0x00bd->B:30:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.erxk r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cicd.g(erxk, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.bcyk r5, defpackage.engw r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cicb
            if (r0 == 0) goto L13
            r0 = r7
            cicb r0 = (defpackage.cicb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cicb r0 = new cicb
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            ffbr r7 = r4.h
            java.lang.Object r7 = r7.b()
            cgzv r7 = (defpackage.cgzv) r7
            elfl r5 = r7.e(r5, r6)
            r5.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cicd.h(bcyk, engw, ffgu):java.lang.Object");
    }
}
