package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuo {
    public final dkcp a;

    public djuo(dkcp dkcpVar) {
        this.a = dkcpVar;
    }

    public final clxt a() {
        Optional k = this.a.k();
        if (!k.isPresent()) {
            return clxt.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
        }
        clxt b = clxt.b(((cmeq) k.get()).c);
        return b == null ? clxt.UNRECOGNIZED : b;
    }

    public final void b() {
        dkty.c("cleanUpGoogleTosConsentCache", new Object[0]);
        this.a.u(cmeq.a);
        this.a.p(null);
        this.a.D(false);
    }

    public final void c(cmeq cmeqVar) {
        dkty.c("setGoogleTosConfiguration", new Object[0]);
        this.a.u(cmeqVar);
    }

    public final boolean d() {
        return a().equals(clxt.GOOGLE_TOS_CONSENTED);
    }
}
