package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.research.ink.libs.buttons.ColorSelectionButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faca extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ColorSelectionButton b;

    public faca(ColorSelectionButton colorSelectionButton, boolean z) {
        this.a = z;
        this.b = colorSelectionButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ColorSelectionButton colorSelectionButton = this.b;
        colorSelectionButton.setScaleX(this.a ? colorSelectionButton.a : 1.0f);
        ColorSelectionButton colorSelectionButton2 = this.b;
        colorSelectionButton2.setScaleY(this.a ? colorSelectionButton2.a : 1.0f);
        this.b.d = this.a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
