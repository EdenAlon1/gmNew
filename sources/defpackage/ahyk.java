package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyk implements ahxr {
    public static final entd a = entd.c("BugleMultiShare");
    private final ffbr A;
    private final fgdj B;
    public final ffsk b;
    public final ffsk c;
    public final ffhd d;
    public final equr e;
    public final Context f;
    public final elbx g;
    public final zwe h;
    public final ahxo i;
    public final ffbr j;
    public final xyg k;
    public final ahxk l;
    public final ecrj m;
    public final ffbr n;
    public final ffbr o;
    public final auhp p;
    public final ffbr q;
    public final fgjb r;
    public final cwos s;
    private final ahuu t;
    private final alxl u;
    private final aqkp v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;

    public ahyk(ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar, equr equrVar, Context context, elbx elbxVar, zwe zweVar, ahxo ahxoVar, ahuu ahuuVar, alxl alxlVar, aqkp aqkpVar, cslr cslrVar, ffbr ffbrVar, xyg xygVar, ahxk ahxkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cwos cwosVar, ffbr ffbrVar5, ecrj ecrjVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, auhp auhpVar, ffbr ffbrVar9) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        equrVar.getClass();
        context.getClass();
        elbxVar.getClass();
        zweVar.getClass();
        ahxoVar.getClass();
        ahuuVar.getClass();
        alxlVar.getClass();
        aqkpVar.getClass();
        cslrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cwosVar.getClass();
        ffbrVar5.getClass();
        ecrjVar.getClass();
        ffbrVar6.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        this.b = ffskVar;
        this.c = ffskVar2;
        this.d = ffhdVar;
        this.e = equrVar;
        this.f = context;
        this.g = elbxVar;
        this.h = zweVar;
        this.i = ahxoVar;
        this.t = ahuuVar;
        this.u = alxlVar;
        this.v = aqkpVar;
        this.j = ffbrVar;
        this.k = xygVar;
        this.l = ahxkVar;
        this.w = ffbrVar2;
        this.x = ffbrVar3;
        this.y = ffbrVar4;
        this.s = cwosVar;
        this.z = ffbrVar5;
        this.m = ecrjVar;
        this.A = ffbrVar6;
        this.n = ffbrVar7;
        this.o = ffbrVar8;
        this.p = auhpVar;
        this.q = ffbrVar9;
        this.r = new fgjf();
        this.B = axqw.c(ahxoVar.a(), ffskVar, new ffji() { // from class: ahxv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final ahxn ahxnVar = (ahxn) obj;
                ahxnVar.getClass();
                if (ahxnVar instanceof ahxm) {
                    final ahyk ahykVar = ahyk.this;
                    return new dmof(dmzz.dm, new ffix() { // from class: ahxt
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            boolean d;
                            xhu xhuVar = ((ahxm) ahxnVar).a;
                            ahyk ahykVar2 = ahyk.this;
                            ekzm b = ahykVar2.g.b("MultiShare SendButtonUiAdapterImpl#onSend");
                            try {
                                try {
                                    if (((auhm) ahykVar2.q.b()).a()) {
                                        d = ahykVar2.r.d(null);
                                        if (!d) {
                                            ((ensz) ahyk.a.e()).q("Failed to acquire send mutex");
                                            ffig.a(b, null);
                                            return ffcu.a;
                                        }
                                    }
                                    ecri d2 = ahykVar2.m.d();
                                    ahykVar2.h.c();
                                    fjay a2 = cslr.a();
                                    if (((atdn) ahykVar2.o.b()).a()) {
                                        axol.k(ahykVar2.b, null, new ahyg(ahykVar2, axol.k(ahykVar2.c, null, new ahyi(ahykVar2, xhuVar, a2, d2, null), 3), null), 3);
                                    } else {
                                        axol.k(ahykVar2.b, ahykVar2.d, new ahyh(ahykVar2, xhuVar, a2, d2, null), 2);
                                    }
                                    ffig.a(b, null);
                                    return ffcu.a;
                                } catch (Throwable th) {
                                    if (((auhm) ahykVar2.q.b()).a()) {
                                        ahykVar2.r.b(null);
                                    }
                                    throw th;
                                }
                            } finally {
                            }
                        }
                    }, (ffix) null, (String) null, true, new dmoe(1), 28);
                }
                if (!(ahxnVar instanceof ahxl)) {
                    throw new ffcd();
                }
                return new dmof(dmzz.dm, new ffix() { // from class: ahxu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        entd entdVar = ahyk.a;
                        return ffcu.a;
                    }
                }, (ffix) null, ((ahxl) ahxnVar).a, false, new dmoe(1), 20);
            }
        });
    }

    @Override // defpackage.ahxr
    public final fgdj a() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.multishare.chip.ChipData r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahyb
            if (r0 == 0) goto L13
            r0 = r6
            ahyb r0 = (defpackage.ahyb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahyb r0 = new ahyb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            com.google.android.apps.messaging.multishare.chip.ChipId r5 = r5.a
            boolean r6 = r5 instanceof com.google.android.apps.messaging.multishare.chip.ChipId.Identity
            if (r6 == 0) goto L66
            aqkp r6 = r4.v
            com.google.android.apps.messaging.multishare.chip.ChipId$Identity r5 = (com.google.android.apps.messaging.multishare.chip.ChipId.Identity) r5
            aoku r5 = r5.a
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r5 = r6.f(r5)
            engw r5 = defpackage.engw.r(r5)
            r5.getClass()
            r0.c = r3
            alxl r6 = r4.u
            r2 = 0
            elfl r5 = r6.k(r5, r2)
            r5.getClass()
            ffss r5 = defpackage.axol.e(r5)
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L65
        L5f:
            r6.getClass()
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
            return r6
        L65:
            return r1
        L66:
            com.google.android.apps.messaging.multishare.chip.ChipId$Conversation r5 = (com.google.android.apps.messaging.multishare.chip.ChipId.Conversation) r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.a
            alxl r6 = r4.u
            alxk r0 = defpackage.alxk.MINIMAL
            com.google.android.apps.messaging.shared.api.messaging.Conversation r5 = r6.a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyk.b(com.google.android.apps.messaging.multishare.chip.ChipData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.xhu r10, defpackage.fjay r11, defpackage.ecri r12, defpackage.ffgu r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.ahyc
            if (r0 == 0) goto L13
            r0 = r13
            ahyc r0 = (defpackage.ahyc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahyc r0 = new ahyc
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ecri r12 = r0.e
            ahyk r10 = r0.d
            defpackage.ffci.b(r13)
            goto L8d
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.ffci.b(r13)
            ahuu r13 = r9.t
            ahut r13 = r13.a()
            java.util.List r13 = r13.c()
            ffbr r2 = r9.w
            java.lang.Object r2 = r2.b()
            aifv r2 = (defpackage.aifv) r2
            int r5 = r13.size()
            r6 = 2
            r7 = 10
            r8 = 0
            defpackage.aifv.d(r2, r7, r8, r5, r6)
            ffyd r2 = new ffyd
            r2.<init>(r13)
            ahyd r13 = new ahyd
            r13.<init>(r9, r4)
            ffxx r13 = defpackage.embj.a(r2, r13)
            ahye r2 = new ahye
            r2.<init>(r4)
            ahya r5 = new ahya
            r5.<init>(r13, r2, r4)
            fgcp r13 = new fgcp
            r13.<init>(r5)
            fgby r2 = new fgby
            r2.<init>(r13)
            ahyf r13 = new ahyf
            r13.<init>(r9, r10, r11, r4)
            ffxx r10 = defpackage.embj.a(r2, r13)
            r0.d = r9
            r0.e = r12
            r0.c = r3
            java.lang.Object r10 = defpackage.ffyk.a(r10, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            r10 = r9
        L8d:
            ecrj r10 = r10.m
            ecda r11 = defpackage.aifw.f
            ecrh r13 = defpackage.ecrh.SUCCESS
            r10.f(r12, r11, r4, r13)
            entd r10 = defpackage.ahyk.a
            ensk r10 = r10.e()
            ensz r10 = (defpackage.ensz) r10
            java.lang.String r11 = "Done sending message individually."
            r10.q(r11)
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyk.c(xhu, fjay, ecri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(10:5|6|(2:(1:(1:(1:(1:(3:13|14|15)(2:17|18))(7:19|20|21|22|23|14|15))(8:33|34|35|36|37|38|(4:40|23|14|15)|29))(9:44|45|46|47|48|49|50|(4:52|37|38|(0))|29))(4:58|59|60|61)|27)(11:80|81|82|83|84|85|86|87|88|(1:90)|29)|62|63|(1:74)|(1:68)(1:73)|69|(5:71|48|49|50|(0))|29))|100|6|(0)(0)|62|63|(1:65)|74|(0)(0)|69|(0)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0243, code lost:
    
        if (r0.a(r15, r4, r2) == r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a A[Catch: alxe -> 0x01f3, TryCatch #2 {alxe -> 0x01f3, blocks: (B:63:0x0116, B:65:0x0131, B:68:0x013a, B:69:0x0141), top: B:62:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ahxs] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.Conversation r28, defpackage.xhu r29, defpackage.fjay r30, defpackage.ffgu r31) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyk.d(com.google.android.apps.messaging.shared.api.messaging.Conversation, xhu, fjay, ffgu):java.lang.Object");
    }
}
