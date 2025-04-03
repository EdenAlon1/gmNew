package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drva b;
    final /* synthetic */ aetb c;
    final /* synthetic */ aeuk d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesw(ffgu ffguVar, drva drvaVar, aetb aetbVar, aeuk aeukVar) {
        super(2, ffguVar);
        this.b = drvaVar;
        this.c = aetbVar;
        this.d = aeukVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aesw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4.a.d(r2, r3) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r4.a.e(r1, r3) == r0) goto L17;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L42
        Ld:
            defpackage.ffci.b(r4)
            goto L42
        L11:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.e
            ffsk r4 = (defpackage.ffsk) r4
            drva r4 = r3.b
            int r4 = r4.ordinal()
            if (r4 == r2) goto L33
            r1 = 2
            if (r4 == r1) goto L24
            goto L42
        L24:
            aetb r4 = r3.c
            aeuk r2 = r3.d
            r3.a = r1
            aetu r4 = r4.a
            java.lang.Object r4 = r4.d(r2, r3)
            if (r4 != r0) goto L42
            goto L41
        L33:
            aetb r4 = r3.c
            aeuk r1 = r3.d
            r3.a = r2
            aetu r4 = r4.a
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 != r0) goto L42
        L41:
            return r0
        L42:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aesw aeswVar = new aesw(ffguVar, this.b, this.c, this.d);
        aeswVar.e = obj;
        return aeswVar;
    }
}
