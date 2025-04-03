package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xvs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvd(xvs xvsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xvsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xvd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        r8 = defpackage.xvs.a.f();
        r8.Y(defpackage.ente.a, "BugleComposeRow2");
        ((defpackage.enrr) r8.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl$1", "invokeSuspend", 89, "DraftAttachmentUiAdapterImpl.kt")).q("Adding attachment viewer result failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r8 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006a, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0090, code lost:
    
        return r0;
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
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl$1"
            java.lang.String r5 = "DraftAttachmentUiAdapterImpl.kt"
            java.lang.String r6 = "BugleComposeRow2"
            defpackage.ffci.b(r8)
            if (r1 == 0) goto L15
            if (r1 == r2) goto L39
            goto L6d
        L15:
            enru r8 = defpackage.xvs.a
            ensk r8 = r8.g()
            ensn r1 = defpackage.ente.a
            r8.Y(r1, r6)
            r1 = 83
            ensk r8 = r8.h(r4, r3, r1, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r1 = "Checking to recover media viewer result"
            r8.q(r1)
            xvs r8 = r7.b
            r7.a = r2
            ailp r8 = r8.l
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto L90
        L39:
            xvs r1 = r7.b
            xwb r1 = r1.d
            ainw r8 = (defpackage.ainw) r8
            xvz r8 = r1.a(r8)
            if (r8 == 0) goto L8d
            enru r1 = defpackage.xvs.a
            ensk r1 = r1.g()
            ensn r2 = defpackage.ente.a
            r1.Y(r2, r6)
            r2 = 87
            ensk r1 = r1.h(r4, r3, r2, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Recovered media viewer result"
            r1.q(r2)
            xvs r1 = r7.b
            r2 = 2
            r7.a = r2
            xhm r8 = r8.a
            xuk r1 = r1.f
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r0) goto L6d
            goto L90
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8d
            enru r8 = defpackage.xvs.a
            ensk r8 = r8.f()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r6)
            r0 = 89
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Adding attachment viewer result failed"
            r8.q(r0)
        L8d:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xvd(this.b, ffguVar);
    }
}
