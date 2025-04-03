package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecbw extends PopupWindow {
    final /* synthetic */ TooltipView a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecbw(TooltipView tooltipView, View view) {
        super(view, -2, -2);
        this.a = tooltipView;
        this.b = false;
    }

    public final void a() {
        super.dismiss();
        this.b = false;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (this.b) {
            return;
        }
        this.b = true;
        TooltipView tooltipView = this.a;
        Animator loadAnimator = AnimatorInflater.loadAnimator(tooltipView.getContext(), R.animator.og_tooltip_exit_animator);
        loadAnimator.addListener(new ecbs(tooltipView));
        loadAnimator.setTarget(tooltipView);
        loadAnimator.start();
        Resources resources = tooltipView.getContext().getResources();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.83f, 1.0f, 0.83f, tooltipView.g - tooltipView.e, tooltipView.h - tooltipView.f);
        scaleAnimation.setDuration(resources.getInteger(R.integer.og_tooltip_pulse_expand_duration_ms));
        scaleAnimation.setStartOffset(resources.getInteger(R.integer.og_content_alpha_duration_ms));
        scaleAnimation.setInterpolator(dwed.a);
        tooltipView.startAnimation(scaleAnimation);
    }
}
