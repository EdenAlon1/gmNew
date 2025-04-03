package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbct extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbcd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbct(dbcd dbcdVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbcdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r4 = defpackage.eyja.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        return defpackage.eykn.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r4 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        r4 = ((defpackage.esvv) r4).h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r4 != null) goto L14;
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
            if (r1 == r2) goto L19
            goto L3f
        Ld:
            dbcd r4 = r3.b
            r3.a = r2
            ffss r4 = r4.e
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L4f
        L19:
            crty r4 = (defpackage.crty) r4
            eyfh r1 = defpackage.eyfh.a
            eyfq r1 = r1.createBuilder()
            eyfg r1 = (defpackage.eyfg) r1
            java.lang.String r2 = "create_time"
            r1.a(r2)
            eyfy r1 = r1.build()
            eyfh r1 = (defpackage.eyfh) r1
            elfl r4 = r4.k(r1)
            r4.getClass()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L3f
            goto L4f
        L3f:
            esvv r4 = (defpackage.esvv) r4
            eyja r4 = r4.h
            if (r4 != 0) goto L47
            eyja r4 = defpackage.eyja.a
        L47:
            r4.getClass()
            j$.time.Instant r4 = defpackage.eykn.d(r4)
            return r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbct.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbct(this.b, (ffgu) obj).b(ffcu.a);
    }
}
