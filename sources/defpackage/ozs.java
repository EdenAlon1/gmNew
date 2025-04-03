package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozs extends pbq {
    public ozs() {
    }

    private static float P(pbb pbbVar, float f) {
        Float f2;
        return (pbbVar == null || (f2 = (Float) pbbVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator Q(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        pbh.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) pbh.b, f2);
        ozr ozrVar = new ozr(view);
        ofFloat.addListener(ozrVar);
        j().F(ozrVar);
        return ofFloat;
    }

    @Override // defpackage.pbq, defpackage.par
    public final void c(pbb pbbVar) {
        pbq.O(pbbVar);
        Float f = (Float) pbbVar.b.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = pbbVar.b.getVisibility() == 0 ? Float.valueOf(pbh.a(pbbVar.b)) : Float.valueOf(0.0f);
        }
        pbbVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.par
    public final boolean d() {
        return true;
    }

    @Override // defpackage.pbq
    public final Animator f(ViewGroup viewGroup, View view, pbb pbbVar, pbb pbbVar2) {
        pbi pbiVar = pbh.a;
        Animator Q = Q(view, P(pbbVar, 1.0f), 0.0f);
        if (Q == null) {
            pbh.c(view, P(pbbVar2, 1.0f));
        }
        return Q;
    }

    @Override // defpackage.pbq
    public final Animator g(ViewGroup viewGroup, View view, pbb pbbVar) {
        pbi pbiVar = pbh.a;
        return Q(view, P(pbbVar, 0.0f), 1.0f);
    }

    public ozs(int i) {
        this.v = i;
    }
}
