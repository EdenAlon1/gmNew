package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnnv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations");
    public final ayif b;
    public final ffbr c;
    public final ayfy d;
    public final cqoh e;
    private final ffhd f;
    private final aqky g;
    private final ffbr h;

    public cnnv(ffhd ffhdVar, aqky aqkyVar, ffbr ffbrVar, ayif ayifVar, ffbr ffbrVar2, ayfy ayfyVar, cqoh cqohVar) {
        ffhdVar.getClass();
        aqkyVar.getClass();
        ffbrVar.getClass();
        ayifVar.getClass();
        ffbrVar2.getClass();
        ayfyVar.getClass();
        cqohVar.getClass();
        this.f = ffhdVar;
        this.g = aqkyVar;
        this.h = ffbrVar;
        this.b = ayifVar;
        this.c = ffbrVar2;
        this.d = ayfyVar;
        this.e = cqohVar;
    }

    public static final boolean f(aoku aokuVar) {
        return aojl.a(aokuVar.n());
    }

    private static final boolean g(cnui cnuiVar) {
        cnuh b = cnuh.b(cnuiVar.c);
        if (b == null) {
            b = cnuh.UNRECOGNIZED;
        }
        return b == cnuh.SESSION_STATUS_DEMO;
    }

    private static final boolean h(aoku aokuVar) {
        return aojl.b(aokuVar.n());
    }

    public final ParticipantsTable.BindData a(aoku aokuVar) {
        aokuVar.getClass();
        if (!aokuVar.C()) {
            throw new IllegalArgumentException("Only satellite identities are supported");
        }
        ParticipantsTable.BindData a2 = this.g.a(aokuVar);
        ((bdrr) this.h.b()).i(a2);
        a2.getClass();
        return a2;
    }

    public final Object b(int i, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.f), new cnnr(null, this, i), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final Object c(ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.f), new cnns(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final Object d(ffgu ffguVar) {
        Object b = b(9, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r0 == defpackage.cnuh.SESSION_STATUS_EMERGENCY) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aoku r4, defpackage.cnui r5, defpackage.ffgu r6) {
        /*
            r3 = this;
            boolean r0 = r4.C()
            if (r0 == 0) goto L58
            boolean r0 = f(r4)
            if (r0 != 0) goto L21
            boolean r0 = h(r4)
            if (r0 == 0) goto L19
            boolean r0 = g(r5)
            if (r0 == 0) goto L19
            goto L21
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Emergency demo conversation is supported only when the active session is in demo mode"
            r4.<init>(r5)
            throw r4
        L21:
            boolean r0 = f(r4)
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r5.c
            cnuh r0 = defpackage.cnuh.b(r0)
            if (r0 != 0) goto L32
            cnuh r0 = defpackage.cnuh.UNRECOGNIZED
        L32:
            cnuh r2 = defpackage.cnuh.SESSION_STATUS_EMERGENCY
            if (r0 != r2) goto L37
            goto L47
        L37:
            boolean r0 = h(r4)
            r2 = 9
            if (r0 == 0) goto L46
            boolean r5 = g(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            r1 = r2
        L47:
            ffhd r5 = r3.f
            ffhd r5 = defpackage.ekxi.a(r5)
            cnnt r0 = new cnnt
            r2 = 0
            r0.<init>(r2, r3, r4, r1)
            java.lang.Object r4 = defpackage.ffra.a(r5, r0, r6)
            return r4
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Only satellite identities are supported"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnnv.e(aoku, cnui, ffgu):java.lang.Object");
    }
}
