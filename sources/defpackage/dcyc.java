package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyc {
    public final FrameLayout a;
    public final TextView b;
    public final View c;
    public final ViewGroup d;
    public final View e;
    public final abo f;
    public Animator g;
    public boolean h;
    public int i = 0;
    public final Optional j = Optional.empty();
    public final Optional k = Optional.empty();
    public int l;

    public dcyc(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = view;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.welcome_tooltip_view_with_nested_scrollview, viewGroup, false);
        this.a = frameLayout;
        this.b = (TextView) frameLayout.findViewById(R.id.tooltip_text);
        this.d = viewGroup;
        this.e = frameLayout.findViewById(R.id.tooltip_scroll_view);
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(4);
        this.l = 3;
        this.f = new dcxz(this);
        this.h = false;
    }

    public final ValueAnimator a(float... fArr) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dcxy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dcyc.this.a.setAlpha(((Float) ofFloat.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    public final void b() {
        int i = this.l;
        if (i == 3) {
            return;
        }
        if (i == 1) {
            this.g.cancel();
            this.g.removeAllListeners();
        }
        int i2 = this.l;
        if (i2 == 0 || i2 == 1) {
            float alpha = this.a.getAlpha();
            ValueAnimator a = a(alpha, 0.0f);
            a.setDuration((long) (alpha * 75.0f));
            a.addListener(new dcyb(this));
            a.start();
            this.g = a;
        }
        this.l = 2;
        this.f.h(false);
    }
}
