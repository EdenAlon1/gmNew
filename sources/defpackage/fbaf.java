package defpackage;

import defpackage.fbag;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbaf implements lms {
    final /* synthetic */ ea a;

    public fbaf(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml a(Class cls) {
        return lmr.b();
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        ea eaVar = this.a;
        if (!(eaVar.X() instanceof fbat)) {
            throw new IllegalStateException("FragmentRetainedComponent cannot be instantiated without a host");
        }
        ((fbag.a) fazh.a(((fazx) ((fbat) eaVar.X()).aW()).b(), fbag.a.class)).R();
        return new fbah(new akgv());
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
