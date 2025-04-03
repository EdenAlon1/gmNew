package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqzo implements aqux {
    public final ffbr a;
    public final apho b;
    public final aphl c;
    private final ffsk d;
    private final crji e;
    private final aolr f;
    private final SelfIdentityId g;
    private final String h = "Satellite";
    private final String i = "Satellite";
    private final String j = "Satellite";
    private final String k = "Satellite";
    private final aqge l = new aqzm();
    private final aqge m = new aqzk();
    private final aqyt n;
    private final elfl o;
    private final aqvx p;
    private final aqgf q;

    public aqzo(ffsk ffskVar, crji crjiVar, aolr aolrVar, ffbr ffbrVar, aphl aphlVar, apho aphoVar, SelfIdentityId selfIdentityId) {
        this.d = ffskVar;
        this.e = crjiVar;
        this.f = aolrVar;
        this.a = ffbrVar;
        this.c = aphlVar;
        this.b = aphoVar;
        this.g = selfIdentityId;
        aqzn aqznVar = new aqzn();
        this.n = aqznVar;
        elfl e = elfo.e(aqznVar);
        e.getClass();
        this.o = e;
        this.p = new aqzi();
        this.q = new aqgf(aqvj.e);
    }

    @Override // defpackage.aqux
    public final int a() {
        return 0;
    }

    @Override // defpackage.aqux
    public final int b() {
        return -1;
    }

    @Override // defpackage.aqux
    public final Uri c() {
        Uri f = this.e.f(null, this.i, this.f.f(), null);
        f.getClass();
        return f;
    }

    @Override // defpackage.aqux
    public final /* synthetic */ aqge d() {
        return this.q;
    }

    @Override // defpackage.aqux
    public final aqge e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aqzo) {
            return ffkj.e(this.g, ((aqzo) obj).g);
        }
        return false;
    }

    @Override // defpackage.aqux
    public final aqge f() {
        return this.m;
    }

    @Override // defpackage.aqux
    public final SelfIdentityId g() {
        return this.g;
    }

    @Override // defpackage.aqux
    public final aqvx h() {
        return this.p;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.aqux
    public final aqyt i() {
        return this.n;
    }

    @Override // defpackage.aqux
    public final elfl j() {
        return this.o;
    }

    @Override // defpackage.aqux
    public final elfl k(boolean z, boolean z2) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new aqzj(this, null));
        return c;
    }

    @Override // defpackage.aqux
    public final elfl l(alyx alyxVar) {
        elfl c;
        alyxVar.getClass();
        if (alyxVar == alyx.SATELLITE) {
            c = axol.c(this.d, ffhe.a, ffsm.a, new aqzl(this, null));
            return c;
        }
        elfl e = elfo.e(false);
        e.getClass();
        return e;
    }

    @Override // defpackage.aqux
    public final Optional m() {
        return Optional.of(this.f.f());
    }

    @Override // defpackage.aqux
    public final String n() {
        return this.j;
    }

    @Override // defpackage.aqux
    public final String o() {
        return this.h;
    }

    @Override // defpackage.aqux
    public final String p() {
        return this.i;
    }

    @Override // defpackage.aqux
    public final String q() {
        return this.k;
    }

    @Override // defpackage.aqux
    public final /* bridge */ /* synthetic */ String r() {
        return null;
    }

    @Override // defpackage.aqux
    public final boolean s() {
        return false;
    }

    @Override // defpackage.aqux
    public final boolean t() {
        return true;
    }

    @Override // defpackage.aqux
    public final boolean u() {
        return false;
    }

    @Override // defpackage.aqux
    public final boolean v() {
        return false;
    }

    @Override // defpackage.aqux
    public final boolean w(SelfIdentityId selfIdentityId) {
        return ffkj.e(((SelfIdentityIdImpl) this.g).a, selfIdentityId.b());
    }

    @Override // defpackage.aqux
    public final elfl x(int i, Optional optional) {
        if (i == 0) {
            throw null;
        }
        optional.getClass();
        elfl e = elfo.e(Optional.empty());
        e.getClass();
        return e;
    }
}
