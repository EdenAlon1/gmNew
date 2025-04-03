package defpackage;

import defpackage.ekju;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjt implements lms {
    final /* synthetic */ ekju a;
    final /* synthetic */ akla b;

    public ekjt(ekju ekjuVar, akla aklaVar) {
        this.b = aklaVar;
        this.a = ekjuVar;
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml a(Class cls) {
        return lmr.b();
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        lmy lmyVar = (lmy) lnxVar.a(lmc.b);
        boolean z = lmyVar instanceof ea;
        ekju ekjuVar = this.a;
        if (z) {
            ea eaVar = ekjuVar.a;
            emxf.r(lmyVar == eaVar, "Cannot use AccountViewModelFactory on a different fragment than the fragment the factory is from. Found: %s, Factory fragment: %s", lmyVar, eaVar);
        } else {
            ea eaVar2 = ekjuVar.a;
            if (eaVar2.Q == null || lmyVar != eaVar2.Q()) {
                throw new IllegalStateException("AccountViewModels can only use account fragments and account-based Navigation back stack entries as the owner. Found the owner: ".concat(String.valueOf(String.valueOf(lmyVar))));
            }
        }
        llv a = lmc.a(lnxVar);
        final fazv fazvVar = new fazv();
        akla aklaVar = this.b;
        aklaVar.d = a;
        aklaVar.e = fazvVar;
        fbbe.a(aklaVar.d, llv.class);
        fbbe.a(aklaVar.e, fazj.class);
        ffbr ffbrVar = (ffbr) ((ekju.a) fazh.a(new aklq(aklaVar.a, aklaVar.b, aklaVar.c, aklaVar.d, aklaVar.e), ekju.a.class)).be().get(cls.getName());
        if (ffbrVar == null) {
            throw new IllegalStateException(a.N(cls, "Expected the @AccountViewModel-annotated class '", "' to be available in the multi-binding of @AccountViewModelMap but none was found."));
        }
        lml lmlVar = (lml) ffbrVar.b();
        lmlVar.fA(new AutoCloseable() { // from class: ekjs
            @Override // java.lang.AutoCloseable
            public final void close() {
                fazv.this.b();
            }
        });
        return lmlVar;
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
