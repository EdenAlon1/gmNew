package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjcg {
    public final Method a;
    private final List b;

    public fjcg(Method method, List list) {
        this.a = method;
        this.b = DesugarCollections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
