package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pln extends ffkk implements ffix {
    final /* synthetic */ plu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pln(plu pluVar) {
        super(0);
        this.a = pluVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class b = this.a.b();
        boolean z = false;
        Method method = b.getMethod("getType", new Class[0]);
        Method method2 = b.getMethod("hasProperty", Integer.TYPE);
        Method method3 = b.getMethod("hasProperties", int[].class);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Integer.TYPE)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Boolean.TYPE)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, Boolean.TYPE)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
