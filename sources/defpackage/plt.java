package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plt extends ffkk implements ffix {
    final /* synthetic */ plu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plt(plu pluVar) {
        super(0);
        this.a = pluVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = this.a.c.a().getMethod("getWindowLayoutComponent", new Class[0]);
        Class d = this.a.d();
        method.getClass();
        if (pnz.f(method) && pnz.c(method, d)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
