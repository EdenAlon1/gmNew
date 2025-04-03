package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjp extends ffkk implements ffix {
    public static final pjp a = new pjp();

    public pjp() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$18 = pgq$$ExternalSyntheticApiModelOutline0.m$18();
        boolean z = false;
        Method method = m$18.getMethod("getPrimaryActivityStack", new Class[0]);
        Method method2 = m$18.getMethod("getSecondaryActivityStack", new Class[0]);
        Method method3 = m$18.getMethod("getSplitRatio", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, pgq$$ExternalSyntheticApiModelOutline0.m$1())) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, pgq$$ExternalSyntheticApiModelOutline0.m$1())) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, Float.TYPE)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
