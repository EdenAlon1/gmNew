package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etrt {
    public static final etrt a = new etrt(DesugarCollections.unmodifiableMap(new HashMap()));
    public final Map b;

    public etrt(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etrt) {
            return this.b.equals(((etrt) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
