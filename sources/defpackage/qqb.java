package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqb {
    private final Map a;

    public qqb(qqa qqaVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap(qqaVar.a));
    }

    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }
}
