package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqdr implements coxg {
    private static final cskc e = cskc.g("Bugle", "ForwardSyncManager");
    public final ffbr c;
    public final ffbr d;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final Context k;
    private final ffsk l;
    private boolean m;

    public cqdr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, Context context, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        context.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = context;
        this.l = ffskVar;
        this.m = true;
    }

    public final List A() {
        ArrayList arrayList = new ArrayList();
        if (!this.m) {
            e.p("Forward Sync manually disabled");
        }
        if (!this.m) {
            arrayList.add(eqqd.SYNC_DISABLED);
        }
        ArrayList arrayList2 = new ArrayList();
        if (((Optional) ((fbbb) this.g).a).isPresent() && !((ctvs) this.f.b()).e()) {
            arrayList2.add(eqqd.NON_SMS_CAPABLE_WEAR_DEVICE);
        }
        if (!((ctvs) this.f.b()).d()) {
            arrayList2.add(eqqd.BUGLE_NOT_DEFAULT_SMS_APP);
        }
        if (!arrayList2.isEmpty()) {
            csjb d = e.d();
            d.I("Can't sync with Telephony");
            d.B("isWearable", ((Optional) ((fbbb) this.g).a).isPresent());
            d.B("isSmsCapable", ((ctvs) this.f.b()).e());
            d.B("isDefaultSmsApp", ((ctvs) this.f.b()).d());
            d.r();
        }
        arrayList.addAll(ffdx.ak(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        if (((auwy) this.j.b()).a()) {
            if (!((ctud) this.h.b()).k()) {
                arrayList3.add(eqqd.MISSING_PERMISSIONS);
            }
        } else if (!((ctud) this.h.b()).r()) {
            arrayList3.add(eqqd.MISSING_PERMISSIONS);
        }
        if (!ctid.i(this.k)) {
            arrayList3.add(eqqd.SMS_NOT_ALLOWED_FOR_USER);
        }
        if (!arrayList3.isEmpty()) {
            csjb e2 = e.e();
            e2.I("Missing required permissions for Forward Sync.");
            e2.B("hasSmsPermission", ((ctud) this.h.b()).r());
            e2.B("hasContactsPermission", ((ctud) this.h.b()).i());
            e2.B("hasPhoneStatePermission", ((ctud) this.h.b()).l());
            e2.B("smsAllowedForUser", ctid.i(this.k));
            e2.r();
        }
        arrayList.addAll(ffdx.ak(arrayList3));
        return arrayList;
    }

    @Override // defpackage.coxg
    @ffbs
    public final long a(long j) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    @ffbs
    public final cqdh b(long j) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    @ffbs
    public final elfl c(boolean z, long j, long j2, long j3, UUID uuid) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    @ffbs
    public final elfl d() {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    public final elfl e() {
        cqek cqekVar = (cqek) this.d.b();
        return cqekVar.g.h().h(new emwl() { // from class: cqec
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cqdv) obj).c);
            }
        }, cqekVar.h);
    }

    @Override // defpackage.coxg
    public final elfl f(eqqh eqqhVar) {
        eqqhVar.getClass();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.l, ekxi.a(ffheVar), ffsmVar, new cqdm(null, this, eqqhVar)));
    }

    @Override // defpackage.coxg
    @ffbs
    public final void g() {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    @ffbs
    public final void h() {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    public final void i(long j) {
        ekzz f = eleg.f("ForwardSyncManager::onNewMessageInserted");
        try {
            cqfs cqfsVar = (cqfs) this.c.b();
            Instant ofEpochMilli = Instant.ofEpochMilli(j);
            ofEpochMilli.getClass();
            cqfsVar.c(ofEpochMilli);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.coxg
    @ffbs
    public final void j(long j, eqqh eqqhVar) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    public final void k(eqqh eqqhVar) {
        eqqhVar.getClass();
        axol.k(this.l, null, new cqdn(this, eqqhVar, null), 3);
    }

    @Override // defpackage.coxg
    public final void l(eqqh eqqhVar) {
        eqqhVar.getClass();
        axol.k(this.l, null, new cqdo(this, eqqhVar, null), 3);
    }

    @Override // defpackage.coxg
    public final void m(Uri uri, Instant instant) {
        uri.getClass();
        instant.getClass();
        axol.k(this.l, null, new cqdp(this, uri, instant, null), 3);
    }

    @Override // defpackage.coxg
    public final void n() {
        axol.k(this.l, null, new cqdq(this, null), 3);
    }

    @Override // defpackage.coxg
    @ffbs
    public final void o(cno cnoVar) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    @ffbs
    public final void p(boolean z) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    public final void q(boolean z) {
        this.m = z;
    }

    @Override // defpackage.coxg
    @ffbs
    public final void r(long j) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    public final boolean s() {
        Instant instant;
        cqek cqekVar = (cqek) this.d.b();
        Instant instant2 = cqek.d;
        if (((Boolean) cqek.a.e()).booleanValue()) {
            try {
                if ((((cqdv) cqekVar.g.l()).b & 4) != 0) {
                    eyja eyjaVar = ((cqdv) cqekVar.g.l()).e;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    instant = eykj.d(eyjaVar);
                }
            } catch (eygu e2) {
                cqek.b.s("Unable to retrieve data.", e2);
            }
            instant = cqek.d;
        } else {
            instant = Instant.ofEpochMilli(cqekVar.e.e("last_sync_time_millis", -1L));
        }
        boolean z = !instant2.equals(instant);
        Boolean.valueOf(z).getClass();
        return z;
    }

    @Override // defpackage.coxg
    @ffbs
    public final boolean t(long j) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.coxg
    public final boolean u() {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((cqdv) ((cqek) this.d.b()).g.l()).c);
        } catch (eygu e2) {
            cqek.b.s("Unable to retrieve data.", e2);
            bool = false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.coxg
    public final boolean v() {
        return ((cqfs) this.c.b()).d();
    }

    @Override // defpackage.coxg
    @ffbs
    public final boolean w(long j) {
        throw new ffce("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        if (r2.a(r10, r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (y(r10, r9, true, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.eqqh r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cqdj
            if (r0 == 0) goto L13
            r0 = r10
            cqdj r0 = (defpackage.cqdj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqdj r0 = new cqdj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L3a
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            eqqh r9 = r0.e
            cqdr r2 = r0.d
            defpackage.ffci.b(r10)
            goto L73
        L3a:
            defpackage.ffci.b(r10)
            goto Ld1
        L3f:
            defpackage.ffci.b(r10)
            java.util.List r10 = r8.A()
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L56
            r0.c = r5
            java.lang.Object r9 = r8.y(r10, r9, r5, r0)
            if (r9 != r1) goto Ld1
            goto Ld0
        L56:
            ffbr r10 = r8.d
            java.lang.Object r10 = r10.b()
            cqek r10 = (defpackage.cqek) r10
            elfl r10 = r10.a()
            r10.getClass()
            r0.d = r8
            r0.e = r9
            r0.c = r4
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 != r1) goto L72
            goto Ld0
        L72:
            r2 = r8
        L73:
            j$.time.Instant r10 = (j$.time.Instant) r10
            cqgj r4 = defpackage.cqgj.a
            eyfq r4 = r4.createBuilder()
            cqge r4 = (defpackage.cqge) r4
            r4.getClass()
            java.util.UUID r6 = java.util.UUID.randomUUID()
            r6.getClass()
            eyee r6 = defpackage.cqjf.a(r6)
            defpackage.cqgs.g(r6, r4)
            cqfx r6 = defpackage.cqfx.a
            eyfq r6 = r6.createBuilder()
            cqfw r6 = (defpackage.cqfw) r6
            r6.getClass()
            if (r10 == 0) goto Lad
            j$.time.Instant r7 = j$.time.Instant.EPOCH
            int r10 = r10.compareTo(r7)
            if (r10 >= 0) goto La4
            goto La6
        La4:
            r10 = 0
            r5 = r10
        La6:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            r10.getClass()
        Lad:
            defpackage.cqgp.b(r5, r6)
            cqfx r10 = defpackage.cqgp.a(r6)
            defpackage.cqgs.d(r10, r4)
            cqgj r10 = defpackage.cqgs.c(r4)
            ffbr r2 = r2.c
            java.lang.Object r2 = r2.b()
            cqfs r2 = (defpackage.cqfs) r2
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r9 = r2.a(r10, r9, r0)
            if (r9 != r1) goto Ld1
        Ld0:
            return r1
        Ld1:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqdr.x(eqqh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[LOOP:0: B:12:0x0090->B:14:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.util.List r6, defpackage.eqqh r7, boolean r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cqdk
            if (r0 == 0) goto L13
            r0 = r9
            cqdk r0 = (defpackage.cqdk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqdk r0 = new cqdk
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            eqqh r7 = r0.f
            java.lang.Object r6 = r0.a
            cqdr r8 = r0.e
            defpackage.ffci.b(r9)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.ffci.b(r9)
            if (r8 == 0) goto L70
            ffbr r8 = r5.d
            java.lang.Object r8 = r8.b()
            cqek r8 = (defpackage.cqek) r8
            elfl r8 = r8.a()
            r8.getClass()
            r0.e = r5
            r0.a = r6
            r0.f = r7
            r0.d = r4
            java.lang.Object r9 = defpackage.fgfz.c(r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r8 = r5
        L5a:
            j$.time.Instant r0 = defpackage.cqek.c
            boolean r9 = defpackage.ffkj.e(r9, r0)
            ffbr r8 = r8.i
            java.lang.Object r8 = r8.b()
            cqcd r8 = (defpackage.cqcd) r8
            engw r0 = defpackage.engq.a(r6)
            r8.b(r7, r3, r9, r0)
            goto L7f
        L70:
            ffbr r8 = r5.i
            java.lang.Object r8 = r8.b()
            cqcd r8 = (defpackage.cqcd) r8
            engw r9 = defpackage.engq.a(r6)
            r8.c(r7, r3, r9)
        L7f:
            cskc r7 = defpackage.cqdr.e
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.ffdx.n(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L90:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La4
            java.lang.Object r9 = r6.next()
            eqqd r9 = (defpackage.eqqd) r9
            java.lang.String r9 = r9.name()
            r8.add(r9)
            goto L90
        La4:
            r8.toString()
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = "Sync request failed: "
            java.lang.String r6 = r8.concat(r6)
            r7.p(r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqdr.y(java.util.List, eqqh, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x012e, code lost:
    
        if (r2.a(r10, r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (y(r10, r9, false, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.eqqh r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqdr.z(eqqh, ffgu):java.lang.Object");
    }
}
