package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aepk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepj(ffgu ffguVar, aepk aepkVar) {
        super(2, ffguVar);
        this.b = aepkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aepj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            if (r1 == r3) goto Le
            defpackage.ffci.b(r5)
            goto L50
        Le:
            defpackage.ffci.b(r5)
            goto L23
        L12:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            aepk r5 = r4.b
            r4.a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L5a
        L23:
            eixz r5 = (defpackage.eixz) r5
            if (r5 == 0) goto L3c
            aepk r1 = r4.b
            ejar r1 = r1.c
            java.lang.String r5 = r1.e(r5)
            if (r5 == 0) goto L37
            doxj r1 = new doxj
            r1.<init>(r5)
            goto L38
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            return r1
        L3c:
            aepk r5 = r4.b
            ejar r1 = r5.c
            eisx r5 = r5.a
            com.google.common.util.concurrent.ListenableFuture r5 = r1.b(r5)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L50
            goto L5a
        L50:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L55
            return r2
        L55:
            doxj r0 = new doxj
            r0.<init>(r5)
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aepj aepjVar = new aepj(ffguVar, this.b);
        aepjVar.c = obj;
        return aepjVar;
    }
}
