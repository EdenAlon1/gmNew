package defpackage;

import android.content.Context;
import android.graphics.RectF;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukm {
    public final Context a;
    public final int b;
    private final int c;
    private final int d;

    public dukm(Context context) {
        this.a = context;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.screen_width_360);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.screen_width_411);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.screen_width_480);
    }

    public final int a() {
        return this.a.getResources().getDimensionPixelOffset(R.dimen.hats_lib_container_large_padding);
    }

    public final int b() {
        if (duko.a(this.a).x < this.b) {
            return duko.a(this.a).x;
        }
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.hats_lib_prompt_max_width);
        int a = a();
        return dimensionPixelSize + a + a;
    }

    public final RectF c(boolean z) {
        float f;
        float f2;
        float f3;
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.hats_lib_container_small_padding);
        int a = a();
        if (z) {
            f3 = dimensionPixelOffset;
            f = 0.0f;
            f2 = 0.0f;
        } else {
            int i = duko.a(this.a).x;
            r2 = i >= this.c ? dimensionPixelOffset : 0.0f;
            f = r2;
            if (i >= this.d) {
                f = a;
                f2 = r2;
                r2 = f;
                f3 = f;
            } else {
                f2 = r2;
                f3 = f;
                r2 = f;
            }
        }
        return new RectF(r2, f3, f, f2);
    }
}
