package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
final class crhz {
    static long a(Context context, long j) {
        return (long) (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) * j);
    }
}
