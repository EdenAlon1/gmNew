package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zum b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztw(zum zumVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zumVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ztw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        ((defpackage.xie) r3.b.g.b()).c(defpackage.xib.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r4.a(r1, r3) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, xhv] */
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
            if (r1 == r2) goto L1f
            goto L3f
        Ld:
            zum r4 = r3.b
            alxr r1 = r3.c
            abcf r4 = r4.f
            ffxx r4 = r4.b(r1)
            r3.a = r2
            java.lang.Object r4 = defpackage.fgbj.a(r4, r3)
            if (r4 == r0) goto L51
        L1f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4e
            zum r4 = r3.b
            alxr r1 = r3.c
            j$.util.Optional r4 = r4.d
            java.lang.Object r4 = r4.get()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r1.b()
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L3f
            goto L51
        L3f:
            zum r4 = r3.b
            ffbr r4 = r4.g
            java.lang.Object r4 = r4.b()
            xie r4 = (defpackage.xie) r4
            xib r0 = defpackage.xib.a
            r4.c(r0)
        L4e:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ztw(this.b, this.c, ffguVar);
    }
}
