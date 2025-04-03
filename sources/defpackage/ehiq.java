package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehiq {
    private final ArrayList a = new ArrayList();
    private final Animator.AnimatorListener b = new ehio();

    public final void a(ValueAnimator valueAnimator) {
        ehip ehipVar = new ehip();
        valueAnimator.addListener(this.b);
        this.a.add(ehipVar);
    }
}
