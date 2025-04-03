package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvk implements ffxy {
    final /* synthetic */ ffxy a;

    public xvk(ffxy ffxyVar) {
        this.a = ffxyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.xvj
            if (r0 == 0) goto L13
            r0 = r12
            xvj r0 = (defpackage.xvj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xvj r0 = new xvj
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r12)
            goto L80
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r12)
            ffxy r12 = r10.a
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L3f:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r11.next()
            r5 = r4
            xhp r5 = (defpackage.xhp) r5
            boolean r6 = defpackage.xvy.b(r5)
            if (r6 != 0) goto L73
            enru r4 = defpackage.xvs.a
            ensk r4 = r4.i()
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "BugleComposeRow2"
            r4.Y(r6, r7)
            java.lang.String r6 = "emit"
            r7 = 60
            java.lang.String r8 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl$special$$inlined$map$1$2"
            java.lang.String r9 = "DraftAttachmentUiAdapterImpl.kt"
            ensk r4 = r4.h(r8, r6, r7, r9)
            enrr r4 = (defpackage.enrr) r4
            java.lang.String r6 = "Cannot convert to AttachmentUiData: %s"
            r4.t(r6, r5)
            goto L3f
        L73:
            r2.add(r4)
            goto L3f
        L77:
            r0.b = r3
            java.lang.Object r11 = r12.fQ(r2, r0)
            if (r11 != r1) goto L80
            return r1
        L80:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvk.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
