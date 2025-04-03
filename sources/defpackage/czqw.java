package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czqw implements cztz {
    final /* synthetic */ czic a;
    final /* synthetic */ int b;

    public czqw(czic czicVar, int i) {
        this.a = czicVar;
        this.b = i;
    }

    @Override // defpackage.cztz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cztz
    public final ConversationIdType b() {
        return ((uuy) this.a).ap;
    }

    @Override // defpackage.cztz
    public final void c(SuggestionData suggestionData) {
        this.a.i(suggestionData);
    }

    @Override // defpackage.cztz
    public final void d() {
        View view;
        uuy uuyVar = (uuy) this.a;
        if (uuyVar.az == null || uuyVar.aA == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= uuyVar.az.getChildCount()) {
                view = null;
                break;
            }
            view = uuyVar.az.getChildAt(i);
            if (view instanceof ConversationMessageView) {
                break;
            } else {
                i++;
            }
        }
        if (view != null) {
            view.sendAccessibilityEvent(8);
            view.sendAccessibilityEvent(32);
        }
    }

    @Override // defpackage.cztz
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.cztz
    public final /* synthetic */ boolean f() {
        return true;
    }
}
