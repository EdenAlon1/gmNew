package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anwu implements aoak {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/RbmSuggestionRepositoryImpl");
    private final alxs b;

    public anwu(alxs alxsVar) {
        this.b = alxsVar;
    }

    @Override // defpackage.aoak
    public final aqge a() {
        throw new UnsupportedOperationException("Screen effects not supported in RBM conversations");
    }

    @Override // defpackage.aoak
    public final aqge b() {
        throw new UnsupportedOperationException("Screen effects not supported in RBM conversations");
    }

    @Override // defpackage.aoak
    public final aqge c() {
        throw new UnsupportedOperationException("SuggestionData suggestions not supported when SuggestionV2 is enabled");
    }

    @Override // defpackage.aoak
    public final aqge d() {
        return this.b.g();
    }

    @Override // defpackage.aoak
    public final elfl e(anzh anzhVar) {
        throw new UnsupportedOperationException("Not supported when SuggestionV2 is enabled");
    }

    @Override // defpackage.aoak
    public final elfl f(String str, appw appwVar, eooi eooiVar, boolean z, boolean z2) {
        if (appwVar == null || eooiVar == null) {
            ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/RbmSuggestionRepositoryImpl", "acceptSuggestion", 76, "RbmSuggestionRepositoryImpl.kt")).q("Accept suggestion called without text or message source. Returning early.");
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        if (!z2) {
            ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/RbmSuggestionRepositoryImpl", "acceptSuggestion", 81, "RbmSuggestionRepositoryImpl.kt")).q("Action associated with suggestion did not succeed. Returning early.");
            elfl e2 = elfo.e(null);
            e2.getClass();
            return e2;
        }
        alxs alxsVar = this.b;
        alyx alyxVar = alyx.BEST_AVAILABLE;
        int i = engw.d;
        elfl m = alxsVar.m(alyxVar, appwVar, enou.a, null, null, null, eooiVar, null, null);
        m.getClass();
        return m;
    }

    @Override // defpackage.aoak
    public final elfl g(aoax aoaxVar) {
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
