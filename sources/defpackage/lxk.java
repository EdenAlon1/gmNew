package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxk {
    private final Map a = new HashMap();
    private Map b;

    public final synchronized Map a() {
        if (this.b == null) {
            this.b = DesugarCollections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }
}
