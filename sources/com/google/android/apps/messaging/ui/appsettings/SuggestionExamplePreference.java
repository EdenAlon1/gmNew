package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import defpackage.cxhs;
import defpackage.enou;
import defpackage.ooi;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SuggestionExamplePreference extends Preference {
    public List a;
    private LinearLayout b;

    public SuggestionExamplePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        LinearLayout linearLayout = (LinearLayout) ooiVar.C(R.id.suggestion_list_container);
        this.b = linearLayout;
        linearLayout.setGravity(8388611);
        ((ConversationSuggestionsView) ooiVar.C(R.id.conversation_suggestions_view)).c(this.a, new cxhs());
        if (((enou) this.a).c > 1) {
            TextView textView = (TextView) ooiVar.C(R.id.example_suggestion_title);
            textView.setText(textView.getResources().getString(R.string.example_suggestions_title));
        }
    }
}
