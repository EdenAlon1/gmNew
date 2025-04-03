package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkih implements dkif {
    private final dkii a;
    private final ctvb b;
    private final dkib c;
    private final eehz d;
    private final dkhx e;
    private final dkid f;
    private final dkiq g;
    private final dkhz h;
    private final diul i;

    public dkih(diul diulVar, dkii dkiiVar, ctvb ctvbVar, dkib dkibVar, eehz eehzVar, dkhx dkhxVar, dkid dkidVar, dkiq dkiqVar, dkhz dkhzVar) {
        this.i = diulVar;
        this.a = dkiiVar;
        this.b = ctvbVar;
        this.c = dkibVar;
        this.d = eehzVar;
        this.e = dkhxVar;
        this.f = dkidVar;
        this.g = dkiqVar;
        this.h = dkhzVar;
    }

    @Override // defpackage.dkif
    public final dkie a(djjr djjrVar, dkhc dkhcVar, dkur dkurVar, djtp djtpVar, dkls dklsVar, Context context) {
        if (dizg.Q() || !djak.q() || djtpVar.h() == null || !djtpVar.h().mPresenceDiscovery) {
            dkty.k("Using OPTIONS Capabilities Discovery.", new Object[0]);
            return new dkil(djjrVar, dkhcVar, this.a, this.d, this.b, this.e, this.c, this.f, dkurVar);
        }
        dkty.k("Using Capabilities Discovery over Presence.", new Object[0]);
        return new dkip(djjrVar, dkhcVar, this.a, this.i, dklsVar, context, this.b, this.c, dkurVar, this.g, this.h);
    }
}
