package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwf {
    public static final ObjectAnimator a(View view, boolean z, int i) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, true != z ? 0.0f : 1.0f, true != z ? 1.0f : 0.0f).setDuration(i);
    }

    public static final ObjectAnimator b(View view, float f, float f2, int i) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) cxxl.a, f, f2).setDuration(i);
        duration.setRepeatMode(2);
        duration.setRepeatCount(-1);
        return duration;
    }
}
