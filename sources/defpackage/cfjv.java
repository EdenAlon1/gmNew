package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjv extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ cfjt c;
    final /* synthetic */ cfki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfjv(cfjt cfjtVar, cfki cfkiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = cfjtVar;
        this.d = cfkiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r6 != r0) goto L10;
     */
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
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)
            return r0
        Lf:
            defpackage.ffci.b(r6)
            goto L20
        L13:
            defpackage.ffci.b(r6)
            cfjt r6 = r5.c
            r5.b = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L48
        L20:
            cfki r1 = r5.d
            cfjt r2 = r5.c
            ceyt r6 = (defpackage.ceyt) r6
            r5.a = r6
            r3 = 2
            r5.b = r3
            cbwj r3 = r1.g
            cfjk r4 = new cfjk
            r4.<init>()
            java.lang.String r1 = "WorkQueueTikTokWorker::handleTrancheExecutionResults"
            elfl r1 = r3.b(r1, r4)
            r1.getClass()
            java.lang.Object r1 = defpackage.fgfz.c(r1, r5)
            ffhh r2 = defpackage.ffhh.a
            if (r1 == r2) goto L45
            ffcu r1 = defpackage.ffcu.a
        L45:
            if (r1 == r0) goto L48
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfjv(this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
