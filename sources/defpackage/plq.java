package defpackage;

import android.app.Activity;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plq extends ffkk implements ffix {
    final /* synthetic */ plu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plq(plu pluVar) {
        super(0);
        this.a = pluVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class<?> a = this.a.b.a();
        boolean z = false;
        if (a == null) {
            return false;
        }
        Class d = this.a.d();
        Method method = d.getMethod("addWindowLayoutInfoListener", Activity.class, a);
        Method method2 = d.getMethod("removeWindowLayoutInfoListener", a);
        method.getClass();
        if (pnz.f(method)) {
            method2.getClass();
            if (pnz.f(method2)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
