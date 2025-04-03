package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcye implements ejxi {
    final /* synthetic */ dcyg a;

    public dcye(dcyg dcygVar) {
        this.a = dcygVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        ejui ejuiVar = dcyg.b;
        ejuiVar.getClass();
        return ejuiVar;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        elfl c;
        if (djai.z() && djai.ac()) {
            elfl e = elfo.e(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
            e.getClass();
            return e;
        }
        if (!djai.G()) {
            dcyg.a.n().q("Not returning RcsDefaultOnConsentData since the flag is disabled");
            elfl e2 = elfo.e(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
            e2.getClass();
            return e2;
        }
        if (dimo.b()) {
            dcyg dcygVar = this.a;
            c = axol.c(dcygVar.c, ffhe.a, ffsm.a, new dcyd(dcygVar, null));
            return c;
        }
        dcyg.a.n().q("Not returning RcsDefaultOnConsentData since ToS flag is not allowed");
        elfl e3 = elfo.e(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
        e3.getClass();
        return e3;
    }
}
