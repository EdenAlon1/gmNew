package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clxk extends ceut {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleTelephony");
    private static final ContentValues c;
    private final ffhd d;
    private final ffsk e;
    private final ejtr f;
    private final akzt g;

    static {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ct_cls", (Integer) 135);
        c = contentValues;
    }

    public clxk(ffhd ffhdVar, ffsk ffskVar, ejtr ejtrVar, akzt akztVar) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ejtrVar.getClass();
        akztVar.getClass();
        this.d = ffhdVar;
        this.e = ffskVar;
        this.f = ejtrVar;
        this.g = akztVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("MarkRcsMessagesInTelephonyWorkerHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = clwz.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c2;
        clwz clwzVar = (clwz) eyhsVar;
        clwzVar.getClass();
        c2 = axol.c(this.e, ffhe.a, ffsm.a, new clxi(this, ceuwVar, clwzVar, null));
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.net.Uri r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.clxj
            if (r0 == 0) goto L13
            r0 = r7
            clxj r0 = (defpackage.clxj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            clxj r0 = new clxj
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
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            ejtr r7 = r5.f
            android.content.ContentValues r2 = defpackage.clxk.c
            r4 = 0
            com.google.common.util.concurrent.ListenableFuture r7 = r7.h(r6, r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L63
        L47:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L4c
            goto L52
        L4c:
            int r0 = r7.intValue()
            if (r0 == r3) goto L5f
        L52:
            entd r0 = defpackage.clxk.b
            ensk r0 = r0.j()
            ensz r0 = (defpackage.ensz) r0
            java.lang.String r1 = "Did not mark RCS in telephony for %s"
            r0.t(r1, r6)
        L5f:
            r7.getClass()
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxk.k(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [ensz] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [clxk] */
    /* JADX WARN: Type inference failed for: r8v3, types: [clxk] */
    /* JADX WARN: Type inference failed for: r8v5, types: [clxk] */
    /* JADX WARN: Type inference failed for: r8v6, types: [clxk] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d3 -> B:13:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f5 -> B:14:0x0110). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(final defpackage.clwz r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxk.l(clwz, ffgu):java.lang.Object");
    }
}
