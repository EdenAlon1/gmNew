package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amih implements amid {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/ConversationLeaverImpl");
    public final ffhd b;
    public final ffbr c;
    private final ffsk d;
    private final ckqj e;

    public amih(ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ckqj ckqjVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar2.getClass();
        ckqjVar.getClass();
        this.d = ffskVar;
        this.b = ffhdVar;
        this.c = ffbrVar;
        this.e = ckqjVar;
    }

    @Override // defpackage.amid
    public final elfl a(Conversation conversation, int i) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new amif(this, conversation, i, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ckqh r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.amig
            if (r0 == 0) goto L13
            r0 = r7
            amig r0 = (defpackage.amig) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amig r0 = new amig
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            goto L47
        L36:
            defpackage.ffci.b(r7)
            ckqj r7 = r5.e
            elfl r6 = r7.a(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L64
        L47:
            cevg r7 = (defpackage.cevg) r7
            elfl r6 = r7.a()
            r6.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 != r1) goto L59
            goto L64
        L59:
            ceyt r7 = (defpackage.ceyt) r7
            boolean r6 = r7.e()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amih.b(ckqh, ffgu):java.lang.Object");
    }
}
