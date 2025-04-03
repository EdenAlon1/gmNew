package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import defpackage.csjy;
import defpackage.cxqk;
import defpackage.dcaj;
import defpackage.dcat;
import defpackage.ehdr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CategoryToggleView extends dcaj {
    public ImageView a;
    public FrameLayout b;
    public final float c;
    public dcat d;
    public cxqk e;
    private ObjectAnimator f;
    private ObjectAnimator g;
    private final float h;
    private final float i;
    private final float j;
    private boolean k;
    private GradientDrawable l;
    private final int m;

    public CategoryToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = getResources().getDimension(R.dimen.c2o_content_item_corner_radius);
        this.i = getResources().getDimension(R.dimen.category_toggle_elevation);
        this.j = getResources().getDimension(R.dimen.category_toggle_padding);
        this.c = getResources().getFraction(R.fraction.c2o_category_disabled_icon_alpha, 1, 1);
        this.k = false;
        this.m = getResources().getInteger(R.integer.c2o_category_toggle_animation_duration_ms);
    }

    final ObjectAnimator a() {
        if (this.g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "cornerRadiusPercentage", 1.0f, 0.0f);
            this.g = ofFloat;
            ofFloat.setDuration(this.m);
        }
        return this.g;
    }

    final ObjectAnimator b() {
        if (this.f == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "cornerRadiusPercentage", 0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.setDuration(this.m);
        }
        return this.f;
    }

    public final synchronized void c() {
        ObjectAnimator a = a();
        if (b().isRunning() || a.isRunning() || !this.k) {
            return;
        }
        csjy.l("BugleAnimation", "Start expand animation for category indicator");
        a.start();
        this.k = false;
    }

    public final synchronized void d() {
        ObjectAnimator b = b();
        if (b.isRunning() || a().isRunning() || this.k) {
            return;
        }
        csjy.l("BugleAnimation", "Start shrink animation for category indicator");
        b.start();
        this.k = true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.c2o_category_toggle_icon);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.c2o_category_toggle_frame);
        this.b = frameLayout;
        frameLayout.setOnClickListener(this.e.a(new View.OnClickListener() { // from class: dbzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcat dcatVar = CategoryToggleView.this.d;
                if (dcatVar != null) {
                    dcatVar.j();
                }
            }
        }));
        GradientDrawable gradientDrawable = (GradientDrawable) this.b.getBackground().mutate();
        this.l = gradientDrawable;
        Context context = getContext();
        context.getClass();
        gradientDrawable.setColor(ehdr.d(context, R.attr.colorSurfaceContainerHighest, "BugleSurfaceColors"));
        this.b.setClipToOutline(true);
        this.b.setBackground(this.l);
    }

    protected void setCornerRadiusPercentage(float f) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        float f2 = this.j;
        int height = getHeight();
        int width = getWidth() - ((int) (f2 + f2));
        float f3 = this.h;
        float f4 = (height / 2) - ((int) f3);
        float f5 = ((int) (f4 * f)) + f3;
        float f6 = width / 2;
        if (f5 < f6) {
            layoutParams.height = height;
        } else {
            float f7 = width;
            float f8 = 1.0f - f;
            layoutParams.height = (int) (f7 + ((f8 + f8) * f4));
            f5 = f6;
        }
        float f9 = this.i * f;
        setTranslationZ(f9);
        this.b.setTranslationZ(f9);
        this.a.setTranslationZ(f9);
        this.b.setLayoutParams(layoutParams);
        this.l.setCornerRadius(f5);
        this.b.setBackground(this.l);
    }
}
