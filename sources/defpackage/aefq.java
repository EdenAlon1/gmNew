package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.banner.HomeBannerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aefq implements fbba {
    public static HomeBannerView a(View view) {
        if (!(view instanceof HomeBannerView)) {
            throw new IllegalStateException(a.I(view, aefn.class, "Attempt to inject a View wrapper of type "));
        }
        HomeBannerView homeBannerView = (HomeBannerView) view;
        homeBannerView.getClass();
        return homeBannerView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
