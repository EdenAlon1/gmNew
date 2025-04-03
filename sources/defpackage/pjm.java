package defpackage;

import android.content.res.Configuration;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjm extends ffkk implements ffix {
    public static final pjm a = new pjm();

    public pjm() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$15 = pgq$$ExternalSyntheticApiModelOutline0.m$15();
        boolean z = false;
        Method method = m$15.getMethod("getParentWindowMetrics", new Class[0]);
        Method method2 = m$15.getMethod("getParentConfiguration", new Class[0]);
        Method method3 = m$15.getMethod("getDefaultSplitAttributes", new Class[0]);
        Method method4 = m$15.getMethod("areDefaultConstraintsSatisfied", new Class[0]);
        Method method5 = m$15.getMethod("getParentWindowLayoutInfo", new Class[0]);
        Method method6 = m$15.getMethod("getSplitRuleTag", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, jqg$$ExternalSyntheticApiModelOutline9.m466m())) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Configuration.class)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, pgq$$ExternalSyntheticApiModelOutline0.m$8())) {
                    method4.getClass();
                    if (pnz.f(method4) && pnz.c(method4, Boolean.TYPE)) {
                        method5.getClass();
                        if (pnz.f(method5) && pnz.c(method5, WindowLayoutInfo.class)) {
                            method6.getClass();
                            if (pnz.f(method6) && pnz.c(method6, String.class)) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
