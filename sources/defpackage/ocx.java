package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ocy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocx(ocy ocyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ocyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ocx) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L13
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.d
            ffxy r2 = (defpackage.ffxy) r2
            defpackage.ffci.b(r5)
            goto L40
        L13:
            java.lang.Object r1 = r4.d
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r5)
            r2 = r1
            goto L33
        L1c:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            ffxy r5 = (defpackage.ffxy) r5
            ocy r1 = r4.c
            r4.d = r5
            r4.b = r2
            oed r1 = r1.a
            java.lang.Object r1 = r1.a(r4)
            if (r1 == r0) goto L5d
            r2 = r5
            r5 = r1
        L33:
            ocy r1 = r4.c
            java.util.List r5 = (java.util.List) r5
            ffud r1 = r1.d
            r1.z()
            java.util.Iterator r1 = r5.iterator()
        L40:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            ffes r5 = (defpackage.ffes) r5
            r4.d = r2
            r4.a = r1
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r2.fQ(r5, r4)
            if (r5 != r0) goto L40
            goto L5d
        L5a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ocx ocxVar = new ocx(this.c, ffguVar);
        ocxVar.d = obj;
        return ocxVar;
    }
}
