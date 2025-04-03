package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjj extends ffkk implements ffix {
    public static final pjj a = new pjj();

    public pjj() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class m$14 = pgq$$ExternalSyntheticApiModelOutline0.m$14();
        boolean z = false;
        Method method = m$14.getMethod("getActivity", new Class[0]);
        Method method2 = m$14.getMethod("isEmbedded", new Class[0]);
        Method method3 = m$14.getMethod("getTaskBounds", new Class[0]);
        Method method4 = m$14.getMethod("getActivityStackBounds", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Activity.class)) {
            method2.getClass();
            if (pnz.f(method2) && pnz.c(method2, Boolean.TYPE)) {
                method3.getClass();
                if (pnz.f(method3) && pnz.c(method3, Rect.class)) {
                    method4.getClass();
                    if (pnz.f(method4) && pnz.c(method4, Rect.class)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
