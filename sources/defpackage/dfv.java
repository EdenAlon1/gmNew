package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfv {
    public static final float a(EdgeEffect edgeEffect) {
        float distance;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
            }
        }
        return 0.0f;
    }

    public static final void b(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final float c(EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        if (Build.VERSION.SDK_INT < 31) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        try {
            onPullDistance = edgeEffect.onPullDistance(f, f2);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static final void d(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof dgk)) {
            edgeEffect.onRelease();
            return;
        }
        dgk dgkVar = (dgk) edgeEffect;
        float f2 = dgkVar.b + f;
        dgkVar.b = f2;
        if (Math.abs(f2) > dgkVar.a) {
            dgkVar.onRelease();
        }
    }

    public static final float e(EdgeEffect edgeEffect, float f, float f2, jzn jznVar) {
        float f3 = dfw.a;
        double ec = jznVar.ec() * 386.0878f * 160.0f * 0.84f;
        if (((float) (dfw.a * ec * Math.exp((dfw.b / dfw.c) * Math.log((Math.abs(f) * 0.35f) / (dfw.a * ec))))) > a(edgeEffect) * f2) {
            return 0.0f;
        }
        b(edgeEffect, ffln.b(f));
        return f;
    }
}
