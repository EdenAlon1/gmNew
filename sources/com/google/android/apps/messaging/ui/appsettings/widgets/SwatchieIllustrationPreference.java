package com.google.android.apps.messaging.ui.appsettings.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import defpackage.crjx;
import defpackage.ctba;
import defpackage.cwoj;
import defpackage.egxp;
import defpackage.egxq;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ffkj;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SwatchieIllustrationPreference extends Preference {
    private static final enru c = enru.c("com/google/android/apps/messaging/ui/appsettings/widgets/SwatchieIllustrationPreference");
    public LottieAnimationView a;
    public egxq b;

    /* compiled from: PG */
    public interface a {
        crjx a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwatchieIllustrationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.A = R.layout.swatchie_illustration_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        ooiVar.getClass();
        super.a(ooiVar);
        View C = ooiVar.C(R.id.lottie_view);
        C.getClass();
        this.a = (LottieAnimationView) C;
        int i = this.j.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.j.getResources().getDisplayMetrics().heightPixels;
        View C2 = ooiVar.C(R.id.illustration_frame);
        C2.getClass();
        FrameLayout frameLayout = (FrameLayout) C2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = Math.min(i, i2);
        frameLayout.setLayoutParams(layoutParams);
        Context context = this.j;
        context.getClass();
        int a2 = cwoj.a(context);
        View C3 = ooiVar.C(R.id.background_view);
        C3.getClass();
        ImageView imageView = (ImageView) C3;
        imageView.setColorFilter(a2);
        boolean g = ((a) ctba.a(a.class)).a().g();
        egxq egxqVar = this.b;
        if (egxqVar != null) {
            egxp.e(egxqVar, k(), g);
        } else {
            ensk e = c.e();
            e.Y(ente.a, "Bugle");
            ((enrr) e.h("com/google/android/apps/messaging/ui/appsettings/widgets/SwatchieIllustrationPreference", "onBindViewHolder", 61, "SwatchieIllustrationPreference.kt")).q("No illustration set for SwatchieIllustrationPreference");
        }
        LottieAnimationView k = k();
        Resources resources = imageView.getResources();
        resources.getClass();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.settings_illustration_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.settings_illustration_height);
        imageView.setMaxHeight(dimensionPixelSize2);
        k.setMaxHeight(dimensionPixelSize2);
        float f = dimensionPixelSize2;
        k.setMaxWidth((int) (f * (dimensionPixelSize / f)));
    }

    public final LottieAnimationView k() {
        LottieAnimationView lottieAnimationView = this.a;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        ffkj.c("illustrationView");
        return null;
    }
}
