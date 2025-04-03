package defpackage;

import android.view.View;
import com.google.android.apps.messaging.welcome.v1.expresssignin.WelcomeExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demo implements fbba {
    public static WelcomeExpressSignInTopView a(View view) {
        if (!(view instanceof WelcomeExpressSignInTopView)) {
            throw new IllegalStateException(a.I(view, deml.class, "Attempt to inject a View wrapper of type "));
        }
        WelcomeExpressSignInTopView welcomeExpressSignInTopView = (WelcomeExpressSignInTopView) view;
        welcomeExpressSignInTopView.getClass();
        return welcomeExpressSignInTopView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
