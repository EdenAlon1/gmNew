package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydq implements ydy {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence");
    public final ConversationId b;
    public final ffhd c;
    public final ffhd d;
    public final Set e;
    public final cbwj f;

    public ydq(ConversationId conversationId, ffhd ffhdVar, ffhd ffhdVar2, cbwj cbwjVar, Set set) {
        conversationId.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        cbwjVar.getClass();
        set.getClass();
        this.b = conversationId;
        this.c = ffhdVar;
        this.d = ffhdVar2;
        this.f = cbwjVar;
        this.e = set;
    }

    public final bswn a(ffji ffjiVar) {
        String[] strArr = bsyb.a;
        bswq bswqVar = new bswq();
        bswqVar.c(bdgq.b(this.b.b()));
        ffjiVar.invoke(bswqVar);
        return bswqVar.a();
    }

    @Override // defpackage.ydy
    public final Object b(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.c), new ydf(null, this), ffguVar);
    }

    @Override // defpackage.ydy
    public final Object c(ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new ydh(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.ydy
    public final Object d(xhu xhuVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.c), new ydj(null, this, xhuVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bswn r20, defpackage.ffgu r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof defpackage.ydn
            if (r2 == 0) goto L17
            r2 = r1
            ydn r2 = (defpackage.ydn) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            ydn r2 = new ydn
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.c
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r4 = r2.b
            xhh r6 = r2.f
            java.lang.Object r7 = r2.a
            defpackage.ffci.b(r1)
            goto L49
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            defpackage.ffci.b(r1)
            xhh r6 = new xhh
            r6.<init>()
            java.util.Set r1 = r0.e
            java.util.Iterator r4 = r1.iterator()
            r7 = r20
        L49:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r4.next()
            yei r1 = (defpackage.yei) r1
            r2.a = r7
            r2.f = r6
            r2.b = r4
            r2.e = r5
            r8 = r7
            bswn r8 = (defpackage.bswn) r8
            java.lang.Object r1 = r1.a(r6, r8, r2)
            if (r1 != r3) goto L49
            return r3
        L67:
            r1 = 3
            r6.h = r1
            short r1 = r6.g
            r1 = r1 | 256(0x100, float:3.59E-43)
            short r2 = (short) r1
            r6.g = r2
            java.lang.String r8 = r6.a
            java.util.List r9 = r6.b
            java.lang.String r10 = r6.c
            boolean r11 = r6.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r6.e
            boolean r15 = r6.f
            int r1 = ~r1
            xhu r7 = new xhu
            r1 = r1 & 1023(0x3ff, float:1.434E-42)
            r13 = 0
            r14 = 0
            r16 = 3
            r17 = 0
            r18 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydq.e(bswn, ffgu):java.lang.Object");
    }

    @Override // defpackage.ydy
    public final Object f(ffsk ffskVar, ffxx ffxxVar, Duration duration) {
        return axol.k(ffskVar, this.c, new ydm(this, duration, ffxxVar, null), 2);
    }
}
