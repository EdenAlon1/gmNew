package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acxz extends acya {
    private final String a;

    public acxz(String str) {
        this.a = str;
    }

    @Override // defpackage.acya
    public final /* bridge */ /* synthetic */ Object a() {
        Method method = efbb.a;
        String str = this.a;
        boolean z = false;
        try {
            Method method2 = efbb.a;
            if (method2 != null) {
                z = ((Boolean) method2.invoke(null, str, false)).booleanValue();
            }
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return Boolean.valueOf(z);
    }
}
