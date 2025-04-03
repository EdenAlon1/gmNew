package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adip extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adir b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adip(adir adirVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adirVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adip) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r4 = (java.util.List) r4;
        r4.getClass();
        r0 = r3.c;
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r4.hasNext() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r1 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (defpackage.ffkj.e(((defpackage.eixn) r1).a(), r0) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        r4 = (defpackage.eixn) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        if (r4 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r4 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        r4 = (defpackage.eixn) r4;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2f
            goto L55
        Ld:
            adir r4 = r3.b
            atxw r4 = r4.d
            atxp r4 = (defpackage.atxp) r4
            ffbr r4 = r4.a
            java.lang.Object r4 = r4.b()
            ersq r4 = (defpackage.ersq) r4
            java.lang.String r1 = "bugle.fix_recurring_metrics_account_changed"
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L32
            adir r4 = r3.b
            eisx r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.b(r1, r3)
            if (r4 == r0) goto L54
        L2f:
            eixn r4 = (defpackage.eixn) r4
            goto L7c
        L32:
            adir r4 = r3.b
            ffbr r1 = r4.b
            java.lang.Object r1 = r1.b()
            eixo r1 = (defpackage.eixo) r1
            ejuh r1 = r1.b()
            ejvb r4 = r4.c
            ejwa r2 = defpackage.ejwa.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r4 = r4.b(r1, r2)
            r4.getClass()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L55
        L54:
            return r0
        L55:
            java.util.List r4 = (java.util.List) r4
            r4.getClass()
            eisx r0 = r3.c
            java.util.Iterator r4 = r4.iterator()
        L60:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r4.next()
            r2 = r1
            eixn r2 = (defpackage.eixn) r2
            eisx r2 = r2.a()
            boolean r2 = defpackage.ffkj.e(r2, r0)
            if (r2 == 0) goto L60
            goto L79
        L78:
            r1 = 0
        L79:
            r4 = r1
            eixn r4 = (defpackage.eixn) r4
        L7c:
            if (r4 == 0) goto La1
            eixz r0 = r4.b()
            java.lang.String r0 = r0.k
            java.lang.String r1 = "google"
            boolean r0 = defpackage.ffkj.e(r0, r1)
            if (r0 != 0) goto L8d
            goto La1
        L8d:
            adir r0 = r3.b
            j$.util.Optional r0 = r0.a
            java.lang.Object r0 = r0.get()
            aloc r0 = (defpackage.aloc) r0
            eisx r4 = r4.a()
            r0.b(r4)
            ffcu r4 = defpackage.ffcu.a
            return r4
        La1:
            adir r4 = r3.b
            j$.util.Optional r4 = r4.a
            java.lang.Object r4 = r4.get()
            aloc r4 = (defpackage.aloc) r4
            r4.c()
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adip.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adip(this.b, this.c, ffguVar);
    }
}
