package defpackage;

import android.app.Activity;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.v1.expresssignin.WelcomeExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deml {
    public final Activity a;
    private final WelcomeExpressSignInTopView b;

    public deml(WelcomeExpressSignInTopView welcomeExpressSignInTopView, Activity activity, ffbr ffbrVar) {
        activity.getClass();
        ffbrVar.getClass();
        this.b = welcomeExpressSignInTopView;
        this.a = activity;
        ComposeView composeView = (ComposeView) welcomeExpressSignInTopView.findViewById(R.id.compose_view);
        composeView.getClass();
        lna.b(composeView, lna.a(welcomeExpressSignInTopView));
        composeView.a(new hpw(-1172387782, true, new demk(ffbrVar, this)));
    }
}
