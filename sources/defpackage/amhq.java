package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amhq extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ amhr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amhq(amhr amhrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = amhrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amhq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0027, code lost:
    
        if (r5 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L43
        Lf:
            defpackage.ffci.b(r5)
            goto L29
        L13:
            defpackage.ffci.b(r5)
            amhr r5 = r4.c
            aqge r5 = r5.a
            elfl r5 = r5.b()
            r5.getClass()
            r4.b = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L96
        L29:
            amhr r1 = r4.c
            amfx r5 = (defpackage.amfx) r5
            aqge r1 = r1.b
            elfl r1 = r1.b()
            r1.getClass()
            r4.a = r5
            r2 = 2
            r4.b = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r4)
            if (r1 == r0) goto L96
            r0 = r5
            r5 = r1
        L43:
            engw r5 = (defpackage.engw) r5
            int r1 = r0.v()
            boolean r1 = defpackage.byyr.d(r1)
            if (r1 == 0) goto L92
            r5.getClass()
            r0.getClass()
            aqux r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto L69
            j$.util.Optional r0 = r0.m()
            if (r0 == 0) goto L69
            java.lang.Object r0 = defpackage.fflm.b(r0)
            r1 = r0
            aoku r1 = (defpackage.aoku) r1
        L69:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r5.next()
            r3 = r2
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r3
            aoku r3 = r3.g()
            boolean r3 = defpackage.ffkj.e(r3, r1)
            if (r3 != 0) goto L72
            r0.add(r2)
            goto L72
        L8d:
            engw r5 = defpackage.engq.a(r0)
            return r5
        L92:
            r5.getClass()
            return r5
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amhq(this.c, ffguVar);
    }
}
