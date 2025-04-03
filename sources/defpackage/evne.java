package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evne extends evni {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    public evne(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // defpackage.evni
    public final Object a(Class cls) {
        evni.b(cls);
        return this.a.invoke(this.b, cls);
    }
}
