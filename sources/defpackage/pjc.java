package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pjc extends ffkk implements ffix {
    public static final pjc a = new pjc();

    public pjc() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = pgq$$ExternalSyntheticApiModelOutline0.m$5().getMethod("shouldAlwaysExpand", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Boolean.TYPE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
