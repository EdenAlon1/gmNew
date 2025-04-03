package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwj extends czwk {
    private final Context e;

    public czwj(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.czwk
    public final String b() {
        return czwk.g(this.e.getString(R.string.conversation_suggestion_send_reply), c());
    }

    @Override // defpackage.czwk
    public final String c() {
        String c = super.c();
        return !TextUtils.isEmpty(c) ? c : this.b.d();
    }
}
