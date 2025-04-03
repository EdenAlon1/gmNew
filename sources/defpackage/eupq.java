package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupq {
    public static ComponentRegistrar a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new euqi(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new euqi(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new euqi(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new euqi(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new euqi(String.format("Could not instantiate %s", str), e4);
        }
    }
}
