package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.gaia.promo.GppExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvj implements fbba {
    public static GppExpressSignInTopView a(View view) {
        if (!(view instanceof GppExpressSignInTopView)) {
            throw new IllegalStateException(a.I(view, dbvg.class, "Attempt to inject a View wrapper of type "));
        }
        GppExpressSignInTopView gppExpressSignInTopView = (GppExpressSignInTopView) view;
        gppExpressSignInTopView.getClass();
        return gppExpressSignInTopView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
