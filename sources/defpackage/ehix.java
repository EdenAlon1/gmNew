package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehix extends par {
    private static final void f(pbb pbbVar) {
        View view = pbbVar.b;
        if (view instanceof TextView) {
            pbbVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.par
    public final Animator a(ViewGroup viewGroup, pbb pbbVar, pbb pbbVar2) {
        if (pbbVar == null || pbbVar2 == null || !(pbbVar.b instanceof TextView)) {
            return null;
        }
        View view = pbbVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = pbbVar.a;
        Map map2 = pbbVar2.a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ehiw(textView));
        return ofFloat;
    }

    @Override // defpackage.par
    public final void b(pbb pbbVar) {
        f(pbbVar);
    }

    @Override // defpackage.par
    public final void c(pbb pbbVar) {
        f(pbbVar);
    }
}
