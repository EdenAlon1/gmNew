package defpackage;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewd {
    public static final List a = Arrays.asList(Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.TYPE, Character.TYPE, String.class);
    final Class[] b;
    final boolean c;
    final boolean d;
    final boolean e;

    public eewd(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.b = parameterTypes;
        int length = parameterTypes.length;
        boolean z = length > 0 && parameterTypes[0] == Context.class;
        this.c = z;
        this.d = !z ? length <= 0 || parameterTypes[0] != String[].class : length <= 1 || parameterTypes[1] != String[].class;
        eewx eewxVar = (eewx) method.getAnnotation(eewx.class);
        this.e = eewxVar != null && eewxVar.b();
    }
}
