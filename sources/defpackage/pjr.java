package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjr extends ffkk implements ffix {
    public static final pjr a = new pjr();

    public pjr() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Class<?>[] clsArr = {pgq$$ExternalSyntheticApiModelOutline0.m$4(), pgq$$ExternalSyntheticApiModelOutline0.m$4(), pgq$$ExternalSyntheticApiModelOutline0.m$4()};
        Class m$19 = pgq$$ExternalSyntheticApiModelOutline0.m$19();
        Constructor declaredConstructor = m$19.getDeclaredConstructor(clsArr);
        Method method = m$19.getMethod("setDefaultSplitAttributes", pgq$$ExternalSyntheticApiModelOutline0.m$8());
        Method method2 = m$19.getMethod("setTag", String.class);
        declaredConstructor.getClass();
        if (pnz.d(declaredConstructor)) {
            method.getClass();
            if (pnz.f(method) && pnz.c(method, pgq$$ExternalSyntheticApiModelOutline0.m$19())) {
                method2.getClass();
                if (pnz.f(method2) && pnz.c(method2, pgq$$ExternalSyntheticApiModelOutline0.m$19())) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
