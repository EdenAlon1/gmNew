package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecmi {
    public static volatile long a;
    private static volatile float b;

    private ecmi() {
    }

    public static emxc a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return emux.a;
        }
        float f = b;
        if (f == 0.0f) {
            synchronized (ecmi.class) {
                f = b;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return emxc.j(Float.valueOf(f));
    }
}
