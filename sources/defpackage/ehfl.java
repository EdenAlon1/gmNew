package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehfl extends ug {
    public ehfl(Context context) {
        super(context);
    }

    @Override // defpackage.ug
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
