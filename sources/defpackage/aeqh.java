package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ aeql b;

    public aeqh(View view, aeql aeqlVar) {
        this.a = view;
        this.b = aeqlVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
            return;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.getWidth();
        this.a.getHeight();
        ImageView imageView = this.b.e;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.8f);
        ofFloat.setInterpolator(new ljm());
        ofFloat.setDuration(400L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.8f);
        ofFloat2.setInterpolator(new ljm());
        ofFloat2.setDuration(400L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 720.0f);
        ofFloat3.setDuration(900L);
        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat3.setStartDelay(120L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.0f);
        ofFloat4.setInterpolator(new ljm());
        ofFloat4.setDuration(400L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.0f);
        ofFloat5.setInterpolator(new ljm());
        ofFloat5.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.play(ofFloat4).with(ofFloat5).after(ofFloat3);
        animatorSet.setStartDelay(250L);
        animatorSet.start();
    }
}
