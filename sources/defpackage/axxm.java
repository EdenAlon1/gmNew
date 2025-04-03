package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axxm(ffgu ffguVar, axyy axyyVar) {
        super(2, ffguVar);
        this.b = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axxm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r13 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            java.lang.String r2 = "contact_id"
            java.lang.String r3 = "_id"
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1c
            java.lang.Object r0 = r12.c
            java.lang.Object r1 = r12.d
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r13)     // Catch: java.lang.Throwable -> L18
            goto L89
        L18:
            r0 = move-exception
            r13 = r0
            goto L95
        L1c:
            java.lang.Object r1 = r12.d
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r13)     // Catch: java.lang.Throwable -> L18
            r9 = r12
            goto L53
        L25:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.d
            ffsk r13 = (defpackage.ffsk) r13
            java.lang.String r13 = "Cp2DataService#queryAllContactsRowIdsAndContactIds"
            ekzz r1 = defpackage.eleg.f(r13)
            axyy r13 = r12.b     // Catch: java.lang.Throwable -> L18
            axwz r5 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L18
            ekrb r9 = r13.r(r5)     // Catch: java.lang.Throwable -> L18
            axyy r6 = r12.b     // Catch: java.lang.Throwable -> L18
            android.net.Uri r7 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch: java.lang.Throwable -> L18
            r7.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r8 = new java.lang.String[]{r3, r2}     // Catch: java.lang.Throwable -> L18
            axxo r10 = defpackage.axxo.a     // Catch: java.lang.Throwable -> L18
            r12.d = r1     // Catch: java.lang.Throwable -> L18
            r12.a = r4     // Catch: java.lang.Throwable -> L18
            r11 = r12
            java.lang.Object r13 = r6.C(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L18
            r9 = r11
            if (r13 == r0) goto L94
        L53:
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L18
            axyy r4 = r9.b     // Catch: java.lang.Throwable -> L18
            ffbr r4 = r4.h     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L18
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L8f
            axyy r4 = r9.b     // Catch: java.lang.Throwable -> L18
            axwz r5 = defpackage.axwz.b     // Catch: java.lang.Throwable -> L18
            ekrb r7 = r4.r(r5)     // Catch: java.lang.Throwable -> L18
            axyy r4 = r9.b     // Catch: java.lang.Throwable -> L18
            android.net.Uri r5 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch: java.lang.Throwable -> L18
            r5.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r6 = new java.lang.String[]{r3, r2}     // Catch: java.lang.Throwable -> L18
            axxn r8 = defpackage.axxn.a     // Catch: java.lang.Throwable -> L18
            r9.d = r1     // Catch: java.lang.Throwable -> L18
            r9.c = r13     // Catch: java.lang.Throwable -> L18
            r2 = 2
            r9.a = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r4.C(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L18
            if (r2 == r0) goto L94
            r0 = r13
            r13 = r2
        L89:
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L18
            java.util.List r13 = defpackage.ffdx.ad(r0, r13)     // Catch: java.lang.Throwable -> L18
        L8f:
            r0 = 0
            defpackage.ffig.a(r1, r0)
            return r13
        L94:
            return r0
        L95:
            throw r13     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            defpackage.ffig.a(r1, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axxm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axxm axxmVar = new axxm(ffguVar, this.b);
        axxmVar.d = obj;
        return axxmVar;
    }
}
