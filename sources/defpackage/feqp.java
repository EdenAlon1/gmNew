package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqp {
    public final fett a;
    public final Object b;
    public final Map c;
    private final feqn d;
    private final Map e;
    private final Map f;

    public feqp(feqn feqnVar, Map map, Map map2, fett fettVar, Object obj, Map map3) {
        this.d = feqnVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = fettVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final fdzs a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new feqo(this);
    }

    final feqn b(febs febsVar) {
        feqn feqnVar = (feqn) this.e.get(febsVar.b);
        if (feqnVar == null) {
            feqnVar = (feqn) this.f.get(febsVar.c);
        }
        return feqnVar == null ? this.d : feqnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            feqp feqpVar = (feqp) obj;
            if (emxb.a(this.d, feqpVar.d) && emxb.a(this.e, feqpVar.e) && emxb.a(this.f, feqpVar.f) && emxb.a(this.a, feqpVar.a) && emxb.a(this.b, feqpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("defaultMethodConfig", this.d);
        b.b("serviceMethodMap", this.e);
        b.b("serviceMap", this.f);
        b.b("retryThrottling", this.a);
        b.b("loadBalancingConfig", this.b);
        return b.toString();
    }
}
