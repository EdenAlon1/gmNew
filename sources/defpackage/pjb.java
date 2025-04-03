package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjb extends ffkk implements ffix {
    public static final pjb a = new pjb();

    public pjb() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Class<?>[] clsArr = {pgq$$ExternalSyntheticApiModelOutline0.m$4(), pgq$$ExternalSyntheticApiModelOutline0.m$4()};
        Class m$3 = pgq$$ExternalSyntheticApiModelOutline0.m$3();
        Constructor declaredConstructor = m$3.getDeclaredConstructor(clsArr);
        Method method = m$3.getMethod("setTag", String.class);
        declaredConstructor.getClass();
        if (pnz.d(declaredConstructor)) {
            method.getClass();
            if (pnz.f(method) && pnz.c(method, pgq$$ExternalSyntheticApiModelOutline0.m$3())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
