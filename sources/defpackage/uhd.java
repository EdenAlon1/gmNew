package defpackage;

import android.app.Activity;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhd {
    private final Activity a;
    private final int b;

    public uhd(Activity activity) {
        this.a = activity;
        this.b = c(activity);
    }

    private static int c(Activity activity) {
        return activity.getWindow().getAttributes().softInputMode;
    }

    private final void d(int i) {
        this.a.getWindow().setSoftInputMode(i);
    }

    public final void a() {
        if (Build.VERSION.SDK_INT > 29) {
            this.a.getWindow().setDecorFitsSystemWindows(true);
        }
        d(this.b);
    }

    public final void b() {
        if (c(this.a) != 48) {
            if (Build.VERSION.SDK_INT > 29) {
                this.a.getWindow().setDecorFitsSystemWindows(false);
            }
            d(48);
        }
    }
}
