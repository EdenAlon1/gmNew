package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axxi(ffgu ffguVar, axyy axyyVar) {
        super(2, ffguVar);
        this.b = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
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
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L15
            java.lang.Object r0 = r6.c
            java.lang.Object r1 = r6.d
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L13
            goto L6d
        L13:
            r7 = move-exception
            goto L79
        L15:
            java.lang.Object r1 = r6.d
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L13
            goto L40
        L1d:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            ffsk r7 = (defpackage.ffsk) r7
            java.lang.String r7 = "Cp2DataService#queryAllContacts"
            ekzz r1 = defpackage.eleg.f(r7)
            axyy r7 = r6.b     // Catch: java.lang.Throwable -> L13
            axwz r3 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L13
            ekrb r7 = r7.r(r3)     // Catch: java.lang.Throwable -> L13
            axyy r3 = r6.b     // Catch: java.lang.Throwable -> L13
            axwz r4 = defpackage.axwz.a     // Catch: java.lang.Throwable -> L13
            r6.d = r1     // Catch: java.lang.Throwable -> L13
            r6.a = r2     // Catch: java.lang.Throwable -> L13
            java.lang.Object r7 = r3.A(r7, r4, r6)     // Catch: java.lang.Throwable -> L13
            if (r7 == r0) goto L78
        L40:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L13
            axyy r2 = r6.b     // Catch: java.lang.Throwable -> L13
            ffbr r2 = r2.h     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L13
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L73
            axyy r2 = r6.b     // Catch: java.lang.Throwable -> L13
            axwz r3 = defpackage.axwz.b     // Catch: java.lang.Throwable -> L13
            ekrb r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L13
            axyy r3 = r6.b     // Catch: java.lang.Throwable -> L13
            axwz r4 = defpackage.axwz.b     // Catch: java.lang.Throwable -> L13
            r6.d = r1     // Catch: java.lang.Throwable -> L13
            r6.c = r7     // Catch: java.lang.Throwable -> L13
            r5 = 2
            r6.a = r5     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r3.A(r2, r4, r6)     // Catch: java.lang.Throwable -> L13
            if (r2 == r0) goto L78
            r0 = r7
            r7 = r2
        L6d:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L13
            java.util.List r7 = defpackage.ffdx.ad(r0, r7)     // Catch: java.lang.Throwable -> L13
        L73:
            r0 = 0
            defpackage.ffig.a(r1, r0)
            return r7
        L78:
            return r0
        L79:
            throw r7     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            defpackage.ffig.a(r1, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axxi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axxi axxiVar = new axxi(ffguVar, this.b);
        axxiVar.d = obj;
        return axxiVar;
    }
}
