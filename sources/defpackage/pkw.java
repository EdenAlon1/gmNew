package defpackage;

import android.os.IBinder;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkw extends ffkk implements ffix {
    public static final pkw a = new pkw();

    public pkw() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = pgq$$ExternalSyntheticApiModelOutline0.m$18().getMethod("getToken", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, IBinder.class)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
