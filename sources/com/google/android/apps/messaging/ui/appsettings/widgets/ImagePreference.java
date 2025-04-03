package com.google.android.apps.messaging.ui.appsettings.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.ffkj;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImagePreference extends Preference {
    public ImageView a;
    public Drawable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.A = R.layout.image_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        ooiVar.getClass();
        super.a(ooiVar);
        View C = ooiVar.C(R.id.image_view);
        C.getClass();
        this.a = (ImageView) C;
        int i = this.j.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.j.getResources().getDisplayMetrics().heightPixels;
        View C2 = ooiVar.C(R.id.illustration_frame);
        C2.getClass();
        FrameLayout frameLayout = (FrameLayout) C2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = Math.min(i, i2);
        frameLayout.setLayoutParams(layoutParams);
        ImageView imageView = this.a;
        if (imageView == null) {
            ffkj.c("imageView");
            imageView = null;
        }
        imageView.setImageDrawable(this.b);
    }
}
