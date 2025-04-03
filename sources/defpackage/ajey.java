package defpackage;

import android.view.View;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajey implements fbba {
    public static PenpalExpressSignInTopView a(View view) {
        if (!(view instanceof PenpalExpressSignInTopView)) {
            throw new IllegalStateException(a.I(view, ajev.class, "Attempt to inject a View wrapper of type "));
        }
        PenpalExpressSignInTopView penpalExpressSignInTopView = (PenpalExpressSignInTopView) view;
        penpalExpressSignInTopView.getClass();
        return penpalExpressSignInTopView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
