package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjs extends ffkk implements ffix {
    public static final pjs a = new pjs();

    public pjs() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$20 = pgq$$ExternalSyntheticApiModelOutline0.m$20();
        boolean z = false;
        Method method = m$20.getMethod("getFinishPrimaryWithSecondary", new Class[0]);
        Method method2 = m$20.getMethod("getFinishSecondaryWithPrimary", new Class[0]);
        Method method3 = m$20.getMethod("shouldClearTop", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Integer.TYPE)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Integer.TYPE)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, Boolean.TYPE)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
