package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjg extends ffkk implements ffix {
    public static final pjg a = new pjg();

    public pjg() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$11 = pgq$$ExternalSyntheticApiModelOutline0.m$11();
        Field declaredField = m$11.getDeclaredField("DEFAULT_ANIMATION_RESOURCES_ID");
        boolean z = false;
        Method method = m$11.getMethod("getAnimationBackground", new Class[0]);
        Method method2 = m$11.getMethod("getOpenAnimationResId", new Class[0]);
        Method method3 = m$11.getMethod("getCloseAnimationResId", new Class[0]);
        Method method4 = m$11.getMethod("getChangeAnimationResId", new Class[0]);
        declaredField.getClass();
        if (pnz.e(declaredField)) {
            method.getClass();
            if (pnz.f(method) && pnz.c(method, pgq$$ExternalSyntheticApiModelOutline0.m$6())) {
                method2.getClass();
                if (pnz.f(method2) && pnz.c(method2, Integer.TYPE)) {
                    method3.getClass();
                    if (pnz.f(method3) && pnz.c(method3, Integer.TYPE)) {
                        method4.getClass();
                        if (pnz.f(method4) && pnz.c(method4, Integer.TYPE)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
