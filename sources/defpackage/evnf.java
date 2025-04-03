package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evnf extends evni {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    public evnf(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.evni
    public final Object a(Class cls) {
        evni.b(cls);
        return this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}
