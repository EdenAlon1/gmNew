package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ycn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycj(ycn ycnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ycnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (defpackage.ffcu.a == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (r7 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        if (r7 != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r7 != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 == r2) goto L15
            if (r1 == r4) goto L19
            defpackage.ffci.b(r7)
            goto Lca
        L15:
            defpackage.ffci.b(r7)
            goto L5c
        L19:
            defpackage.ffci.b(r7)
            goto L97
        L1e:
            defpackage.ffci.b(r7)
            ycn r7 = r6.b
            ffbr r7 = r7.m
            java.lang.Object r7 = r7.b()
            atdn r7 = (defpackage.atdn) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L47
            ycn r7 = r6.b
            r6.a = r3
            yci r1 = new yci
            r1.<init>(r7, r5)
            java.lang.Object r7 = defpackage.ffsl.a(r1, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto L44
            ffcu r7 = defpackage.ffcu.a
        L44:
            if (r7 == r0) goto Lcd
            goto L97
        L47:
            ycn r7 = r6.b
            r6.a = r2
            ycm r1 = new ycm
            r1.<init>(r7, r5)
            java.lang.Object r7 = defpackage.ffsl.a(r1, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto L5a
            ffcu r7 = defpackage.ffcu.a
        L5a:
            if (r7 == r0) goto Lcd
        L5c:
            ycn r7 = r6.b
            ffbr r7 = r7.l
            java.lang.Object r7 = r7.b()
            dixm r7 = (defpackage.dixm) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L97
            ycn r7 = r6.b
            r6.a = r4
            llv r1 = r7.k
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r1 = defpackage.aygl.b(r1)
            if (r1 == 0) goto L92
            int r1 = r1.b()
            if (r1 == 0) goto L92
            ffbr r7 = r7.j
            java.lang.Object r7 = r7.b()
            xie r7 = (defpackage.xie) r7
            int r1 = r1 + (-1)
            if (r1 == 0) goto L8d
            xia r1 = defpackage.xia.a
            goto L8f
        L8d:
            xhy r1 = defpackage.xhy.a
        L8f:
            r7.c(r1)
        L92:
            ffcu r7 = defpackage.ffcu.a
            if (r7 != r0) goto L97
            goto Lcd
        L97:
            ycn r7 = r6.b
            ffbr r7 = r7.i
            java.lang.Object r7 = r7.b()
            ygi r7 = (defpackage.ygi) r7
            ffsk r1 = r7.b
            ygh r2 = new ygh
            r2.<init>(r7, r5)
            defpackage.axol.k(r1, r5, r2, r4)
            ycn r7 = r6.b
            r1 = 4
            r6.a = r1
            yec r7 = r7.e
            ffhd r1 = r7.b
            ffhd r1 = defpackage.ekxi.a(r1)
            yea r2 = new yea
            r2.<init>(r5, r7)
            java.lang.Object r7 = defpackage.ffra.a(r1, r2, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto Lc7
            ffcu r7 = defpackage.ffcu.a
        Lc7:
            if (r7 != r0) goto Lca
            goto Lcd
        Lca:
            ffcu r7 = defpackage.ffcu.a
            return r7
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ycj(this.b, ffguVar);
    }
}
