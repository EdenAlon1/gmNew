package defpackage;

import android.app.Activity;
import android.support.constraint.Guideline;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwy {
    private final Activity a;
    private final Guideline b;
    private final Guideline c;
    private final Guideline d;
    private final Guideline e;

    public dcwy(Activity activity, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4) {
        this.a = activity;
        this.b = guideline;
        this.c = guideline2;
        this.d = guideline3;
        this.e = guideline4;
    }

    public final void a() {
        int i;
        boolean isInMultiWindowMode;
        int rotation = this.a.getWindowManager().getDefaultDisplay().getRotation() * 90;
        Activity activity = this.a;
        int c = ddzb.c(activity);
        boolean z = activity.getResources().getConfiguration().getLayoutDirection() == 1;
        if (z) {
            if (rotation == 90) {
                rotation = 90;
                i = c;
            }
            i = 0;
        } else {
            if (rotation == 270) {
                rotation = 270;
                i = c;
            }
            i = 0;
        }
        if (rotation != (true == z ? 270 : 90)) {
            c = 0;
        }
        if (z) {
            ddxw.b(this.b, i);
        } else {
            ddxw.a(this.b, i);
        }
        if (z) {
            ddxw.a(this.d, c);
        } else {
            ddxw.b(this.d, c);
        }
        ddxw.a(this.c, ddzb.d(this.a));
        isInMultiWindowMode = this.a.isInMultiWindowMode();
        ddxw.b(this.e, isInMultiWindowMode ? ddzb.c(this.a) : ddzb.b(this.a));
    }
}
