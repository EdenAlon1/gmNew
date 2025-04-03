package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyj extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ajyr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyj(ajyr ajyrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ajyrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0020, code lost:
    
        if (r6 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            goto L2a
        L11:
            defpackage.ffci.b(r6)
            goto L22
        L15:
            defpackage.ffci.b(r6)
            ajyr r6 = r5.d
            r5.c = r2
            java.lang.Object r6 = r6.l(r5)
            if (r6 == r0) goto L4e
        L22:
            ajyr r2 = r5.d
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r1 = r6.iterator()
        L2a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r1.next()
            ajwc r6 = (defpackage.ajwc) r6
            java.util.UUID r6 = r6.a
            akci r3 = defpackage.akci.COMPLETE_APP_UPDATE_REPROMPT_DECLINED
            r5.a = r2
            r5.b = r1
            r4 = 2
            r5.c = r4
            r4 = r2
            ajyr r4 = (defpackage.ajyr) r4
            java.lang.Object r6 = r4.s(r6, r3, r5)
            if (r6 != r0) goto L2a
            goto L4e
        L4b:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajyj(this.d, ffguVar);
    }
}
