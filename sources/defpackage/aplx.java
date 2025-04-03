package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aplx implements apmo {
    public static final entd a = entd.c("BugleTyping");
    public final cowz b;
    public final ffsk c;
    public final aqge d;
    public final aqge e;
    public final long g;
    public ffud h;
    public final AtomicReference i;
    public final AtomicBoolean j;
    private final avkm k;
    private final ffhd l;
    private final cqoh m;
    private final clwg n;
    private final BugleConversationId o;
    private ctbx q;
    private final Duration r;
    private final Object p = new Object();
    public Instant f = Instant.EPOCH;

    public aplx(cowz cowzVar, avkm avkmVar, ffsk ffskVar, ffhd ffhdVar, cqoh cqohVar, clwg clwgVar, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2) {
        this.b = cowzVar;
        this.k = avkmVar;
        this.c = ffskVar;
        this.l = ffhdVar;
        this.m = cqohVar;
        this.n = clwgVar;
        this.o = bugleConversationId;
        this.d = aqgeVar;
        this.e = aqgeVar2;
        long j = ffpw.a;
        Duration ofSeconds = Duration.ofSeconds(ffpw.h(ffpy.e(fdlk.a(), ffpz.c)), ffpw.d(r1));
        ofSeconds.getClass();
        this.r = ofSeconds;
        this.g = ffpy.e(fdlk.b(), ffpz.c);
        this.i = new AtomicReference(null);
        this.j = new AtomicBoolean(false);
    }

    @Override // defpackage.apmo
    public final elfl a() {
        this.j.set(true);
        ctbx ctbxVar = this.q;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        if (this.h != null) {
            h();
            return c();
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    @Override // defpackage.apmo
    public final elfl b() {
        elfl c;
        axol.k(this.c, null, new aplo(this, null), 3);
        ffud ffudVar = this.h;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.h = null;
        Instant f = this.m.f();
        if (Duration.between(this.f, f).compareTo(this.r) < 0) {
            i();
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        synchronized (this.p) {
            if (this.q == null) {
                ctbx a2 = this.e.a(new aqgd() { // from class: apll
                    @Override // defpackage.aqgd
                    public final elfl a() {
                        elfl c2;
                        aplx aplxVar = aplx.this;
                        c2 = axol.c(aplxVar.c, ffhe.a, ffsm.a, new aplw(aplxVar, null));
                        return c2;
                    }
                });
                a2.getClass();
                this.q = a2;
            }
        }
        c = axol.c(this.c, ffhe.a, ffsm.a, new aplp(this, f, null));
        return csvs.a(c);
    }

    public final elfl c() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new apls(this, null));
        return csvs.a(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cowy r9, j$.time.Instant r10, defpackage.amfx r11, defpackage.apfz r12, defpackage.aqux r13, defpackage.ffgu r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.apln
            if (r0 == 0) goto L13
            r0 = r14
            apln r0 = (defpackage.apln) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            apln r0 = new apln
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.d
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.f
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L46
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.ffci.b(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r13 = r7.c
            java.lang.Object r12 = r7.b
            java.lang.Object r11 = r7.a
            j$.time.Instant r10 = r7.i
            cowy r9 = r7.h
            aplx r1 = r7.g
            defpackage.ffci.b(r14)
        L44:
            r6 = r10
            goto L7e
        L46:
            defpackage.ffci.b(r14)
            alyx r14 = r12.e()
            boolean r14 = r14.g
            if (r14 == 0) goto Lc3
            alxh r14 = r12.d()
            alxh r1 = defpackage.alxh.NONE
            if (r14 == r1) goto L5a
            goto Lc3
        L5a:
            if (r13 == 0) goto Lbb
            ffhd r14 = r8.l
            ffhd r14 = defpackage.ekxi.a(r14)
            aplm r1 = new aplm
            r1.<init>(r5, r8, r13)
            r7.g = r8
            r7.h = r9
            r7.i = r10
            r7.a = r11
            r7.b = r12
            r7.c = r13
            r7.f = r4
            java.lang.Object r14 = defpackage.ffra.a(r14, r1, r7)
            if (r14 != r0) goto L7c
            goto Lb9
        L7c:
            r1 = r8
            goto L44
        L7e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r10 = r14.booleanValue()
            if (r10 != 0) goto L98
            entd r9 = defpackage.aplx.a
            ensk r9 = r9.e()
            ensz r9 = (defpackage.ensz) r9
            java.lang.String r10 = "Not sending a typing indicator because we should not share our typing status"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        L98:
            apfz r12 = (defpackage.apfz) r12
            engw r4 = r12.s()
            int r10 = r13.b()
            r7.g = r5
            r7.h = r5
            r7.i = r5
            r7.a = r5
            r7.b = r5
            r7.c = r5
            r7.f = r3
            r2 = r9
            r5 = r10
            r3 = r11
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            return r9
        Lbb:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        Lc3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplx.d(cowy, j$.time.Instant, amfx, apfz, aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cowy r8, defpackage.amfx r9, java.util.List r10, int r11, j$.time.Instant r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplx.e(cowy, amfx, java.util.List, int, j$.time.Instant, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aplu
            if (r0 == 0) goto L13
            r0 = r5
            aplu r0 = (defpackage.aplu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aplu r0 = new aplu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aplx r0 = r0.d
            defpackage.ffci.b(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            aqge r5 = r4.e
            elfl r5 = r5.b()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L92
            r0 = r4
        L48:
            apfz r5 = (defpackage.apfz) r5
            alxi r1 = r5.o()
            alxi r2 = defpackage.alxi.ONE_ON_ONE
            if (r1 != r2) goto L8f
            alyx r1 = r5.e()
            boolean r1 = r1.g
            if (r1 == 0) goto L8f
            alxh r1 = r5.d()
            alxh r2 = defpackage.alxh.NONE
            if (r1 == r2) goto L63
            goto L8f
        L63:
            engw r1 = r5.s()
            java.lang.Object r1 = defpackage.ffdx.T(r1)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            aoku r1 = r1.g()
            aqux r5 = r5.g()
            if (r5 != 0) goto L87
            entd r5 = defpackage.aplx.a
            ensk r5 = r5.j()
            ensz r5 = (defpackage.ensz) r5
            java.lang.String r0 = "Self identity is not present while sending a typing pre-warm."
            r5.q(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L87:
            clwg r0 = r0.n
            r0.d(r5, r1)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L8f:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplx.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.apfz r9, defpackage.amfx r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.aplv
            if (r0 == 0) goto L13
            r0 = r11
            aplv r0 = (defpackage.aplv) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aplv r0 = new aplv
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            aplx r0 = r0.f
            defpackage.ffci.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L85
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.ffci.b(r11)
            java.util.concurrent.atomic.AtomicReference r11 = r8.i
            java.lang.Object r11 = r11.get()
            apmn r11 = (defpackage.apmn) r11
            if (r11 != 0) goto L46
            goto L96
        L46:
            aqux r2 = r9.g()
            apfz r4 = r11.a
            aqux r4 = r4.g()
            if (r4 == 0) goto L96
            if (r2 == 0) goto L61
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r2.g()
            boolean r2 = r4.w(r2)
            if (r2 != 0) goto L5f
            goto L61
        L5f:
            r0 = r8
            goto L87
        L61:
            amfx r2 = r11.b
            apfz r11 = r11.a
            ffsk r4 = r8.c
            aplr r5 = new aplr
            r6 = 0
            r5.<init>(r8, r2, r11, r6)
            elfl r11 = defpackage.axol.h(r4, r5)
            elfl r11 = defpackage.csvs.a(r11)
            r0.f = r8
            r0.a = r9
            r0.b = r10
            r0.e = r3
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            r0 = r8
        L85:
            java.lang.Void r11 = (java.lang.Void) r11
        L87:
            java.util.concurrent.atomic.AtomicReference r11 = r0.i
            apmn r0 = new apmn
            apfz r9 = (defpackage.apfz) r9
            r0.<init>(r9, r10)
            r11.set(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L96:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplx.g(apfz, amfx, ffgu):java.lang.Object");
    }

    @Override // defpackage.apmo
    public final void h() {
        ffud ffudVar = this.h;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.h = null;
    }

    public final void i() {
        this.h = axol.k(this.c, null, new aplq(this, null), 3);
    }
}
