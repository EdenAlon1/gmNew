package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.support.constraint.Guideline;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcrd {
    protected final Activity a;
    final int b;
    public float c;
    protected final boolean d;
    private final Guideline e;
    private final Guideline f;
    private int g;
    private final int h;
    private final int i;

    public dcrd(Activity activity, ViewGroup viewGroup, Guideline guideline, Guideline guideline2, boolean z) {
        this.a = activity;
        this.e = guideline;
        this.f = guideline2;
        this.b = (int) activity.getResources().getDimension(R.dimen.camera_ui_max_edge_spacing);
        this.g = activity.getWindowManager().getDefaultDisplay().getRotation() * 90;
        this.h = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
        this.i = Math.max(viewGroup.getWidth(), viewGroup.getHeight());
        this.d = z;
    }

    private static Point e(float f, int i, int i2) {
        float f2 = i;
        float f3 = i2;
        return f < f2 / f3 ? new Point((int) (f3 * f), i2) : new Point(i, (int) (f2 / f));
    }

    public void a(int i) {
        int d;
        int b = b(i) / 2;
        int d2 = cskf.d(b, ddzb.d(this.a), this.b);
        if (ctid.e(this.a, this.d)) {
            d = 0;
        } else {
            d = cskf.d(b, ddzb.c(this.a), this.b);
        }
        int i2 = i % 180;
        int i3 = this.h;
        int i4 = this.i;
        Math.min((i2 != 0 ? i4 - e(this.c, i4, i3).x : i3 - e(this.c, i3, i4).x) / 2, this.b);
        if (i != 0) {
            if (i == 90) {
                d(d2, 0);
            } else if (i != 180) {
                if (i != 270) {
                    csix.c(a.h(i, "Invalid rotation "));
                } else {
                    d(d2, 0);
                }
            }
            this.g = i;
        }
        d(d2, d);
        this.g = i;
    }

    final int b(int i) {
        int i2 = this.h;
        int i3 = this.i;
        return i % 180 != 0 ? i2 - e(this.c, i3, i2).y : i3 - e(this.c, i2, i3).y;
    }

    final void c() {
        a(this.g);
    }

    final void d(int i, int i2) {
        Guideline guideline = this.e;
        if (guideline != null) {
            ddxw.a(guideline, i);
        }
        Guideline guideline2 = this.f;
        if (guideline2 != null) {
            ddxw.b(guideline2, i2);
        }
    }
}
