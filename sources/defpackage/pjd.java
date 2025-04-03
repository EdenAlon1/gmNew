package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjd extends ffkk implements ffix {
    public static final pjd a = new pjd();

    public pjd() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$2 = pgq$$ExternalSyntheticApiModelOutline0.m$2();
        boolean z = false;
        Method method = m$2.getMethod("toBundle", new Class[0]);
        Method method2 = m$2.getMethod("readFromBundle", Bundle.class);
        Method method3 = m$2.getMethod("createFromBinder", IBinder.class);
        Field declaredField = m$2.getDeclaredField("INVALID_ACTIVITY_STACK_TOKEN");
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Bundle.class)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, m$2)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, m$2)) {
                    declaredField.getClass();
                    if (pnz.e(declaredField)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
