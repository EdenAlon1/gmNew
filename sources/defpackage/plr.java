package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plr extends ffkk implements ffix {
    final /* synthetic */ plu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plr(plu pluVar) {
        super(0);
        this.a = pluVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class d = this.a.d();
        boolean z = false;
        Method method = d.getMethod("addWindowLayoutInfoListener", Context.class, pgq$$ExternalSyntheticApiModelOutline0.m$29());
        Method method2 = d.getMethod("removeWindowLayoutInfoListener", pgq$$ExternalSyntheticApiModelOutline0.m$29());
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
