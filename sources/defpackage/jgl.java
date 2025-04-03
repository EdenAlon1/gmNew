package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgl {
    public static final void a(View view) {
        try {
            if (!jgm.c) {
                jgm.c = true;
                if (Build.VERSION.SDK_INT < 28) {
                    jgm.a = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    jgm.b = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    jgm.a = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    jgm.b = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = jgm.a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = jgm.b;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = jgm.b;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = jgm.a;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            jgm.d = true;
        }
    }
}
