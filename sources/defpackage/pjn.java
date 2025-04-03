package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjn extends ffkk implements ffix {
    public static final pjn a = new pjn();

    public pjn() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$8 = pgq$$ExternalSyntheticApiModelOutline0.m$8();
        boolean z = false;
        Method method = m$8.getMethod("getLayoutDirection", new Class[0]);
        Method method2 = m$8.getMethod("getSplitType", new Class[0]);
        Class<?>[] clsArr = {pgq$$ExternalSyntheticApiModelOutline0.m$16()};
        Class m$9 = pgq$$ExternalSyntheticApiModelOutline0.m$9();
        Method method3 = m$9.getMethod("setSplitType", clsArr);
        Method method4 = m$9.getMethod("setLayoutDirection", Integer.TYPE);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Integer.TYPE)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, pgq$$ExternalSyntheticApiModelOutline0.m$16())) {
                method3.getClass();
                if (pnz.f(method3)) {
                    method4.getClass();
                    if (pnz.f(method4)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
