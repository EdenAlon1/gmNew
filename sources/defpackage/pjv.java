package defpackage;

import android.content.Intent;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjv extends ffkk implements ffix {
    public static final pjv a = new pjv();

    public pjv() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$22 = pgq$$ExternalSyntheticApiModelOutline0.m$22();
        boolean z = false;
        Method method = m$22.getMethod("getPlaceholderIntent", new Class[0]);
        Method method2 = m$22.getMethod("isSticky", new Class[0]);
        Method method3 = m$22.getMethod("getFinishPrimaryWithSecondary", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Intent.class)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Boolean.TYPE)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, Integer.TYPE)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
