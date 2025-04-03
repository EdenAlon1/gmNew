package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemu implements cdwr {
    private static final eyfh a;
    private static final enru b;
    private final cemr c;
    private final cemm d;

    static {
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.getClass();
        eyfi.b(eyfgVar);
        eyfgVar.a("labels");
        a = eyfi.a(eyfgVar);
        b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/RemoveToBeDeliveredLabelWorkItemProcessor");
    }

    public cemu(cemr cemrVar, cemm cemmVar) {
        this.c = cemrVar;
        this.d = cemmVar;
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cemd) obj).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        if (defpackage.fgfz.c(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cemv r9, defpackage.cemd r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cems
            if (r0 == 0) goto L13
            r0 = r11
            cems r0 = (defpackage.cems) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cems r0 = new cems
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r11)
            goto Ldb
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            cemd r10 = r0.f
            java.lang.Object r9 = r0.a
            cemu r2 = r0.e
            defpackage.ffci.b(r11)
            goto L59
        L3d:
            defpackage.ffci.b(r11)
            crty r11 = r9.eR()
            java.lang.String r2 = r10.c
            elfl r11 = r11.q(r2)
            r0.e = r8
            r0.a = r9
            r0.f = r10
            r0.d = r4
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 == r1) goto Le0
            r2 = r8
        L59:
            eszz r11 = (defpackage.eszz) r11
            eygr r5 = r11.h
            java.lang.String r6 = "TBDBSD"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto La3
            cemr r9 = r2.c
            cemd r9 = defpackage.cemd.a
            eyfq r9 = r9.createBuilder()
            cemc r9 = (defpackage.cemc) r9
            r9.getClass()
            int r0 = r10.b
            defpackage.ceme.b(r0, r9)
            java.lang.String r10 = r10.c
            defpackage.ceme.c(r10, r9)
            defpackage.ceme.f(r9)
            eygr r10 = r11.h
            r10.getClass()
            defpackage.ceme.e(r10, r9)
            long r10 = r11.j
            defpackage.ceme.d(r10, r9)
            java.lang.String r10 = "remove_to_be_delivered_label"
            cemd r9 = defpackage.ceme.a(r9)
            ceyr r9 = defpackage.ceyr.g(r10, r9)
            java.util.List r9 = defpackage.ffdx.b(r9)
            engw r9 = defpackage.engq.a(r9)
            ceyt r9 = defpackage.ceyt.j(r9)
            return r9
        La3:
            enru r10 = defpackage.cemu.b
            ensk r10 = r10.e()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "BugleCms"
            r10.Y(r2, r5)
            java.lang.String r2 = "handleOldLastModSeq"
            r5 = 126(0x7e, float:1.77E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/RemoveToBeDeliveredLabelWorkItemProcessor"
            java.lang.String r7 = "RemoveToBeDeliveredLabelWorkItemProcessor.kt"
            ensk r10 = r10.h(r6, r2, r5, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "TO_BE_DELIVERED_BY_SIM_DEVICE label was removed by another client"
            r10.q(r2)
            ccml r9 = r9.bx()
            elfl r9 = r9.e(r11, r4)
            r10 = 0
            r0.e = r10
            r0.a = r10
            r0.f = r10
            r0.d = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 != r1) goto Ldb
            goto Le0
        Ldb:
            ceyt r9 = defpackage.ceyt.i()
            return r9
        Le0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cemu.b(cemv, cemd, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [cemv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [cemv] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cemu] */
    /* JADX WARN: Type inference failed for: r2v9, types: [cemu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cemv r13, defpackage.cemd r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cemu.c(cemv, cemd, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return c((cemv) obj, (cemd) obj2, ffguVar);
    }
}
