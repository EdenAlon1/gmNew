package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkm extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkm(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = pgq$$ExternalSyntheticApiModelOutline0.m$28().getMethod("isSticky", new Class[0]);
        Method method2 = this.a.b().getMethod("pinTopActivityStack", Integer.TYPE, pgq$$ExternalSyntheticApiModelOutline0.m$28());
        Method method3 = this.a.b().getMethod("unpinTopActivityStack", Integer.TYPE);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Boolean.TYPE)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Boolean.TYPE)) {
                method3.getClass();
                if (pnz.f(method3)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
