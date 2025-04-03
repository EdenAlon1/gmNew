package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdad extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cdaf c;
    final /* synthetic */ bqvj d;
    final /* synthetic */ ccvl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdad(cdaf cdafVar, bqvj bqvjVar, ccvl ccvlVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cdafVar;
        this.d = bqvjVar;
        this.e = ccvlVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cdad cdadVar = new cdad(this.c, this.d, this.e, (ffgu) obj3);
        cdadVar.b = (String) obj;
        return cdadVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r8 != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L14
            defpackage.ffci.b(r8)
            if (r1 == r3) goto L31
            if (r1 == r2) goto L40
            ffch r8 = (defpackage.ffch) r8
            java.lang.Object r8 = r8.a
            goto L54
        L14:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.b
            cdaf r1 = r7.c
            ffhd r4 = r1.b
            ffhd r4 = defpackage.ekxi.a(r4)
            cdac r5 = new cdac
            r6 = 0
            java.lang.String r8 = (java.lang.String) r8
            r5.<init>(r6, r1, r8)
            r7.a = r3
            java.lang.Object r8 = defpackage.ffra.a(r4, r5, r7)
            if (r8 == r0) goto L58
        L31:
            cdaf r1 = r7.c
            bqvj r3 = r7.d
            r7.a = r2
            ccuq r1 = r1.f
            r2 = 0
            java.lang.Object r8 = defpackage.ccuo.a(r1, r8, r3, r2, r7)
            if (r8 == r0) goto L58
        L40:
            cdaf r1 = r7.c
            ccvl r2 = r7.e
            r3 = 3
            r7.a = r3
            ccvq r1 = r1.g
            java.util.EnumSet r3 = defpackage.ccvr.a()
            java.lang.Object r8 = r1.c(r8, r2, r3, r7)
            if (r8 != r0) goto L54
            goto L58
        L54:
            defpackage.ffci.b(r8)
            return r8
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdad.b(java.lang.Object):java.lang.Object");
    }
}
