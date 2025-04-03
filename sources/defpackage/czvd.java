package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czvd implements fbba {
    public static SuggestionShortcutView a(View view) {
        if (!(view instanceof SuggestionShortcutView)) {
            throw new IllegalStateException(a.I(view, czva.class, "Attempt to inject a View wrapper of type "));
        }
        SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) view;
        suggestionShortcutView.getClass();
        return suggestionShortcutView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
