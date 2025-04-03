package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drva b;
    final /* synthetic */ aetb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesz(ffgu ffguVar, drva drvaVar, aetb aetbVar) {
        super(2, ffguVar);
        this.b = drvaVar;
        this.c = aetbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aesz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r4 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4 != r0) goto L20;
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
            goto L32
        Ld:
            defpackage.ffci.b(r4)
            goto L41
        L11:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.d
            ffsk r4 = (defpackage.ffsk) r4
            drva r4 = r3.b
            int r4 = r4.ordinal()
            if (r4 == r2) goto L35
            r1 = 2
            if (r4 == r1) goto L25
            r4 = 0
            return r4
        L25:
            aetb r4 = r3.c
            aetu r4 = r4.a
            r3.a = r1
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L32
            goto L44
        L32:
            aeuk r4 = (defpackage.aeuk) r4
            return r4
        L35:
            aetb r4 = r3.c
            aetu r4 = r4.a
            r3.a = r2
            java.lang.Object r4 = r4.f(r3)
            if (r4 == r0) goto L44
        L41:
            aeuk r4 = (defpackage.aeuk) r4
            return r4
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aesz aeszVar = new aesz(ffguVar, this.b, this.c);
        aeszVar.d = obj;
        return aeszVar;
    }
}
