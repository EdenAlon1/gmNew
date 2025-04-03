package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ime extends ffhv implements ffjm {
    int a;
    final /* synthetic */ imf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ime(imf imfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = imfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ime) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r1.invoke(r4, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1.a(r4, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        return r0;
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
            if (r1 == 0) goto Lb
            goto L26
        Lb:
            imf r4 = r3.b
            ffjm r1 = r4.d
            if (r1 == 0) goto L1a
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L26
            goto L25
        L1a:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = r4.e
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L26
        L25:
            return r0
        L26:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ime.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ime(this.b, ffguVar);
    }
}
