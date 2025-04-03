package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedb {
    public final fedg a;
    public final Map b;

    public fedb(fedg fedgVar, Map map) {
        this.a = fedgVar;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public final Collection a() {
        return this.b.values();
    }
}
