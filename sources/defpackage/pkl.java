package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkl extends ffkk implements ffix {
    public static final pkl a = new pkl();

    public pkl() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = pgq$$ExternalSyntheticApiModelOutline0.m$13().getMethod("isDraggingToFullscreenAllowed", new Class[0]);
        method.getClass();
        if (pnz.f(method) && pnz.c(method, Boolean.TYPE)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
