package defpackage;

import android.graphics.Rect;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plo extends ffkk implements ffix {
    final /* synthetic */ plu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plo(plu pluVar) {
        super(0);
        this.a = pluVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        Class<?> loadClass = this.a.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        loadClass.getClass();
        boolean z = false;
        Method method = loadClass.getMethod("getBounds", new Class[0]);
        Method method2 = loadClass.getMethod("getType", new Class[0]);
        Method method3 = loadClass.getMethod("getState", new Class[0]);
        method.getClass();
        int i = fflc.a;
        if (pnz.g(method, new ffkb(Rect.class)) && pnz.f(method)) {
            method2.getClass();
            if (pnz.g(method2, new ffkb(Integer.TYPE)) && pnz.f(method2)) {
                method3.getClass();
                if (pnz.g(method3, new ffkb(Integer.TYPE)) && pnz.f(method3)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
