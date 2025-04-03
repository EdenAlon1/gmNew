package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohv extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ oia d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohv(oia oiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = oiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ohv) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r1.fQ(r2, r5) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            if (r1 == r2) goto Le
            defpackage.ffci.b(r6)
            goto L57
        Le:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            java.lang.Object r4 = r5.e
            oib r4 = (defpackage.oib) r4
            defpackage.ffci.b(r6)
            goto L37
        L1a:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.e
            r1 = r6
            ffxy r1 = (defpackage.ffxy) r1
            oia r6 = r5.d
            oib r4 = r6.i
            r5.e = r4
            fgjb r6 = r4.a
            r5.a = r6
            r5.b = r1
            r5.c = r2
            java.lang.Object r2 = r6.a(r3, r5)
            if (r2 == r0) goto L5f
            r2 = r6
        L37:
            oie r6 = r4.b     // Catch: java.lang.Throwable -> L5a
            ogh r6 = r6.j     // Catch: java.lang.Throwable -> L5a
            ofy r6 = r6.b()     // Catch: java.lang.Throwable -> L5a
            r2.b(r3)
            ogm r2 = new ogm
            r2.<init>(r6)
            r5.e = r3
            r5.a = r3
            r5.b = r3
            r6 = 2
            r5.c = r6
            java.lang.Object r6 = r1.fQ(r2, r5)
            if (r6 != r0) goto L57
            goto L5f
        L57:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L5a:
            r6 = move-exception
            r2.b(r3)
            throw r6
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ohv ohvVar = new ohv(this.d, ffguVar);
        ohvVar.e = obj;
        return ohvVar;
    }
}
