package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqzh implements aqvh {
    public final ffsk a;
    public final azvu b;
    public final aqzp c;
    private final aqge d;

    public aqzh(ffsk ffskVar, azvu azvuVar, aqzp aqzpVar, aqvt aqvtVar) {
        ffskVar.getClass();
        azvuVar.getClass();
        aqvtVar.getClass();
        this.a = ffskVar;
        this.b = azvuVar;
        this.c = aqzpVar;
        this.d = aqvtVar.a();
    }

    @Override // defpackage.aqvh
    public final aqge a() {
        return new aqzd(this);
    }

    @Override // defpackage.aqvh
    public final aqge b() {
        return this.d;
    }

    @Override // defpackage.aqvh
    public final aqge c() {
        return new aqzd(this);
    }

    @Override // defpackage.aqvh
    public final elfl d(SelfIdentityId selfIdentityId) {
        elfl c;
        selfIdentityId.getClass();
        ekzz f = eleg.f("DefaultSatelliteSelfIdentityRepository#getSelfIdentityById");
        try {
            c = axol.c(this.a, ffhe.a, ffsm.a, new aqzg(this, selfIdentityId, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.aqvh
    public final elfl e() {
        elfl d = elfo.d(new IllegalStateException("SatelliteSelfIdentity can't start conversations"));
        d.getClass();
        return d;
    }

    @Override // defpackage.aqvh
    public final elfl f(SelfIdentityId selfIdentityId, aoku aokuVar) {
        return elfo.e(null);
    }

    @Override // defpackage.aqvh
    public final elfl g(Optional optional) {
        elfl e = elfo.e(true);
        e.getClass();
        return e;
    }
}
