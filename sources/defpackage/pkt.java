package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkt extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkt(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class<?> a = this.a.a.a();
        if (a == null) {
            return false;
        }
        Method method = this.a.b().getMethod("setSplitInfoCallback", a);
        method.getClass();
        return Boolean.valueOf(pnz.f(method));
    }
}
