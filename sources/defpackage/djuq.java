package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuq implements djup {
    private static final dktn a = new dktn("RcsDefaultOnConsentCacheImpl");
    private final dkcp b;
    private final dlpw c;
    private final diwn d;

    public djuq(dkcp dkcpVar, dlpw dlpwVar, diwn diwnVar) {
        this.b = dkcpVar;
        this.c = dlpwVar;
        this.d = diwnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (defpackage.eykj.d(r2).plusMillis(((java.lang.Long) defpackage.djai.t().a.aq.a()).longValue()).isBefore(r1) != false) goto L18;
     */
    @Override // defpackage.djup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cmem a() {
        /*
            r5 = this;
            dkcp r0 = r5.b
            cmeq r0 = r0.e()
            int r1 = r0.h
            cmem r1 = defpackage.cmem.b(r1)
            if (r1 != 0) goto L10
            cmem r1 = defpackage.cmem.UNRECOGNIZED
        L10:
            cmem r2 = defpackage.cmem.OOB_CONSENT
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L19
            goto L70
        L19:
            dkcp r1 = r5.b
            j$.util.Optional r1 = r1.g()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L26
            goto L66
        L26:
            diwn r1 = r5.d
            diur r1 = (defpackage.diur) r1
            ffbr r1 = r1.a
            java.lang.Object r1 = r1.b()
            ersq r1 = (defpackage.ersq) r1
            java.lang.String r2 = "cslib.disable_oob_consent_expiration"
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L70
            dlpw r1 = r5.c
            j$.time.Instant r1 = r1.f()
            eyja r2 = r0.g
            if (r2 != 0) goto L46
            eyja r2 = defpackage.eyja.a
        L46:
            j$.time.Instant r2 = defpackage.eykj.d(r2)
            djai r3 = defpackage.djai.t()
            djah r3 = r3.a
            diza r3 = r3.aq
            java.lang.Object r3 = r3.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            j$.time.Instant r2 = r2.plusMillis(r3)
            boolean r1 = r2.isBefore(r1)
            if (r1 == 0) goto L70
        L66:
            dkcp r0 = r5.b
            cmeq r1 = defpackage.cmeq.a
            r0.v(r1)
            cmem r0 = defpackage.cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED
            return r0
        L70:
            int r0 = r0.h
            cmem r0 = defpackage.cmem.b(r0)
            if (r0 != 0) goto L7a
            cmem r0 = defpackage.cmem.UNRECOGNIZED
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djuq.a():cmem");
    }

    @Override // defpackage.djup
    public final void b() {
        dkty.d(a, "cleanUpRcsDefaultOnConsentCache", new Object[0]);
        this.b.v(cmeq.a);
        this.b.p(null);
    }

    @Override // defpackage.djup
    public final synchronized void c(cmeq cmeqVar) {
        cmem b = cmem.b(cmeqVar.h);
        if (b == null) {
            b = cmem.UNRECOGNIZED;
        }
        cmem a2 = a();
        if ((b.equals(cmem.OOB_CONSENT) || b.equals(cmem.NO_OOB_CONSENT)) && a2.equals(cmem.LEGAL_FYI_SEEN)) {
            dkty.d(a, "setRcsDefaultOnConfiguration: skipped setting OOB-provided consent as user already saw Legal FYI.", new Object[0]);
        } else {
            dkty.d(a, "setRcsDefaultOnConfiguration", new Object[0]);
            this.b.v(cmeqVar);
        }
    }

    @Override // defpackage.djup
    public final void d() {
        Instant f = this.c.f();
        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
        long epochSecond = f.getEpochSecond();
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).b = epochSecond;
        int nano = f.getNano();
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).c = nano;
        eyja eyjaVar = (eyja) eyizVar.build();
        try {
            this.b.b.o("rcs_provisioning_rcs_default_on_server_update_time_key", eyjaVar);
            dkty.l(dkcp.a, "putRcsProvisioningRcsDefaultOnServerUpdateTime %s", eyjaVar);
        } catch (dksb e) {
            dkty.j(e, dkcp.a, "Error while putting RCS Default On server update time in bugle storage", new Object[0]);
        }
    }

    @Override // defpackage.djup
    public final boolean e() {
        cmem a2 = a();
        return a2.equals(cmem.LEGAL_FYI_SEEN) || a2.equals(cmem.OOB_CONSENT);
    }

    @Override // defpackage.djup
    public final boolean f() {
        cmeq e = this.b.e();
        if ((e.b & 2) == 0) {
            return false;
        }
        eyja eyjaVar = e.g;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyja eyjaVar2 = e.f;
        if (eyjaVar2 == null) {
            eyjaVar2 = eyja.a;
        }
        eyja eyjaVar3 = eykm.a;
        return eykl.a(eyjaVar, eyjaVar2) > 0;
    }
}
