package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwc implements fbba {
    public static ComposeMessageView a(View view) {
        if (!(view instanceof ComposeMessageView)) {
            throw new IllegalStateException(a.I(view, cxtc.class, "Attempt to inject a View wrapper of type "));
        }
        ComposeMessageView composeMessageView = (ComposeMessageView) view;
        composeMessageView.getClass();
        return composeMessageView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
