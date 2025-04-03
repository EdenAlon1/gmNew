package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobc implements aoak {
    public final aqge a;
    private final aqge b;

    public aobc(aoaz aoazVar, aobb aobbVar, EmergencySosConversationId emergencySosConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3) {
        anyg anygVar = (anyg) aoazVar.a.b();
        anygVar.getClass();
        aobe aobeVar = (aobe) aoazVar.b.b();
        aobeVar.getClass();
        this.a = new aoay(anygVar, aobeVar, emergencySosConversationId, aqgeVar, aqgeVar2, aqgeVar3);
        anyz anyzVar = (anyz) aobbVar.a.b();
        anyzVar.getClass();
        aobe aobeVar2 = (aobe) aobbVar.b.b();
        aobeVar2.getClass();
        this.b = new aoba(anyzVar, aobeVar2, emergencySosConversationId, aqgeVar, aqgeVar2, aqgeVar3);
    }

    @Override // defpackage.aoak
    public final aqge a() {
        throw new UnsupportedOperationException("Screen effect suggestions are not supported in Emergency SOS.");
    }

    @Override // defpackage.aoak
    public final aqge b() {
        throw new UnsupportedOperationException("Screen effect suggestions are not supported in Emergency SOS.");
    }

    @Override // defpackage.aoak
    public final aqge c() {
        return this.a;
    }

    @Override // defpackage.aoak
    public final aqge d() {
        return this.b;
    }

    @Override // defpackage.aoak
    public final elfl e(anzh anzhVar) {
        throw new UnsupportedOperationException("acceptSuggestion() is not supported in Emergency SOS.");
    }

    @Override // defpackage.aoak
    public final elfl f(String str, appw appwVar, eooi eooiVar, boolean z, boolean z2) {
        throw new UnsupportedOperationException("acceptSuggestion() is not supported in Emergency SOS.");
    }

    @Override // defpackage.aoak
    public final elfl g(aoax aoaxVar) {
        throw new UnsupportedOperationException("onSuggestionResult() is not supported in Emergency SOS.");
    }
}
