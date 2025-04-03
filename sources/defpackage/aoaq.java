package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoaq implements aoak {
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/SuggestionRepositoryImpl");
    public final ffhd a;
    public final ffbr b;
    public final ffbr c;
    public final BugleConversationId d;
    private final ffsk f;
    private final alxs g;
    private final aqge h;
    private final aqge i;
    private aqge j;
    private aqge k;
    private aqge l;
    private final aqge m;

    public aoaq(askf askfVar, anzv anzvVar, aoaj aoajVar, ffhd ffhdVar, anyg anygVar, anyz anyzVar, anxe anxeVar, anxn anxnVar, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3, alxs alxsVar) {
        aqge aqgeVar4;
        aqge aqgeVar5;
        aqge aqgeVar6;
        aqge a;
        aqge a2;
        BugleConversationId bugleConversationId2 = bugleConversationId;
        this.a = ffhdVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffskVar;
        this.d = bugleConversationId2;
        this.g = alxsVar;
        if (askfVar.a()) {
            if (((Boolean) ((cfup) ctjd.by.get()).e()).booleanValue()) {
                ffsk ffskVar2 = (ffsk) aoajVar.a.b();
                ffskVar2.getClass();
                ffsk ffskVar3 = (ffsk) aoajVar.b.b();
                ffskVar3.getClass();
                ctbk ctbkVar = (ctbk) aoajVar.c.b();
                ctbkVar.getClass();
                anyz anyzVar2 = (anyz) aoajVar.d.b();
                anyzVar2.getClass();
                anws anwsVar = (anws) aoajVar.e.b();
                anwsVar.getClass();
                anvx anvxVar = (anvx) aoajVar.f.b();
                anvxVar.getClass();
                this.l = new aoai(ffskVar2, ffskVar3, ctbkVar, anyzVar2, anwsVar, anvxVar, aqgeVar3, aqgeVar, aqgeVar2, bugleConversationId2);
            }
            ffsk ffskVar4 = (ffsk) anzvVar.a.b();
            ffskVar4.getClass();
            ffsk ffskVar5 = (ffsk) anzvVar.b.b();
            ffskVar5.getClass();
            ctbk ctbkVar2 = (ctbk) anzvVar.c.b();
            ctbkVar2.getClass();
            anyg anygVar2 = (anyg) anzvVar.d.b();
            anygVar2.getClass();
            anwi anwiVar = (anwi) anzvVar.e.b();
            anwiVar.getClass();
            anvm anvmVar = (anvm) anzvVar.f.b();
            anvmVar.getClass();
            bugleConversationId2 = bugleConversationId;
            aqgeVar4 = aqgeVar;
            aqgeVar5 = aqgeVar2;
            aqgeVar6 = aqgeVar3;
            this.k = new anzu(ffskVar4, ffskVar5, ctbkVar2, anygVar2, anwiVar, anvmVar, aqgeVar6, aqgeVar4, aqgeVar5, bugleConversationId2);
        } else {
            aqgeVar4 = aqgeVar;
            aqgeVar5 = aqgeVar2;
            aqgeVar6 = aqgeVar3;
            a = anygVar.a(null, bugleConversationId2, aqgeVar4, aqgeVar5, aqgeVar6);
            this.j = a;
        }
        a2 = anyzVar.a(bugleConversationId2, aqgeVar4, aqgeVar5, aqgeVar6, null);
        this.m = a2;
        ffsk ffskVar6 = (ffsk) anxeVar.a.b();
        ffskVar6.getClass();
        ctbk ctbkVar3 = (ctbk) anxeVar.b.b();
        ctbkVar3.getClass();
        becj becjVar = (becj) anxeVar.c.b();
        becjVar.getClass();
        this.h = new anxd(ffskVar6, ctbkVar3, becjVar, anxeVar.d, bugleConversationId2);
        ffsk ffskVar7 = (ffsk) anxnVar.a.b();
        ffskVar7.getClass();
        ctbk ctbkVar4 = (ctbk) anxnVar.b.b();
        ctbkVar4.getClass();
        becj becjVar2 = (becj) anxnVar.c.b();
        becjVar2.getClass();
        this.i = new anxm(ffskVar7, ctbkVar4, becjVar2, anxnVar.d, bugleConversationId);
    }

    @Override // defpackage.aoak
    public final aqge a() {
        return this.h;
    }

    @Override // defpackage.aoak
    public final aqge b() {
        return this.i;
    }

    @Override // defpackage.aoak
    public final aqge c() {
        aqge aqgeVar = this.k;
        if (aqgeVar != null) {
            return aqgeVar;
        }
        aqge aqgeVar2 = this.j;
        aqgeVar2.getClass();
        return aqgeVar2;
    }

    @Override // defpackage.aoak
    public final aqge d() {
        aqge aqgeVar = this.l;
        return aqgeVar == null ? this.m : aqgeVar;
    }

    @Override // defpackage.aoak
    public final elfl e(anzh anzhVar) {
        alyx alyxVar = alyx.BEST_AVAILABLE;
        int i = engw.d;
        engw engwVar = enou.a;
        eooi eooiVar = eooi.RBM_SUGGESTION_REPLY;
        elfl m = this.g.m(alyxVar, ((RbmSuggestionData) anzhVar).d, engwVar, null, null, null, eooiVar, null, null);
        m.getClass();
        return m;
    }

    @Override // defpackage.aoak
    public final elfl f(String str, appw appwVar, eooi eooiVar, boolean z, boolean z2) {
        axol.m(this.f, new aoao(str, this, z, null));
        if (appwVar == null || eooiVar == null) {
            ((enrr) e.j().h("com/google/android/apps/messaging/shared/api/messaging/conversation/suggestion/SuggestionRepositoryImpl", "acceptSuggestion", 209, "SuggestionRepositoryImpl.kt")).q("Accept suggestion without text or source. Returning without sending message.");
            elfl e2 = elfo.e(null);
            e2.getClass();
            return e2;
        }
        alxs alxsVar = this.g;
        alyx alyxVar = alyx.BEST_AVAILABLE;
        int i = engw.d;
        elfl m = alxsVar.m(alyxVar, appwVar, enou.a, null, null, null, eooiVar, null, null);
        m.getClass();
        return m;
    }

    @Override // defpackage.aoak
    public final elfl g(aoax aoaxVar) {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new aoap(aoaxVar, this, null));
        return c;
    }
}
