package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evm extends ffhu implements ffjm {
    Object a;
    int b;
    final /* synthetic */ evy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evm(evy evyVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = evyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((evm) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        if (r12 != r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:5:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            java.lang.Object r1 = r11.a
            java.lang.Object r3 = r11.d
            iju r3 = (defpackage.iju) r3
            defpackage.ffci.b(r12)
            goto L47
        L14:
            java.lang.Object r1 = r11.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r12)
            goto L2f
        L1c:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.d
            r1 = r12
            iju r1 = (defpackage.iju) r1
            r11.d = r1
            r11.b = r3
            r12 = 0
            java.lang.Object r12 = defpackage.dtr.g(r1, r12, r11, r2)
            if (r12 == r0) goto L75
        L2f:
            evy r3 = r11.c
            iku r12 = (defpackage.iku) r12
            long r4 = r12.c
            r3.f()
            r3 = r1
            r1 = r12
        L3a:
            r11.d = r3
            r11.a = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.ijt.a(r3, r11)
            if (r12 != r0) goto L47
            goto L75
        L47:
            iki r12 = (defpackage.iki) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L6d
            java.lang.Object r6 = r12.get(r5)
            iku r6 = (defpackage.iku) r6
            long r7 = r6.a
            r9 = r1
            iku r9 = (defpackage.iku) r9
            long r9 = r9.a
            boolean r7 = defpackage.ikt.b(r7, r9)
            if (r7 == 0) goto L6a
            boolean r6 = r6.d
            if (r6 == 0) goto L6a
            goto L3a
        L6a:
            int r5 = r5 + 1
            goto L50
        L6d:
            evy r12 = r11.c
            r12.e()
            ffcu r12 = defpackage.ffcu.a
            return r12
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        evm evmVar = new evm(this.c, ffguVar);
        evmVar.d = obj;
        return evmVar;
    }
}
