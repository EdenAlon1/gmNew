package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycc implements ybv, abqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftCloser");
    public final ConversationId b;
    public final ffxx c;
    public final alxl d;
    public final ydy e;
    public final yec f;
    public final ydb g;
    private final ffsk h;
    private final xyg i;
    private final xgg j;
    private final ffbz k;

    public ycc(ffsk ffskVar, ConversationId conversationId, ffxx ffxxVar, alxl alxlVar, xyg xygVar, ydy ydyVar, yec yecVar, ydb ydbVar, xgg xggVar, final ffbr ffbrVar) {
        ffskVar.getClass();
        conversationId.getClass();
        ffxxVar.getClass();
        alxlVar.getClass();
        yecVar.getClass();
        ydbVar.getClass();
        this.h = ffskVar;
        this.b = conversationId;
        this.c = ffxxVar;
        this.d = alxlVar;
        this.i = xygVar;
        this.e = ydyVar;
        this.f = yecVar;
        this.g = ydbVar;
        this.j = xggVar;
        this.k = ffca.a(new ffix() { // from class: ybw
            @Override // defpackage.ffix
            public final Object invoke() {
                return (Set) ffbr.this.b();
            }
        });
    }

    private final Set c() {
        return (Set) this.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ybv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.yby
            if (r0 == 0) goto L13
            r0 = r10
            yby r0 = (defpackage.yby) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yby r0 = new yby
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ycc r0 = r0.d
            defpackage.ffci.b(r10)
            goto Lb8
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.ycc.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleComposeRow2"
            r10.Y(r2, r4)
            enrr r10 = (defpackage.enrr) r10
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r9.b
            ensn r5 = defpackage.csux.q
            r10.Y(r5, r2)
            r2 = 66
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftCloser"
            java.lang.String r6 = "clearForSending"
            java.lang.String r7 = "DraftCloser.kt"
            ensk r10 = r10.h(r5, r6, r2, r7)
            enrr r10 = (defpackage.enrr) r10
            java.util.Set r2 = r9.c()
            java.lang.String r8 = "Draftcloser.clearForSending clearing draft with listeners %s"
            r10.t(r8, r2)
            java.util.Set r10 = r9.c()
            java.util.Iterator r10 = r10.iterator()
        L6a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r10.next()
            ybu r2 = (defpackage.ybu) r2
            r2.a()
            goto L6a
        L7a:
            enru r10 = defpackage.ycc.a
            ensk r10 = r10.e()
            ensn r2 = defpackage.ente.a
            r10.Y(r2, r4)
            enrr r10 = (defpackage.enrr) r10
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r9.b
            ensn r4 = defpackage.csux.q
            r10.Y(r4, r2)
            r2 = 76
            ensk r10 = r10.h(r5, r6, r2, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Draftcloser.clearForSending updating mutableDraftState"
            r10.q(r2)
            ydb r10 = r9.g
            ybx r2 = new ybx
            r2.<init>()
            r10.c(r2)
            xgg r10 = r9.j
            r10.b()
            ydy r10 = r9.e
            r0.d = r9
            r0.c = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r1) goto Lb7
            return r1
        Lb7:
            r0 = r9
        Lb8:
            ffsk r10 = r0.h
            ybz r1 = new ybz
            r2 = 0
            r1.<init>(r0, r2)
            r0 = 3
            defpackage.axol.k(r10, r2, r1, r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycc.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x011b, code lost:
    
        if (defpackage.fgfz.c(r14, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0169, code lost:
    
        if (defpackage.fgfz.c(r14, r0) == r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xhu r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycc.b(xhu, ffgu):java.lang.Object");
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        axol.k(this.h, null, new yca(this, null), 3);
    }
}
