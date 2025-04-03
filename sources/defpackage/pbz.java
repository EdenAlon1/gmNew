package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbz {
    public static Interpolator a(Context context, int i) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i);
        ksq.b(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }
}
