package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetk implements aetd {
    public final ffsk a;
    public final ea b;
    public final drwd c;
    public final druy d;
    public final aepg e;
    private final aepl f;

    public aetk(ffsk ffskVar, ea eaVar, drwd drwdVar, druy druyVar, aepg aepgVar, aepl aeplVar) {
        ffskVar.getClass();
        aepgVar.getClass();
        this.a = ffskVar;
        this.b = eaVar;
        this.c = drwdVar;
        this.d = druyVar;
        this.e = aepgVar;
        this.f = aeplVar;
    }

    @Override // defpackage.aetd
    public final void a(GalleryContent galleryContent, int i) {
        galleryContent.getClass();
        axol.k(lks.a(this.b), null, new aeth(this, galleryContent, i, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.conversation.draft.model.GalleryContent r12, int r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.aeti
            if (r0 == 0) goto L13
            r0 = r14
            aeti r0 = (defpackage.aeti) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aeti r0 = new aeti
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            int r13 = r0.b
            java.lang.Object r12 = r0.a
            aetk r2 = r0.f
            defpackage.ffci.b(r14)
            goto L58
        L3c:
            defpackage.ffci.b(r14)
            drwd r14 = r11.c
            java.lang.String r2 = r12.b()
            drva r2 = defpackage.aete.a(r2)
            r0.f = r11
            r0.a = r12
            r0.b = r13
            r0.e = r4
            java.lang.Object r14 = r14.b(r2, r0)
            if (r14 == r1) goto Lc7
            r2 = r11
        L58:
            drwg r14 = (defpackage.drwg) r14
            if (r14 != 0) goto Lc6
            r14 = 0
            r0.f = r14
            r0.a = r14
            r0.e = r3
            ffrh r6 = new ffrh
            ffgu r14 = defpackage.ffhi.c(r0)
            r6.<init>(r14, r4)
            r6.B()
            ea r14 = r2.b
            fr r14 = r14.I()
            java.lang.String r0 = "photos_sharing_option_tray"
            ea r14 = r14.h(r0)
            if (r14 != 0) goto Lbb
            aesr r5 = new aesr
            r5.<init>()
            defpackage.fbae.e(r5)
            com.google.android.apps.messaging.conversation.draft.model.GalleryContent r12 = (com.google.android.apps.messaging.conversation.draft.model.GalleryContent) r12
            java.lang.String r14 = r12.b()
            drva r14 = defpackage.aete.a(r14)
            r5.bg(r14)
            drwd r7 = r2.c
            aepl r8 = r2.f
            java.lang.String r9 = r12.b()
            cfva r14 = defpackage.cjja.a
            cfva r14 = defpackage.cjja.e
            java.lang.Object r14 = r14.e()
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10
            r5.bi(r6, r7, r8, r9, r10)
            ea r14 = r2.b
            fr r14 = r14.I()
            r5.t(r14, r0)
            aesu r14 = r5.H()
            r14.a(r12)
            r14.c = r13
            goto Lbe
        Lbb:
            defpackage.ffre.a(r6)
        Lbe:
            java.lang.Object r12 = r6.m()
            if (r12 != r1) goto Lc5
            goto Lc7
        Lc5:
            return r12
        Lc6:
            return r14
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetk.b(com.google.android.apps.messaging.conversation.draft.model.GalleryContent, int, ffgu):java.lang.Object");
    }
}
