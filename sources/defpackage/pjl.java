package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjl extends ffkk implements ffix {
    public static final pjl a = new pjl();

    public pjl() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = pin.class.getMethod("a", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, String.class)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
