package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkr extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkr(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Method method = this.a.b().getMethod("setEmbeddedActivityWindowInfoCallback", Executor.class, pgq$$ExternalSyntheticApiModelOutline0.m$29());
        method.getClass();
        return Boolean.valueOf(pnz.f(method));
    }
}
