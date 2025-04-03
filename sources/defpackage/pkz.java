package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkz extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkz(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Method method = this.a.b().getMethod("updateSplitAttributes", pgq$$ExternalSyntheticApiModelOutline0.m$17(), pgq$$ExternalSyntheticApiModelOutline0.m$8());
        method.getClass();
        return Boolean.valueOf(pnz.f(method));
    }
}
