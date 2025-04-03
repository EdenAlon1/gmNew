package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsd implements npb {
    final /* synthetic */ nsi a;
    private final npb b;

    public nsd(nsi nsiVar, npb npbVar) {
        this.a = nsiVar;
        this.b = npbVar;
    }

    @Override // defpackage.npb
    public final npd a(nql nqlVar, Looper looper, npc npcVar, npa npaVar) {
        if (nqlVar.b()) {
            return new nsf(this.a, nqlVar.e);
        }
        npb npbVar = this.b;
        lqw lqwVar = nqlVar.a;
        npr nprVar = (npr) npbVar;
        boolean f = ntl.f(nprVar.a, lqwVar);
        boolean z = f && nqlVar.e == -9223372036854775807L;
        if (f && !z) {
            lqt lqtVar = lqwVar.b;
            lti.f(lqtVar);
            if (lqtVar.i == -9223372036854775807L) {
                luj.f("DefaultAssetLoaderFact", "The imageDurationMs field must be set on image MediaItems.");
            }
            if (nprVar.e == null) {
                nprVar.e = new nrq(nprVar.a, nprVar.d);
            }
            nrq nrqVar = (nrq) nprVar.e;
            return new nrr(nrqVar.a, nqlVar, npcVar, nrqVar.b, npaVar.b);
        }
        if (nprVar.f == null) {
            nprVar.f = new nqy(nprVar.a, nprVar.b, nprVar.c);
        }
        npb npbVar2 = nprVar.f;
        ncj ncjVar = new ncj();
        boolean z2 = nqlVar.d;
        nqy nqyVar = (nqy) npbVar2;
        msy msyVar = new msy(nqyVar.a, ncjVar);
        Context context = nqyVar.a;
        mwr mwrVar = new mwr();
        mwrVar.s = true;
        mwrVar.z = false;
        return new nrb(nqyVar.a, nqlVar, msyVar, nqyVar.b, npaVar.a, looper, npcVar, nqyVar.c, new nqx(new mws(mwrVar)));
    }
}
