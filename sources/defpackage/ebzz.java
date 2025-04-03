package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebzz {
    public static final Property a = new ebzy(Float.class);
    public final ViewTreeObserver.OnScrollChangedListener b = new ViewTreeObserver.OnScrollChangedListener() { // from class: ebzw
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            ebzz.this.a();
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ebzx
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ebzz.this.a();
        }
    };
    public final View d;
    private final ObjectAnimator e;
    private boolean f;

    public ebzz(ExpandableDialogView expandableDialogView, Property property, View view) {
        this.f = true;
        this.d = view;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) property, 0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(115L);
        ofFloat.setInterpolator(new LinearInterpolator());
        b();
        if (view.canScrollVertically(-1)) {
            return;
        }
        this.f = false;
    }

    public final void a() {
        if (this.f == this.d.canScrollVertically(-1)) {
            return;
        }
        this.f = !this.f;
        this.e.cancel();
        ObjectAnimator objectAnimator = this.e;
        objectAnimator.setFloatValues(((Float) objectAnimator.getAnimatedValue()).floatValue(), true != this.f ? 0.0f : 1.0f);
        this.e.start();
    }

    final void b() {
        this.d.getViewTreeObserver().addOnScrollChangedListener(this.b);
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }
}
