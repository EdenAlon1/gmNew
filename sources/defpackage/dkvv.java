package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvv {
    private static volatile dkvv a;
    private final dkvt b;

    protected dkvv(Context context) {
        this.b = dkvt.g(context);
    }

    public static dkvv a(Context context) {
        if (a == null) {
            synchronized (dkvv.class) {
                if (a == null) {
                    a = new dkvv(context);
                }
            }
        }
        return a;
    }

    public final boolean b(String str, int i) {
        try {
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("checkCarrierPrivilegesForPackage", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this.b.e(i), str);
            if (Objects.isNull(invoke)) {
                throw new NoSuchMethodException("Unexpected null returned by checkCarrierPrivilegesForPackage");
            }
            return ((Integer) invoke).intValue() == 1;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw new NoSuchMethodException("No checkCarrierPrivilegesForPackage method in TelephonyManager");
        } catch (SecurityException e) {
            throw new dkvd(e);
        }
    }
}
