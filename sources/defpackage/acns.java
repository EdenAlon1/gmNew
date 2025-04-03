package defpackage;

import android.view.View;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acns implements fbba {
    public static GpWebTabletExpressSignInTopView a(View view) {
        if (!(view instanceof GpWebTabletExpressSignInTopView)) {
            throw new IllegalStateException(a.I(view, acnp.class, "Attempt to inject a View wrapper of type "));
        }
        GpWebTabletExpressSignInTopView gpWebTabletExpressSignInTopView = (GpWebTabletExpressSignInTopView) view;
        gpWebTabletExpressSignInTopView.getClass();
        return gpWebTabletExpressSignInTopView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
