package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evng extends evni {
    final /* synthetic */ Method a;

    public evng(Method method) {
        this.a = method;
    }

    @Override // defpackage.evni
    public final Object a(Class cls) {
        evni.b(cls);
        return this.a.invoke(null, cls, Object.class);
    }
}
