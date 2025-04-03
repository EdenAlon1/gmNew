package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvas {
    public static final /* synthetic */ int a = 0;
    private static final cpn b;

    static {
        new ConcurrentHashMap();
        b();
        cpn cpnVar = new cpn();
        b = cpnVar;
        cpnVar.put(Byte.class, Byte.TYPE);
        cpnVar.put(Short.class, Short.TYPE);
        cpnVar.put(Integer.class, Integer.TYPE);
        cpnVar.put(Long.class, Long.TYPE);
        cpnVar.put(Float.class, Float.TYPE);
        cpnVar.put(Double.class, Double.TYPE);
        cpnVar.put(Character.class, Character.TYPE);
        cpnVar.put(Boolean.class, Boolean.TYPE);
    }

    public static Context a(Context context) {
        boolean isDeviceProtectedStorage;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        Context createDeviceProtectedStorageContext = isDeviceProtectedStorage ? context : context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext != null ? createDeviceProtectedStorageContext : context;
    }

    public static void b() {
        if (duzy.a) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("<clinit>") && (stackTraceElement.getClassName().endsWith("AppBase") || stackTraceElement.getClassName().endsWith("LatinApp") || stackTraceElement.getClassName().endsWith("Application"))) {
                    throw new emyx("This class shall not be used before Application.onCreate() as it has a static filed of ConcurrentHashMap, please move it to later in the initialization sequence");
                }
            }
        }
    }
}
