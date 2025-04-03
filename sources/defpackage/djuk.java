package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuk implements djun {
    public final Context b;
    public final dkcp c;
    public final dikl d;
    public final djup e;
    public final errl f;
    public final ffbr g;
    public final djuo h;
    private final String k;
    private final ffbr l;
    private final errl m;
    private final cguo n;
    private final cgud o;
    private final ffbr p;
    public final dktn a = new dktn("AsterismGoogleTosConsentApi");
    private final AtomicInteger j = new AtomicInteger();

    public djuk(Context context, ffbr ffbrVar, dkcp dkcpVar, dikl diklVar, dkpm dkpmVar, djuo djuoVar, djup djupVar, errl errlVar, cguo cguoVar, cgud cgudVar, errl errlVar2, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = context;
        this.c = dkcpVar;
        this.d = diklVar;
        this.k = dkpmVar.f();
        this.l = ffbrVar;
        this.h = djuoVar;
        this.e = djupVar;
        this.m = errlVar;
        this.n = cguoVar;
        this.o = cgudVar;
        this.f = errlVar2;
        this.g = ffbrVar2;
        this.p = ffbrVar3;
    }

    private final ListenableFuture j(final cmeq cmeqVar, final ezes ezesVar, int i) {
        SetAsterismConsentRequest a;
        Bundle bundle = new Bundle();
        bundle.putString("is_mo_allowed", "false");
        deyv deyvVar = new deyv();
        deyvVar.a = this.j.incrementAndGet();
        deyvVar.b = 2;
        deyvVar.h = 2;
        deyvVar.f = 2;
        deyvVar.g = bundle;
        if (i != 2) {
            if (i != 3) {
                deyvVar.c = 2;
                deyvVar.e = Long.valueOf(Instant.now().toEpochMilli());
                Context context = this.b;
                deyvVar.i = dkvy.e(context, dkvy.a(context), 1);
                deyvVar.j = cmeqVar.d;
                deyvVar.k = cmeqVar.e;
                a = deyvVar.a();
                final SetAsterismConsentRequest setAsterismConsentRequest = a;
                final String l = l();
                return elmc.a(erny.f(duin.a(((deys) this.l.b()).a(setAsterismConsentRequest)), eldl.a(new emwl() { // from class: djuj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        String str = l;
                        SetAsterismConsentResponse setAsterismConsentResponse = (SetAsterismConsentResponse) obj;
                        SetAsterismConsentRequest setAsterismConsentRequest2 = setAsterismConsentRequest;
                        Integer valueOf = Integer.valueOf(setAsterismConsentRequest2.a);
                        cmeq cmeqVar2 = cmeqVar;
                        clxt b = clxt.b(cmeqVar2.c);
                        if (b == null) {
                            b = clxt.UNRECOGNIZED;
                        }
                        String clxtVar = b.toString();
                        cmem b2 = cmem.b(cmeqVar2.h);
                        if (b2 == null) {
                            b2 = cmem.UNRECOGNIZED;
                        }
                        djuk djukVar = djuk.this;
                        ezes ezesVar2 = ezesVar;
                        dkty.l(djukVar.a, "setAsterismConsent for Revoke Consent succeeded: sessionId=%s requestCode=%s tosConsent=%s rcsDefaultOnConsent=%s googleToSConsentSource=%s responseHasGmscoreIidToken=%s", str, valueOf, clxtVar, b2.toString(), ezesVar2, Boolean.valueOf(!setAsterismConsentResponse.b.isEmpty()));
                        int i2 = setAsterismConsentRequest2.a;
                        clxt b3 = clxt.b(cmeqVar2.c);
                        if (b3 == null) {
                            b3 = clxt.UNRECOGNIZED;
                        }
                        clxt clxtVar2 = b3;
                        cmem b4 = cmem.b(cmeqVar2.h);
                        if (b4 == null) {
                            b4 = cmem.UNRECOGNIZED;
                        }
                        djukVar.d.z(djukVar.b, str, i2, clxtVar2, b4, ezesVar2, false, !setAsterismConsentResponse.b.isEmpty(), true, null, true);
                        return setAsterismConsentResponse.b;
                    }
                }), this.f), new emwl() { // from class: djty
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            cmeq cmeqVar2 = cmeqVar;
                            SetAsterismConsentRequest setAsterismConsentRequest2 = setAsterismConsentRequest;
                            String str = l;
                            djuk djukVar = djuk.this;
                            Integer valueOf = Integer.valueOf(setAsterismConsentRequest2.a);
                            clxt b = clxt.b(cmeqVar2.c);
                            if (b == null) {
                                b = clxt.UNRECOGNIZED;
                            }
                            dktn dktnVar = djukVar.a;
                            ezes ezesVar2 = ezesVar;
                            dkty.t(th, dktnVar, "setAsterismConsent failure: sessionId=%s requestCode=%s consent=%s googleToSConsentSource=%s", str, valueOf, b.toString(), ezesVar2);
                            dikl diklVar = djukVar.d;
                            Context context2 = djukVar.b;
                            int i2 = setAsterismConsentRequest2.a;
                            clxt b2 = clxt.b(cmeqVar2.c);
                            if (b2 == null) {
                                b2 = clxt.UNRECOGNIZED;
                            }
                            cmem b3 = cmem.b(cmeqVar2.h);
                            if (b3 == null) {
                                b3 = cmem.UNRECOGNIZED;
                            }
                            diklVar.z(context2, str, i2, b2, b3, ezesVar2, false, false, false, th, true);
                            ((cmoc) djukVar.g.b()).a(5);
                        }
                        return th;
                    }
                }, this.f);
            }
            i = 3;
        }
        deyvVar.o = i;
        a = deyvVar.a();
        final SetAsterismConsentRequest setAsterismConsentRequest2 = a;
        final String l2 = l();
        return elmc.a(erny.f(duin.a(((deys) this.l.b()).a(setAsterismConsentRequest2)), eldl.a(new emwl() { // from class: djuj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = l2;
                SetAsterismConsentResponse setAsterismConsentResponse = (SetAsterismConsentResponse) obj;
                SetAsterismConsentRequest setAsterismConsentRequest22 = setAsterismConsentRequest2;
                Integer valueOf = Integer.valueOf(setAsterismConsentRequest22.a);
                cmeq cmeqVar2 = cmeqVar;
                clxt b = clxt.b(cmeqVar2.c);
                if (b == null) {
                    b = clxt.UNRECOGNIZED;
                }
                String clxtVar = b.toString();
                cmem b2 = cmem.b(cmeqVar2.h);
                if (b2 == null) {
                    b2 = cmem.UNRECOGNIZED;
                }
                djuk djukVar = djuk.this;
                ezes ezesVar2 = ezesVar;
                dkty.l(djukVar.a, "setAsterismConsent for Revoke Consent succeeded: sessionId=%s requestCode=%s tosConsent=%s rcsDefaultOnConsent=%s googleToSConsentSource=%s responseHasGmscoreIidToken=%s", str, valueOf, clxtVar, b2.toString(), ezesVar2, Boolean.valueOf(!setAsterismConsentResponse.b.isEmpty()));
                int i2 = setAsterismConsentRequest22.a;
                clxt b3 = clxt.b(cmeqVar2.c);
                if (b3 == null) {
                    b3 = clxt.UNRECOGNIZED;
                }
                clxt clxtVar2 = b3;
                cmem b4 = cmem.b(cmeqVar2.h);
                if (b4 == null) {
                    b4 = cmem.UNRECOGNIZED;
                }
                djukVar.d.z(djukVar.b, str, i2, clxtVar2, b4, ezesVar2, false, !setAsterismConsentResponse.b.isEmpty(), true, null, true);
                return setAsterismConsentResponse.b;
            }
        }), this.f), new emwl() { // from class: djty
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    cmeq cmeqVar2 = cmeqVar;
                    SetAsterismConsentRequest setAsterismConsentRequest22 = setAsterismConsentRequest2;
                    String str = l2;
                    djuk djukVar = djuk.this;
                    Integer valueOf = Integer.valueOf(setAsterismConsentRequest22.a);
                    clxt b = clxt.b(cmeqVar2.c);
                    if (b == null) {
                        b = clxt.UNRECOGNIZED;
                    }
                    dktn dktnVar = djukVar.a;
                    ezes ezesVar2 = ezesVar;
                    dkty.t(th, dktnVar, "setAsterismConsent failure: sessionId=%s requestCode=%s consent=%s googleToSConsentSource=%s", str, valueOf, b.toString(), ezesVar2);
                    dikl diklVar = djukVar.d;
                    Context context2 = djukVar.b;
                    int i2 = setAsterismConsentRequest22.a;
                    clxt b2 = clxt.b(cmeqVar2.c);
                    if (b2 == null) {
                        b2 = clxt.UNRECOGNIZED;
                    }
                    cmem b3 = cmem.b(cmeqVar2.h);
                    if (b3 == null) {
                        b3 = cmem.UNRECOGNIZED;
                    }
                    diklVar.z(context2, str, i2, b2, b3, ezesVar2, false, false, false, th, true);
                    ((cmoc) djukVar.g.b()).a(5);
                }
                return th;
            }
        }, this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0051, code lost:
    
        if (r1.equals(defpackage.clxt.GOOGLE_TOS_CONSENTED) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006a, code lost:
    
        if (r1.equals(defpackage.clxt.GOOGLE_TOS_CONSENTED) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture k(final defpackage.cmeq r9, final defpackage.ezes r10) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djuk.k(cmeq, ezes):com.google.common.util.concurrent.ListenableFuture");
    }

    private final String l() {
        return ((dkdw) this.p.b()).k(this.k);
    }

    private final boolean m() {
        return (djai.z() && djai.ac()) ? this.o.a(this.k) : djai.G();
    }

    private final boolean n(cmeq cmeqVar) {
        if (!m()) {
            return false;
        }
        cmem b = cmem.b(cmeqVar.h);
        if (b == null) {
            b = cmem.UNRECOGNIZED;
        }
        return b.equals(cmem.LEGAL_FYI_SEEN);
    }

    public final elfl a(final boolean z) {
        return elfo.f(new Runnable() { // from class: djue
            @Override // java.lang.Runnable
            public final void run() {
                cmep cmepVar = (cmep) cmeq.a.createBuilder();
                cmem cmemVar = z ? cmem.OOB_CONSENT : cmem.NO_OOB_CONSENT;
                djuk djukVar = djuk.this;
                cmepVar.copyOnWrite();
                ((cmeq) cmepVar.instance).h = cmemVar.a();
                djukVar.e.c((cmeq) cmepVar.build());
            }
        }, this.f);
    }

    @Override // defpackage.djun
    public final ListenableFuture b() {
        final GetAsterismConsentRequest getAsterismConsentRequest = new GetAsterismConsentRequest(this.j.incrementAndGet(), 2);
        final String l = l();
        deys deysVar = (deys) this.l.b();
        dfun dfunVar = new dfun();
        dfunVar.a = new deyo(getAsterismConsentRequest);
        dfunVar.b = new Feature[]{dfzt.a};
        dfunVar.c = 11301;
        return elmc.a(erny.f(duin.a(deysVar.i(dfunVar.a())), eldl.a(new emwl() { // from class: djtz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                GetAsterismConsentResponse getAsterismConsentResponse = (GetAsterismConsentResponse) obj;
                clxt clxtVar = getAsterismConsentResponse.b == 1 ? clxt.GOOGLE_TOS_CONSENTED : clxt.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
                GetAsterismConsentRequest getAsterismConsentRequest2 = getAsterismConsentRequest;
                String str = l;
                djuk djukVar = djuk.this;
                String str2 = getAsterismConsentResponse.c;
                djukVar.c.p(str2);
                dkty.k("getAsterismConsent succeeded: sessionId=%s requestCode=%s consent=%s responseHasGmscoreIidToken=%s", str, Integer.valueOf(getAsterismConsentRequest2.a), clxtVar.toString(), Boolean.valueOf(!str2.isEmpty()));
                djukVar.d.w(djukVar.b, str, getAsterismConsentRequest2.a, clxtVar, !getAsterismConsentResponse.c.isEmpty(), true, null);
                return new djul(clxtVar, str2);
            }
        }), erpp.a), new emwl() { // from class: djua
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    GetAsterismConsentRequest getAsterismConsentRequest2 = getAsterismConsentRequest;
                    String str = l;
                    djuk djukVar = djuk.this;
                    dkty.s(th, "getAsterismConsent failure: sessionId=%s requestCode=%s", str, Integer.valueOf(getAsterismConsentRequest2.a));
                    djukVar.d.w(djukVar.b, str, getAsterismConsentRequest2.a, clxt.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED, false, false, th);
                }
                return th;
            }
        }, erpp.a);
    }

    @Override // defpackage.djun
    public final ListenableFuture c(final ezes ezesVar, boolean z) {
        if (djai.M() && z) {
            return elfo.h(new erog() { // from class: djug
                /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        r7 = this;
                        djuk r0 = defpackage.djuk.this
                        dkcp r1 = r0.c
                        j$.util.Optional r2 = r1.k()
                        cmeq r1 = r1.e()
                        boolean r3 = r2.isPresent()
                        r4 = 0
                        if (r3 == 0) goto L23
                        java.lang.Object r3 = r2.get()
                        cmeq r5 = defpackage.cmeq.a
                        eyfy r3 = (defpackage.eyfy) r3
                        boolean r3 = r3.equals(r5)
                        if (r3 != 0) goto L23
                        r3 = 1
                        goto L24
                    L23:
                        r3 = r4
                    L24:
                        ezes r5 = r2
                        cmeq r6 = defpackage.cmeq.a
                        boolean r6 = r1.equals(r6)
                        if (r3 == 0) goto L60
                        if (r6 != 0) goto L67
                        eyja r3 = r1.g
                        if (r3 != 0) goto L36
                        eyja r3 = defpackage.eyja.a
                    L36:
                        j$.time.Instant r3 = defpackage.eykj.d(r3)
                        java.lang.Object r4 = r2.get()
                        cmeq r4 = (defpackage.cmeq) r4
                        eyja r4 = r4.g
                        if (r4 != 0) goto L46
                        eyja r4 = defpackage.eyja.a
                    L46:
                        j$.time.Instant r4 = defpackage.eykj.d(r4)
                        boolean r3 = r3.isBefore(r4)
                        if (r3 == 0) goto L5b
                        java.lang.Object r1 = r2.get()
                        cmeq r1 = (defpackage.cmeq) r1
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.e(r5, r1)
                        return r0
                    L5b:
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.d(r5, r1)
                        return r0
                    L60:
                        if (r6 != 0) goto L67
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.d(r5, r1)
                        return r0
                    L67:
                        if (r3 == 0) goto L74
                        java.lang.Object r1 = r2.get()
                        cmeq r1 = (defpackage.cmeq) r1
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.e(r5, r1)
                        return r0
                    L74:
                        dktn r1 = r0.a
                        java.lang.Object[] r2 = new java.lang.Object[r4]
                        java.lang.String r3 = "Both RcsDefaultOnConsentCache's and GoogleToSConsentCache's are empty in Storage, hence not Revoking Consent"
                        defpackage.dkty.l(r1, r3, r2)
                        ffbr r0 = r0.g
                        java.lang.Object r0 = r0.b()
                        cmoc r0 = (defpackage.cmoc) r0
                        r1 = 3
                        r0.a(r1)
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.erre.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.djug.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.f);
        }
        Optional k = this.c.k();
        if (!k.isEmpty()) {
            clxt clxtVar = clxt.GOOGLE_TOS_DECLINED;
            clxt b = clxt.b(((cmeq) k.get()).c);
            if (b == null) {
                b = clxt.UNRECOGNIZED;
            }
            if (clxtVar.equals(b)) {
                return erny.f(erqc.o(k((cmeq) k.get(), ezesVar)), new emwl() { // from class: djuh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        djuk.this.h.b();
                        return null;
                    }
                }, this.m);
            }
        }
        dkty.k("Google ToS config is not available from Bugle storage or not declined.", new Object[0]);
        return erre.a;
    }

    public final ListenableFuture d(ezes ezesVar, cmeq cmeqVar) {
        int ordinal = this.e.a().ordinal();
        Optional empty = ordinal != 1 ? ordinal != 2 ? Optional.empty() : Optional.of(3) : Optional.of(2);
        if (!empty.isEmpty()) {
            return erny.f(erqc.o(j(cmeqVar, ezesVar, ((Integer) empty.get()).intValue())), new emwl() { // from class: djuf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    djuk djukVar = djuk.this;
                    djukVar.h.b();
                    djukVar.e.b();
                    ((cmoc) djukVar.g.b()).a(2);
                    return null;
                }
            }, this.f);
        }
        dkty.l(this.a, "RcsDefaultOnConsentState is not LEGAL_FYI_SEEN or OOB_CONSENT", new Object[0]);
        return erre.a;
    }

    public final ListenableFuture e(ezes ezesVar, cmeq cmeqVar) {
        return erny.f(erqc.o(j(cmeqVar, ezesVar, 1)), new emwl() { // from class: djub
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                djuk djukVar = djuk.this;
                djukVar.h.b();
                djukVar.e.b();
                ((cmoc) djukVar.g.b()).a(2);
                return null;
            }
        }, this.f);
    }

    @Override // defpackage.djun
    public final ListenableFuture f(final ezes ezesVar) {
        Object obj;
        if (!h(ezesVar)) {
            Optional k = this.c.k();
            if (!k.isEmpty()) {
                clxt b = clxt.b(((cmeq) k.get()).c);
                if (b == null) {
                    b = clxt.UNRECOGNIZED;
                }
                if (!b.equals(clxt.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED)) {
                    obj = k.get();
                }
            }
            return erqt.h(new IllegalStateException("Google ToS config is not available from Bugle storage."));
        }
        cmeq e = this.c.e();
        obj = e;
        if (!g()) {
            cmem b2 = cmem.b(e.h);
            if (b2 == null) {
                b2 = cmem.UNRECOGNIZED;
            }
            obj = e;
            if (b2.equals(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
                return erqt.h(new IllegalStateException("RCS Default On config is not available from Bugle storage."));
            }
        }
        return erny.g(erqc.o(k((cmeq) obj, ezesVar)), new eroh() { // from class: djtx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final djuk djukVar = djuk.this;
                final String str = (String) obj2;
                djukVar.c.p(str);
                ezes ezesVar2 = ezesVar;
                if (djukVar.g() && ezesVar2.equals(ezes.RCS_DEFAULT_ON_OOB_CONSENT)) {
                    return djukVar.a(true).h(new emwl() { // from class: djui
                        @Override // defpackage.emwl
                        public final Object apply(Object obj3) {
                            djuk.this.e.d();
                            return str;
                        }
                    }, djukVar.f);
                }
                if (djukVar.h(ezesVar2)) {
                    djukVar.e.d();
                } else {
                    djuo djuoVar = djukVar.h;
                    Instant now = Instant.now();
                    eyiz eyizVar = (eyiz) eyja.a.createBuilder();
                    long epochSecond = now.getEpochSecond();
                    eyizVar.copyOnWrite();
                    ((eyja) eyizVar.instance).b = epochSecond;
                    int nano = now.getNano();
                    eyizVar.copyOnWrite();
                    ((eyja) eyizVar.instance).c = nano;
                    eyja eyjaVar = (eyja) eyizVar.build();
                    try {
                        djuoVar.a.b.o("rcsProvisioningGoogleToSServerUpdateTime", eyjaVar);
                        dkty.l(dkcp.a, "putRcsProvisioningGoogleTosServerUpdateTime %s", eyjaVar);
                    } catch (dksb e2) {
                        dkty.j(e2, dkcp.a, "Error while putting Google ToS server update time in bugle storage", new Object[0]);
                    }
                }
                return elfo.e(str);
            }
        }, this.f);
    }

    public final boolean g() {
        return (djai.z() && djai.ac()) ? this.o.b(this.k) : djai.J();
    }

    public final boolean h(ezes ezesVar) {
        if (m() && ezesVar.equals(ezes.LEGAL_FYI_SEEN)) {
            return true;
        }
        return g() && ezesVar.equals(ezes.RCS_DEFAULT_ON_OOB_CONSENT);
    }

    public final boolean i() {
        return g() && this.e.a().equals(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
    }
}
