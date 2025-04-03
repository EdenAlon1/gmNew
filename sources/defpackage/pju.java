package defpackage;

import android.content.Intent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pju extends ffkk implements ffix {
    public static final pju a = new pju();

    public pju() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Class<?>[] clsArr = {Intent.class, pgq$$ExternalSyntheticApiModelOutline0.m$4(), pgq$$ExternalSyntheticApiModelOutline0.m$4(), pgq$$ExternalSyntheticApiModelOutline0.m$4()};
        Class m$21 = pgq$$ExternalSyntheticApiModelOutline0.m$21();
        Constructor declaredConstructor = m$21.getDeclaredConstructor(clsArr);
        Method method = m$21.getMethod("setDefaultSplitAttributes", pgq$$ExternalSyntheticApiModelOutline0.m$8());
        Method method2 = m$21.getMethod("setFinishPrimaryWithPlaceholder", Integer.TYPE);
        Method method3 = m$21.getMethod("setTag", String.class);
        declaredConstructor.getClass();
        if (pnz.d(declaredConstructor)) {
            method.getClass();
            if (pnz.f(method) && pnz.c(method, pgq$$ExternalSyntheticApiModelOutline0.m$21())) {
                method2.getClass();
                if (pnz.f(method2) && pnz.c(method2, pgq$$ExternalSyntheticApiModelOutline0.m$21())) {
                    method3.getClass();
                    if (pnz.f(method3) && pnz.c(method3, pgq$$ExternalSyntheticApiModelOutline0.m$21())) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
