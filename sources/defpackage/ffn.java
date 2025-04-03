package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffn extends ffhu implements ffjm {
    int a;
    final /* synthetic */ fft b;
    final /* synthetic */ ffix c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffn(fft fftVar, ffix ffixVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = fftVar;
        this.c = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffn) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r5 != r0) goto L9;
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
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L3c
        Ld:
            java.lang.Object r1 = r4.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r5)
            goto L2b
        L15:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            r1 = r5
            iju r1 = (defpackage.iju) r1
            r4.d = r1
            r4.a = r2
            ffjn r5 = defpackage.dtr.a
            ikk r5 = defpackage.ikk.b
            java.lang.Object r5 = defpackage.dtr.h(r1, r5, r4)
            if (r5 == r0) goto L54
        L2b:
            iku r5 = (defpackage.iku) r5
            ikk r2 = defpackage.ikk.a
            r3 = 0
            r4.d = r3
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = defpackage.doo.b(r1, r5, r2, r4)
            if (r5 != r0) goto L3c
            goto L54
        L3c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L51
            fft r5 = r4.b
            boolean r5 = r5.z()
            if (r5 != 0) goto L51
            ffix r5 = r4.c
            r5.invoke()
        L51:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ffn ffnVar = new ffn(this.b, this.c, ffguVar);
        ffnVar.d = obj;
        return ffnVar;
    }
}
