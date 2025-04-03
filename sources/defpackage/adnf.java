package defpackage;

import android.view.View;
import com.google.android.apps.messaging.gaia.expresssignin.HqmsExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adnf implements fbba {
    public static HqmsExpressSignInTopView a(View view) {
        if (!(view instanceof HqmsExpressSignInTopView)) {
            throw new IllegalStateException(a.I(view, adnc.class, "Attempt to inject a View wrapper of type "));
        }
        HqmsExpressSignInTopView hqmsExpressSignInTopView = (HqmsExpressSignInTopView) view;
        hqmsExpressSignInTopView.getClass();
        return hqmsExpressSignInTopView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
