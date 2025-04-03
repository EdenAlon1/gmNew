package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbl {
    static {
        entd entdVar = duwi.a;
        new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    public static void a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            view.setRequestedFrameRate(true != z ? Float.NaN : -4.0f);
        }
    }
}
