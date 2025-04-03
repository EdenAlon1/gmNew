package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xzx extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ xho d;
    final /* synthetic */ yag e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzx(xho xhoVar, yag yagVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = xhoVar;
        this.e = yagVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xzx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r0 = r6.b
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L7d
        L11:
            defpackage.ffci.b(r7)
            goto L46
        L15:
            defpackage.ffci.b(r7)
            enru r7 = defpackage.yag.a
            ensk r7 = r7.g()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleComposeRow2"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 140(0x8c, float:1.96E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl$cancel$2"
            java.lang.String r5 = "DraftAttachmentPostProcessorImpl.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            xho r1 = r6.d
            java.lang.String r3 = "Cancel early processing %s"
            r7.t(r3, r1)
            yag r7 = r6.e
            xho r1 = r6.d
            r6.c = r2
            java.lang.Object r7 = r7.g(r1, r6)
            if (r7 == r0) goto L8d
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8a
            xho r7 = r6.d
            xhn r1 = r7.b
            android.net.Uri r1 = r1.c
            if (r1 != 0) goto L69
            doxs r7 = r7.a
            boolean r1 = r7 instanceof defpackage.doyc
            if (r1 == 0) goto L67
            doyc r7 = (defpackage.doyc) r7
            java.lang.String r7 = r7.f()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            goto L68
        L67:
            r7 = 0
        L68:
            r1 = r7
        L69:
            if (r1 == 0) goto L8a
            yag r7 = r6.e
            r6.a = r1
            cbit r2 = r7.b
            r6.b = r2
            r3 = 2
            r6.c = r3
            java.lang.Object r7 = r7.e(r6)
            if (r7 == r0) goto L8d
            r0 = r2
        L7d:
            java.lang.Number r7 = (java.lang.Number) r7
            long r2 = r7.longValue()
            android.net.Uri r1 = (android.net.Uri) r1
            cbit r0 = (defpackage.cbit) r0
            r0.c(r1, r2)
        L8a:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xzx(this.d, this.e, ffguVar);
    }
}
