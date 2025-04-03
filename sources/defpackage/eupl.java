package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupl {
    public String a = null;
    public int b;
    public eupr c;
    private final Set d;
    private final Set e;
    private int f;
    private final Set g;

    @SafeVarargs
    public eupl(euqq euqqVar, euqq... euqqVarArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(euqqVar);
        for (euqq euqqVar2 : euqqVarArr) {
            euqo.c(euqqVar2);
        }
        Collections.addAll(this.d, euqqVarArr);
    }

    public final eupm a() {
        euqo.a(this.c != null, "Missing required property: factory.");
        return new eupm(this.a, new HashSet(this.d), new HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(euqd euqdVar) {
        if (this.d.contains(euqdVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.e.add(euqdVar);
    }

    public final void c() {
        euqo.a(1 == (this.f ^ 1), "Instantiation type has already been set.");
        this.f = 1;
    }

    @SafeVarargs
    public eupl(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(new euqq(euqp.class, cls));
        for (Class cls2 : clsArr) {
            euqo.c(cls2);
            this.d.add(new euqq(euqp.class, cls2));
        }
    }
}
