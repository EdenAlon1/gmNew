package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwd extends czwk {
    private final Context e;
    private final SmartSuggestionData f;

    public czwd(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.czwk
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_ic_content_copy_grey600_24, i, true);
    }

    @Override // defpackage.czwk
    public final String c() {
        return this.e.getString(R.string.action_copy_otp, crnx.f(this.f.r()));
    }
}
