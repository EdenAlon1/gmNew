package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class piy extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piy(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = this.a.b.a().getMethod("getActivityEmbeddingComponent", new Class[0]);
        Class b = this.a.b();
        method.getClass();
        if (pnz.f(method) && pnz.c(method, b)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
