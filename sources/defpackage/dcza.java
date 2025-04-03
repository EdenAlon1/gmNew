package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcza implements fbba {
    public static RcsWelcomeMessageView a(View view) {
        if (!(view instanceof RcsWelcomeMessageView)) {
            throw new IllegalStateException(a.I(view, dcyx.class, "Attempt to inject a View wrapper of type "));
        }
        RcsWelcomeMessageView rcsWelcomeMessageView = (RcsWelcomeMessageView) view;
        rcsWelcomeMessageView.getClass();
        return rcsWelcomeMessageView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
