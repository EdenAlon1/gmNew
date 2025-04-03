package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czrk extends cztk {
    private static final cskc a = cskc.g("Bugle", "RbmSuggestionAcceptor");
    private final czui b;
    private final ddzb c;
    private final akzt d;
    private final Optional e;
    private final crjp f;

    public czrk(czui czuiVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ddzb ddzbVar, akzt akztVar, Optional optional, crjp crjpVar, wgi wgiVar) {
        super(wgiVar, ffbrVar, ffbrVar2, ffbrVar3);
        this.b = czuiVar;
        this.c = ddzbVar;
        this.d = akztVar;
        this.e = optional;
        this.f = crjpVar;
    }

    private final void d(RbmSuggestionData rbmSuggestionData) {
        Intent b = rbmSuggestionData.b.canUseFallbackUrl() ? this.b.b(rbmSuggestionData) : null;
        if (b != null) {
            if (this.f.e(b)) {
                this.d.e("Bugle.Rbm.Suggestions.FallbackUrl.FallbackOccurred", czrm.a(rbmSuggestionData.b.getSuggestionType()));
                this.n.c(rbmSuggestionData);
                return;
            } else {
                csjb b2 = a.b();
                b2.I("No app on device seems able to handle fallback URL web action.");
                b2.M("suggestion", rbmSuggestionData.toString());
                b2.r();
            }
        }
        csjb e = a.e();
        e.I("No app on device seems able to handle this action.");
        e.M("suggestion", rbmSuggestionData.toString());
        e.r();
        this.c.k(R.string.business_action_failed_to_launch);
    }

    public final void a(SuggestionData suggestionData) {
        if (!(suggestionData instanceof RbmSuggestionData)) {
            a.n("Non RBM suggestion passed to RbmSuggestionAcceptor");
            throw new IllegalStateException("Non RBM suggestion passed to RbmSuggestionAcceptor");
        }
        RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
        int suggestionType = rbmSuggestionData.b.getSuggestionType();
        if (suggestionType == 0) {
            super.b(suggestionData);
            ((vva) this.n).a.X(true);
            return;
        }
        if (suggestionType == 5) {
            if (this.e.isEmpty()) {
                d(rbmSuggestionData);
                return;
            } else {
                c();
                this.n.c(suggestionData);
                return;
            }
        }
        int suggestionType2 = rbmSuggestionData.b.getSuggestionType();
        Intent a2 = suggestionType2 != 1 ? suggestionType2 != 2 ? suggestionType2 != 3 ? suggestionType2 != 4 ? null : this.b.a(rbmSuggestionData) : this.b.c(rbmSuggestionData) : this.b.d(rbmSuggestionData) : this.b.e(rbmSuggestionData);
        if (a2 == null || !this.f.e(a2)) {
            d(rbmSuggestionData);
        } else {
            this.n.c(rbmSuggestionData);
        }
    }
}
