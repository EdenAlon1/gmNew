package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyp {
    public static final boolean a() {
        try {
            if (AndroidComposeView.a == null) {
                AndroidComposeView.a = Class.forName("android.os.SystemProperties");
                Class cls = AndroidComposeView.a;
                AndroidComposeView.b = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.b;
            Object invoke = method != null ? method.invoke(null, "debug.layout", false) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
