package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvo {
    public static cfvn a(Context context) {
        ekzz f = eleg.f("PreferenceFileInitModule#providePreferenceFileInit");
        try {
            devc.a = context;
            cfvn cfvnVar = new cfvn();
            f.close();
            return cfvnVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
