package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajev {
    public final ffbr a;
    public final ffbr b;
    private final PenpalExpressSignInTopView c;

    public ajev(PenpalExpressSignInTopView penpalExpressSignInTopView, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.c = penpalExpressSignInTopView;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        Context context = penpalExpressSignInTopView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.penpal_express_sign_in);
        composeView.a(new hpw(-538407875, true, new ajeu(ffbrVar4, this)));
        ((ajfs) ffbrVar3.b()).c();
        penpalExpressSignInTopView.addView(composeView);
    }
}
