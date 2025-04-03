package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwh extends czwk {
    private final Context e;

    public czwh(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.czwk
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_gm_ic_my_location_black_24, i, true);
    }

    @Override // defpackage.czwk
    public final String b() {
        return czwk.g(this.e.getString(R.string.conversation_suggestion_share_location_action), c());
    }
}
