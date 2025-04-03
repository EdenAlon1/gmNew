package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ swt b;
    final /* synthetic */ String c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swr(swt swtVar, String str, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = swtVar;
        this.c = str;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((swr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r6 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1.a(r6, r5) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
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
            if (r1 == r2) goto L25
            goto L36
        Ld:
            swt r6 = r5.b
            java.lang.String r1 = r5.c
            r5.a = r2
            ffhd r2 = r6.a
            ffhd r2 = defpackage.ekxi.a(r2)
            sws r3 = new sws
            r4 = 0
            r3.<init>(r4, r6, r1)
            java.lang.Object r6 = defpackage.ffra.a(r2, r3, r5)
            if (r6 == r0) goto L39
        L25:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            ffjm r1 = r5.d
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L36
            goto L39
        L36:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new swr(this.b, this.c, this.d, ffguVar);
    }
}
