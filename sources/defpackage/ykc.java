package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ykc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yks b;
    final /* synthetic */ xhu c;
    final /* synthetic */ enhk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykc(yks yksVar, xhu xhuVar, enhk enhkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yksVar;
        this.c = xhuVar;
        this.d = enhkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ykc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r6 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r6.h.a(r5) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        return r0;
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
            if (r1 == r2) goto L2b
            goto L63
        Ld:
            yks r6 = r5.b
            ffbz r6 = r6.o
            java.lang.Object r6 = r6.a()
            r6.getClass()
            xhu r1 = r5.c
            enhk r3 = r5.d
            xih r6 = (defpackage.xih) r6
            xgc r4 = new xgc
            r4.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.b(r1, r4, r5)
            if (r6 == r0) goto L66
        L2b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L41
            yks r6 = r5.b
            r1 = 2
            r5.a = r1
            ybv r6 = r6.h
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L63
            goto L66
        L41:
            enru r6 = defpackage.yks.a
            ensk r6 = r6.i()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleComposeRow2"
            r6.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 183(0xb7, float:2.56E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$onSend$1$2$1"
            java.lang.String r3 = "SendButtonUiAdapterImpl.kt"
            ensk r6 = r6.h(r2, r0, r1, r3)
            enrr r6 = (defpackage.enrr) r6
            xhu r0 = r5.c
            java.lang.String r1 = "Failed to send %s"
            r6.t(r1, r0)
        L63:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ykc(this.b, this.c, this.d, ffguVar);
    }
}
