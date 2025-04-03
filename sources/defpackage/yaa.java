package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yaa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yag b;
    final /* synthetic */ xho c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yaa(ffgu ffguVar, yag yagVar, xho xhoVar, boolean z) {
        super(2, ffguVar);
        this.b = yagVar;
        this.c = xhoVar;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yaa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r8.c(r1) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if (r8 != r0) goto L12;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 == r2) goto L11
            defpackage.ffci.b(r8)
            goto L8a
        L11:
            defpackage.ffci.b(r8)
            return r8
        L15:
            defpackage.ffci.b(r8)
            goto L2c
        L19:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.e
            ffsk r8 = (defpackage.ffsk) r8
            yag r8 = r7.b
            xho r1 = r7.c
            r7.a = r3
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto L8d
        L2c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl$process$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "DraftAttachmentPostProcessorImpl.kt"
            java.lang.String r5 = "BugleComposeRow2"
            if (r8 == 0) goto L64
            enru r8 = defpackage.yag.a
            ensk r8 = r8.h()
            ensn r6 = defpackage.ente.a
            r8.Y(r6, r5)
            r5 = 76
            ensk r8 = r8.h(r3, r1, r5, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r1 = "Starting processed attachments sending preparation."
            r8.q(r1)
            yag r8 = r7.b
            xho r1 = r7.c
            boolean r3 = r7.d
            r7.a = r2
            java.lang.Object r8 = r8.h(r1, r3, r7)
            if (r8 != r0) goto L63
            goto L8d
        L63:
            return r8
        L64:
            enru r8 = defpackage.yag.a
            ensk r8 = r8.g()
            ensn r2 = defpackage.ente.a
            r8.Y(r2, r5)
            r2 = 82
            ensk r8 = r8.h(r3, r1, r2, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r1 = "Processed attachment doesn't meet early sending preparation criteria."
            r8.q(r1)
            yag r8 = r7.b
            xho r1 = r7.c
            r2 = 3
            r7.a = r2
            java.lang.Object r8 = r8.c(r1)
            if (r8 != r0) goto L8a
            goto L8d
        L8a:
            xho r8 = r7.c
            return r8
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yaa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yaa yaaVar = new yaa(ffguVar, this.b, this.c, this.d);
        yaaVar.e = obj;
        return yaaVar;
    }
}
