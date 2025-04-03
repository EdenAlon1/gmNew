package defpackage;

import java.lang.reflect.Method;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pks extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pks(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Method method = this.a.b().getMethod("setEmbeddingRules", Set.class);
        method.getClass();
        return Boolean.valueOf(pnz.f(method));
    }
}
