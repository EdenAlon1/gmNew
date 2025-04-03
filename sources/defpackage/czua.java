package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czua implements cpfo {
    private static final cskc a = cskc.g("Bugle", "RbmSuggestionRule");
    private final crjp b;
    private final czui c;
    private final Optional d;
    private final akzt e;

    public czua(crjp crjpVar, czui czuiVar, Optional optional, akzt akztVar) {
        crjpVar.getClass();
        czuiVar.getClass();
        optional.getClass();
        akztVar.getClass();
        this.b = crjpVar;
        this.c = czuiVar;
        this.d = optional;
        this.e = akztVar;
    }

    private final boolean c(boolean z, ConversationSuggestion conversationSuggestion, String str) {
        boolean z2 = true;
        if (!z) {
            if (conversationSuggestion.hasFallbackUrl()) {
                this.e.e("Bugle.Rbm.Suggestions.FallbackUrl.PotentialFallback", czrm.a(conversationSuggestion.getSuggestionType()));
                csjb c = a.c();
                c.I(str);
                c.I("intent not supported on this device, but fallback URL exists");
                c.M("suggestion", conversationSuggestion.toString());
                c.r();
            } else {
                z2 = false;
            }
            if (!z2) {
                this.e.e("Bugle.Rbm.Suggestions.FallbackUrl.NoFallbackUrlButActionUnsupported", czrm.a(conversationSuggestion.getSuggestionType()));
                csjb e = a.e();
                e.I(str);
                e.I("intent not supported on this device");
                e.M("suggestion", conversationSuggestion.toString());
                e.r();
            }
        }
        return z2;
    }

    @Override // defpackage.cpfo
    public final boolean a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return suggestionData instanceof RbmSuggestionData;
    }

    @Override // defpackage.cpfo
    public final Object b(SuggestionData suggestionData, cpff cpffVar, int i, ffgu ffguVar) {
        boolean z = false;
        if (!(suggestionData instanceof RbmSuggestionData)) {
            return false;
        }
        RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        int suggestionType = conversationSuggestion.getSuggestionType();
        if (suggestionType == 0) {
            z = true;
        } else if (suggestionType == 1) {
            z = c(this.b.d(this.c.e(rbmSuggestionData)), conversationSuggestion, "Web");
        } else if (suggestionType == 2) {
            z = c(this.b.d(this.c.d(rbmSuggestionData)), conversationSuggestion, "Phone");
        } else if (suggestionType == 3) {
            z = c(this.b.d(this.c.c(rbmSuggestionData)), conversationSuggestion, "Map");
        } else if (suggestionType == 4) {
            z = c(this.b.d(this.c.a(rbmSuggestionData)), conversationSuggestion, "Calendar");
        } else if (suggestionType == 5) {
            z = c(this.d.isPresent(), conversationSuggestion, "Location share");
        }
        return Boolean.valueOf(z);
    }
}
