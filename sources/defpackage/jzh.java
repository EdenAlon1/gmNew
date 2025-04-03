package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzh {
    public static final jzn a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = kaq.a;
        kap b = kaq.b(f);
        if (b == null) {
            b = new kai(f);
        }
        return new jzp(f2, f, b);
    }
}
