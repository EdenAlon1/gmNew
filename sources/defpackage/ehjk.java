package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehjk {
    public final View a;
    public final int b;
    public final int c;
    protected final int d;
    public aak e;
    private final TimeInterpolator f = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public ehjk(View view) {
        this.a = view;
        Context context = view.getContext();
        this.b = ehmp.a(context, R.attr.motionDurationMedium2, 300);
        this.c = ehmp.a(context, R.attr.motionDurationShort3, 150);
        this.d = ehmp.a(context, R.attr.motionDurationShort2, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final aak b() {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        aak aakVar = this.e;
        this.e = null;
        return aakVar;
    }

    public final aak c() {
        aak aakVar = this.e;
        this.e = null;
        return aakVar;
    }

    protected final aak d(aak aakVar) {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        aak aakVar2 = this.e;
        this.e = aakVar;
        return aakVar2;
    }
}
