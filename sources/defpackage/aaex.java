package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaex implements aaeg {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl");
    public final ffsk b;
    public final ajjc c;
    public final alye d;
    public final ffhd e;
    public final aigz f;
    public final ffbr g;
    public final ffbr h;
    public final ffxx i;
    public final cnpd j;
    public final ausa k;
    private final Context l;
    private final asix m;
    private final Conversation n;
    private final aaey o;
    private final elbx p;
    private final ablq q;

    public aaex(Context context, ffsk ffskVar, ajjc ajjcVar, ablq ablqVar, asix asixVar, alye alyeVar, ffhd ffhdVar, Conversation conversation, aaey aaeyVar, aigz aigzVar, ffbr ffbrVar, ffbr ffbrVar2, ffxx ffxxVar, elbx elbxVar, cnpd cnpdVar, ausa ausaVar) {
        context.getClass();
        ffskVar.getClass();
        ajjcVar.getClass();
        ablqVar.getClass();
        asixVar.getClass();
        alyeVar.getClass();
        ffhdVar.getClass();
        conversation.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffxxVar.getClass();
        elbxVar.getClass();
        cnpdVar.getClass();
        ausaVar.getClass();
        this.l = context;
        this.b = ffskVar;
        this.c = ajjcVar;
        this.q = ablqVar;
        this.m = asixVar;
        this.d = alyeVar;
        this.e = ffhdVar;
        this.n = conversation;
        this.o = aaeyVar;
        this.f = aigzVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffxxVar;
        this.p = elbxVar;
        this.j = cnpdVar;
        this.k = ausaVar;
    }

    @Override // defpackage.aaeg
    public final void a(alxr alxrVar) {
        alxrVar.getClass();
        ekzm b = this.p.b("MetatextClickHandlerImpl#onClick");
        try {
            if (zsr.h(alxrVar)) {
                e(alxrVar);
            } else if (zsr.i(alxrVar)) {
                aaey aaeyVar = this.o;
                axol.k(((aafh) aaeyVar).a, null, new aaff((aafh) aaeyVar, alxrVar, null), 3);
            } else {
                axol.k(this.b, null, new aaet(this, alxrVar, null), 3);
            }
            ffig.a(b, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(b, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        if (r13.a(r4, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.alxr r12, defpackage.ffgu r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.aael
            if (r0 == 0) goto L13
            r0 = r13
            aael r0 = (defpackage.aael) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aael r0 = new aael
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r13)
            goto Lc1
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            aaex r12 = r0.d
            defpackage.ffci.b(r13)
            goto L8d
        L3c:
            aaex r12 = r0.d
            defpackage.ffci.b(r13)
            goto L69
        L42:
            defpackage.ffci.b(r13)
            asix r13 = r11.m
            boolean r13 = r13.a()
            if (r13 == 0) goto L73
            alye r13 = r11.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r12.b()
            engw r12 = defpackage.engw.r(r12)
            cgrr r2 = defpackage.cgrr.METATEXT_MESSAGE_MANUAL_DELETION
            elfl r12 = r13.r(r12, r2)
            r0.d = r11
            r0.c = r5
            java.lang.Object r13 = defpackage.fgfz.c(r12, r0)
            if (r13 != r1) goto L68
            goto Lc0
        L68:
            r12 = r11
        L69:
            r13.getClass()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            goto L96
        L73:
            alye r13 = r11.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r12.b()
            engw r12 = defpackage.engw.r(r12)
            elfl r12 = r13.q(r12)
            r0.d = r11
            r0.c = r4
            java.lang.Object r13 = defpackage.fgfz.c(r12, r0)
            if (r13 != r1) goto L8c
            goto Lc0
        L8c:
            r12 = r11
        L8d:
            r13.getClass()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
        L96:
            if (r13 != 0) goto Lc1
            ablq r13 = r12.q
            ablt r4 = new ablt
            android.content.Context r12 = r12.l
            android.content.res.Resources r12 = r12.getResources()
            r2 = 2132083813(0x7f150465, float:1.9807779E38)
            java.lang.String r5 = r12.getString(r2)
            r5.getClass()
            r9 = 0
            r10 = 125(0x7d, float:1.75E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0.d = r12
            r0.c = r3
            java.lang.Object r12 = r13.a(r4, r0)
            if (r12 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaex.b(alxr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.alxr r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aaem
            if (r0 == 0) goto L13
            r0 = r8
            aaem r0 = (defpackage.aaem) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aaem r0 = new aaem
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r8)
            goto L7e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            aaex r7 = r0.d
            defpackage.ffci.b(r8)
            goto L5c
        L39:
            defpackage.ffci.b(r8)
            boolean r7 = defpackage.zsr.w(r7)
            if (r7 != 0) goto L43
            return r5
        L43:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = r6.n
            aqge r7 = r7.h()
            elfl r7 = r7.b()
            r7.getClass()
            r0.d = r6
            r0.c = r4
            java.lang.Object r8 = defpackage.fgfz.c(r7, r0)
            if (r8 != r1) goto L5b
            goto L96
        L5b:
            r7 = r6
        L5c:
            alxj r8 = (defpackage.alxj) r8
            alxi r8 = r8.b()
            alxi r2 = defpackage.alxi.ONE_ON_ONE
            if (r8 == r2) goto L67
            return r5
        L67:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = r7.n
            aqge r7 = r7.i()
            elfl r7 = r7.b()
            r7.getClass()
            r0.d = r5
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r7, r0)
            if (r8 == r1) goto L96
        L7e:
            engw r8 = (defpackage.engw) r8
            r7 = 0
            java.lang.Object r8 = r8.get(r7)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
            java.lang.String r7 = r8.x(r7)
            boolean r8 = defpackage.aswb.a()
            if (r8 == 0) goto L95
            java.lang.String r7 = defpackage.cuxh.a(r7)
        L95:
            return r7
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaex.c(alxr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r8 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.alxr r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aaen
            if (r0 == 0) goto L13
            r0 = r8
            aaen r0 = (defpackage.aaen) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aaen r0 = new aaen
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r8)
            goto Lb8
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.ffci.b(r8)
            goto L91
        L3a:
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            goto L6e
        L40:
            defpackage.ffci.b(r8)
            alya r7 = r7.d()
            boolean r8 = r7 instanceof defpackage.alyn
            if (r8 == 0) goto Lbd
            ausa r8 = r6.k
            boolean r8 = r8.a()
            if (r8 == 0) goto La0
            r8 = r7
            alyn r8 = (defpackage.alyn) r8
            aqux r8 = r8.c()
            alyx r2 = defpackage.alyx.SIMPLE
            elfl r8 = r8.l(r2)
            ffss r8 = defpackage.axol.e(r8)
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = r8.c(r0)
            if (r8 == r1) goto Lbc
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L9b
            alyn r7 = (defpackage.alyn) r7
            aqux r7 = r7.c()
            alyx r8 = defpackage.alyx.SATELLITE
            elfl r7 = r7.l(r8)
            ffss r7 = defpackage.axol.e(r7)
            r8 = 0
            r0.a = r8
            r0.d = r4
            java.lang.Object r8 = r7.c(r0)
            if (r8 == r1) goto Lbc
        L91:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L9a
            goto L9b
        L9a:
            r5 = 0
        L9b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        La0:
            alyn r7 = (defpackage.alyn) r7
            aqux r7 = r7.c()
            alyx r8 = defpackage.alyx.SIMPLE
            elfl r7 = r7.l(r8)
            ffss r7 = defpackage.axol.e(r7)
            r0.d = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 == r1) goto Lbc
        Lb8:
            r8.getClass()
            return r8
        Lbc:
            return r1
        Lbd:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaex.d(alxr, ffgu):java.lang.Object");
    }

    public final void e(alxr alxrVar) {
        axol.k(this.b, this.e, new aaew(this, alxrVar, null), 2);
    }

    public final boolean f() {
        if (dksg.a(this.l)) {
            return true;
        }
        return this.k.a() && ((cnpk) this.j.h().c()).a();
    }
}
