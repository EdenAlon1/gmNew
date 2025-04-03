package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjx extends ffkk implements ffix {
    public static final pjx a = new pjx();

    public pjx() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$26 = pgq$$ExternalSyntheticApiModelOutline0.m$26();
        boolean z = false;
        Method method = m$26.getMethod("getDimAreaBehavior", new Class[0]);
        Method method2 = pgq$$ExternalSyntheticApiModelOutline0.m$8().getMethod("getWindowAttributes", new Class[0]);
        Method method3 = pgq$$ExternalSyntheticApiModelOutline0.m$9().getMethod("setWindowAttributes", pgq$$ExternalSyntheticApiModelOutline0.m$26());
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Integer.TYPE)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, m$26)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, pgq$$ExternalSyntheticApiModelOutline0.m$9())) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
