package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class almz extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ alnb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public almz(alnb alnbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = alnbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((almz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r6 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L35
        Lf:
            defpackage.ffci.b(r6)
            goto L2c
        L13:
            defpackage.ffci.b(r6)
            alnb r6 = r5.c
            ffhd r1 = r6.a
            ffhd r1 = defpackage.ekxi.a(r1)
            almy r3 = new almy
            r4 = 0
            r3.<init>(r4, r6)
            r5.b = r2
            java.lang.Object r6 = defpackage.ffra.a(r1, r3, r5)
            if (r6 == r0) goto L58
        L2c:
            engw r6 = (defpackage.engw) r6
            enqv r1 = r6.iterator()
            r1.getClass()
        L35:
            r6 = r1
            enqu r6 = (defpackage.enqu) r6
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r6 = r6.next()
            r6.getClass()
            alnb r2 = r5.c
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r6
            r5.a = r1
            r3 = 2
            r5.b = r3
            java.lang.Object r6 = r2.a(r6, r5)
            if (r6 != r0) goto L35
            goto L58
        L55:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.almz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new almz(this.c, ffguVar);
    }
}
