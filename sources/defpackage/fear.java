package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fear extends feag {
    public febw b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("policy", c());
        b.f("priority", 5);
        b.h("available", true);
        return b.toString();
    }
}
