package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axxj(ffgu ffguVar, axyy axyyVar) {
        super(2, ffguVar);
        this.b = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axxj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r12 != r0) goto L16;
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
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            java.lang.String r2 = "_id"
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1a
            java.lang.Object r0 = r11.c
            java.lang.Object r1 = r11.d
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L16
            goto L87
        L16:
            r0 = move-exception
            r12 = r0
            goto L93
        L1a:
            java.lang.Object r1 = r11.d
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L16
            r8 = r11
            goto L51
        L23:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.d
            ffsk r12 = (defpackage.ffsk) r12
            java.lang.String r12 = "Cp2DataService#queryAllContactsIds"
            ekzz r1 = defpackage.eleg.f(r12)
            axyy r12 = r11.b     // Catch: java.lang.Throwable -> L16
            axwz r4 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L16
            ekrb r8 = r12.r(r4)     // Catch: java.lang.Throwable -> L16
            axyy r5 = r11.b     // Catch: java.lang.Throwable -> L16
            android.net.Uri r6 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch: java.lang.Throwable -> L16
            r6.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r7 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L16
            axxl r9 = defpackage.axxl.a     // Catch: java.lang.Throwable -> L16
            r11.d = r1     // Catch: java.lang.Throwable -> L16
            r11.a = r3     // Catch: java.lang.Throwable -> L16
            r10 = r11
            java.lang.Object r12 = r5.C(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L16
            r8 = r10
            if (r12 == r0) goto L92
        L51:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L16
            axyy r3 = r8.b     // Catch: java.lang.Throwable -> L16
            ffbr r3 = r3.h     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L16
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L16
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L8d
            axyy r3 = r8.b     // Catch: java.lang.Throwable -> L16
            axwz r4 = defpackage.axwz.b     // Catch: java.lang.Throwable -> L16
            ekrb r6 = r3.r(r4)     // Catch: java.lang.Throwable -> L16
            axyy r3 = r8.b     // Catch: java.lang.Throwable -> L16
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L16
            axxk r7 = defpackage.axxk.a     // Catch: java.lang.Throwable -> L16
            r8.d = r1     // Catch: java.lang.Throwable -> L16
            r8.c = r12     // Catch: java.lang.Throwable -> L16
            r2 = 2
            r8.a = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r3.C(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L16
            if (r2 == r0) goto L92
            r0 = r12
            r12 = r2
        L87:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L16
            java.util.List r12 = defpackage.ffdx.ad(r0, r12)     // Catch: java.lang.Throwable -> L16
        L8d:
            r0 = 0
            defpackage.ffig.a(r1, r0)
            return r12
        L92:
            return r0
        L93:
            throw r12     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            defpackage.ffig.a(r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axxj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axxj axxjVar = new axxj(ffguVar, this.b);
        axxjVar.d = obj;
        return axxjVar;
    }
}
