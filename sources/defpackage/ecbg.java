package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbg implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ ecbi b;

    public ecbg(ecbi ecbiVar, View view) {
        this.a = view;
        this.b = ecbiVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ebot.a(this.a, this);
        Runnable runnable = new Runnable() { // from class: ecbf
            @Override // java.lang.Runnable
            public final void run() {
                ecbi ecbiVar = ecbg.this.b;
                final ecbm ecbmVar = ecbiVar.b;
                if (ecbmVar.d != null) {
                    ecba ecbaVar = ecbmVar.a;
                    ecbl ecblVar = ecbmVar.b;
                    AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) ecbaVar).c;
                    accountParticleDisc.addOnAttachStateChangeListener(ecblVar);
                    accountParticleDisc.getViewTreeObserver().addOnGlobalLayoutListener(ecbmVar.b);
                    final ecby ecbyVar = new ecby(accountParticleDisc, new ecbj(ecbmVar));
                    ecbmVar.d.c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ecbk
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            ecby ecbyVar2 = ecbyVar;
                            ViewTreeObserver viewTreeObserver = ecbyVar2.b.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(ecbyVar2.a);
                            }
                            ecbm.this.c.onDismiss();
                        }
                    });
                    final TooltipView tooltipView = ecbmVar.d;
                    tooltipView.b(tooltipView.a.b());
                    tooltipView.b.addView(tooltipView.i);
                    tooltipView.c.setClippingEnabled(false);
                    tooltipView.c.setAnimationStyle(0);
                    tooltipView.c.setTouchable(true);
                    tooltipView.c.setBackgroundDrawable(new ColorDrawable(0));
                    tooltipView.measure(-2, -2);
                    tooltipView.d();
                    tooltipView.d.setAlpha(0.0f);
                    tooltipView.setBubbleWidthScale(0.0f);
                    Animator loadAnimator = AnimatorInflater.loadAnimator(tooltipView.getContext(), R.animator.og_tooltip_enter_animator);
                    loadAnimator.setTarget(tooltipView);
                    loadAnimator.start();
                    Resources resources = tooltipView.getContext().getResources();
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.83f, 1.05f, 0.83f, 1.05f, tooltipView.g - tooltipView.e, tooltipView.h - tooltipView.f);
                    scaleAnimation.setDuration(resources.getInteger(R.integer.og_tooltip_pulse_expand_duration_ms));
                    scaleAnimation.setInterpolator(dwed.a);
                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, tooltipView.g - tooltipView.e, tooltipView.h - tooltipView.f);
                    scaleAnimation2.setDuration(resources.getInteger(R.integer.og_tooltip_pulse_shrink_duration_ms));
                    scaleAnimation2.setInterpolator(dwed.c);
                    scaleAnimation2.setAnimationListener(new ecbu(tooltipView));
                    scaleAnimation.setAnimationListener(new ecbv(tooltipView, scaleAnimation2));
                    tooltipView.setAnimation(scaleAnimation);
                    tooltipView.setClipChildren(false);
                    ebpa.a(new Runnable() { // from class: ecbp
                        @Override // java.lang.Runnable
                        public final void run() {
                            efbd.c();
                            int[] iArr = kvo.a;
                            TooltipView tooltipView2 = TooltipView.this;
                            AccountParticleDisc accountParticleDisc2 = ((SelectedAccountDisc) tooltipView2.a).c;
                            if (accountParticleDisc2.isAttachedToWindow()) {
                                tooltipView2.c.showAtLocation(accountParticleDisc2, 0, tooltipView2.e, tooltipView2.f);
                            }
                        }
                    });
                }
                ecbiVar.a = true;
            }
        };
        int[] iArr = kvo.a;
        this.a.postOnAnimation(runnable);
    }
}
