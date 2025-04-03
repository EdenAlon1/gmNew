package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaxi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaxj b;
    final /* synthetic */ aiir c;
    final /* synthetic */ aoax d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaxi(aaxj aaxjVar, aiir aiirVar, aoax aoaxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaxjVar;
        this.c = aiirVar;
        this.d = aoaxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (defpackage.fgfz.c(r4, r3) == r0) goto L17;
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
            if (r1 == r2) goto L21
            goto L51
        Ld:
            aaxj r4 = r3.b
            ffbr r4 = r4.b
            java.lang.Object r4 = r4.b()
            aigz r4 = (defpackage.aigz) r4
            aiir r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.f(r1, r3)
            if (r4 == r0) goto L54
        L21:
            ade r4 = (defpackage.ade) r4
            int r4 = r4.a
            r1 = -1
            if (r4 != r1) goto L51
            aaxj r4 = r3.b
            android.content.Context r4 = r4.c
            r1 = 2132083233(0x7f150221, float:1.9806603E38)
            r2 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r1, r2)
            r4.show()
            aoax r4 = r3.d
            java.lang.String r1 = r4.b()
            if (r1 == 0) goto L51
            aaxj r1 = r3.b
            alxs r1 = r1.a
            elfl r4 = r1.j(r4)
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L51
            goto L54
        L51:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaxi(this.b, this.c, this.d, ffguVar);
    }
}
