package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbmx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbmx(dbne dbneVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dbneVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbmx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        r5 = (java.lang.Integer) r5;
        r5 = r4.b;
        defpackage.cslq.e(new defpackage.dbmw(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r5 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        r5 = (java.lang.Integer) r5;
        r5 = r4.b.e.n(defpackage.dbne.d);
        r4.a = 3;
        r5 = defpackage.dbne.c(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        if (r5 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        return r0;
     */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.ffci.b(r5)
            if (r1 == r3) goto L25
            if (r1 == r2) goto L39
            goto L4f
        L10:
            defpackage.ffci.b(r5)
            dbne r5 = r4.b
            dhzj r5 = r5.e
            android.net.Uri r1 = defpackage.dbne.b
            dhre r5 = r5.a(r1)
            r4.a = r3
            java.lang.Object r5 = defpackage.dbne.c(r5, r4)
            if (r5 == r0) goto L5e
        L25:
            java.lang.Integer r5 = (java.lang.Integer) r5
            dbne r5 = r4.b
            dhzj r5 = r5.e
            android.net.Uri r1 = defpackage.dbne.c
            dhre r5 = r5.a(r1)
            r4.a = r2
            java.lang.Object r5 = defpackage.dbne.c(r5, r4)
            if (r5 == r0) goto L5e
        L39:
            java.lang.Integer r5 = (java.lang.Integer) r5
            dbne r5 = r4.b
            dhzj r5 = r5.e
            android.net.Uri r1 = defpackage.dbne.d
            dhre r5 = r5.n(r1)
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.dbne.c(r5, r4)
            if (r5 != r0) goto L4f
            goto L5e
        L4f:
            java.lang.Integer r5 = (java.lang.Integer) r5
            dbne r5 = r4.b
            dbmw r0 = new dbmw
            r0.<init>()
            defpackage.cslq.e(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbmx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbmx(this.b, ffguVar);
    }
}
