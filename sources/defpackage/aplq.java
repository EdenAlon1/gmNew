package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aplx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplq(aplx aplxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aplxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (defpackage.ffsw.d(r6.g, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r6 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        r6 = (java.lang.Void) r6;
        r5.b.h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        return defpackage.ffcu.a;
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
            int r1 = r5.a
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L3f
        Ld:
            aplx r6 = r5.b
            r5.a = r2
            long r1 = r6.g
            java.lang.Object r6 = defpackage.ffsw.d(r1, r5)
            if (r6 == r0) goto L49
        L19:
            entd r6 = defpackage.aplx.a
            ensk r6 = r6.h()
            ensz r6 = (defpackage.ensz) r6
            aplx r1 = r5.b
            ffpw r2 = new ffpw
            long r3 = r1.g
            r2.<init>(r3)
            java.lang.String r1 = "Sending stop typing indicator after the user has been idle for %s"
            r6.t(r1, r2)
            aplx r6 = r5.b
            elfl r6 = r6.c()
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 != r0) goto L3f
            goto L49
        L3f:
            java.lang.Void r6 = (java.lang.Void) r6
            aplx r6 = r5.b
            r0 = 0
            r6.h = r0
            ffcu r6 = defpackage.ffcu.a
            return r6
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aplq(this.b, ffguVar);
    }
}
