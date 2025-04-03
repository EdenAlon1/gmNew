package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pji extends ffkk implements ffix {
    public static final pji a = new pji();

    public pji() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$13 = pgq$$ExternalSyntheticApiModelOutline0.m$13();
        boolean z = false;
        Method method = m$13.getMethod("getDividerType", new Class[0]);
        Method method2 = m$13.getMethod("getWidthDp", new Class[0]);
        Method method3 = m$13.getMethod("getPrimaryMinRatio", new Class[0]);
        Method method4 = m$13.getMethod("getPrimaryMaxRatio", new Class[0]);
        Method method5 = m$13.getMethod("getDividerColor", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Integer.TYPE)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Integer.TYPE)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, Float.TYPE)) {
                    method4.getClass();
                    if (pnz.f(method4) && pnz.c(method4, Float.TYPE)) {
                        method5.getClass();
                        if (pnz.f(method5) && pnz.c(method5, Integer.TYPE)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
