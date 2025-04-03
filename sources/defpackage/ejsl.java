package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejsl extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejsl(ffjm ffjmVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjmVar;
        this.d = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejsl) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(3:5|6|7)(5:9|10|11|12|13))(1:19))(3:27|(1:29)|15)|20|21|(3:23|12|13)|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r1.fQ(r5, r4) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L10
            defpackage.ffci.b(r5)
            goto L6e
        L10:
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.e
            ffxy r2 = (defpackage.ffxy) r2
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L1a
            goto L4c
        L1a:
            r5 = move-exception
            goto L54
        L1c:
            java.lang.Object r1 = r4.e
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r5)
            goto L3b
        L24:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.e
            ffxy r5 = (defpackage.ffxy) r5
            ejsq r1 = new ejsq
            r1.<init>()
            r4.e = r5
            r4.b = r3
            java.lang.Object r1 = r5.fQ(r1, r4)
            if (r1 == r0) goto L71
            r1 = r5
        L3b:
            ffjm r5 = r4.c     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = r4.d     // Catch: java.lang.Throwable -> L52
            r4.e = r1     // Catch: java.lang.Throwable -> L52
            r4.a = r1     // Catch: java.lang.Throwable -> L52
            r4.b = r2     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.a(r3, r4)     // Catch: java.lang.Throwable -> L52
            if (r5 == r0) goto L71
            r2 = r1
        L4c:
            ejqr r3 = new ejqr     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            goto L5a
        L52:
            r5 = move-exception
            r2 = r1
        L54:
            ejqq r3 = new ejqq
            r3.<init>(r5)
            r1 = r2
        L5a:
            ejsp r5 = new ejsp
            r5.<init>(r3)
            r2 = 0
            r4.e = r2
            r4.a = r2
            r2 = 3
            r4.b = r2
            java.lang.Object r5 = r1.fQ(r5, r4)
            if (r5 != r0) goto L6e
            goto L71
        L6e:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejsl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejsl ejslVar = new ejsl(this.c, this.d, ffguVar);
        ejslVar.e = obj;
        return ejslVar;
    }
}
