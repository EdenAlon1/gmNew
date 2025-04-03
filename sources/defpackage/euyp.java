package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyp {
    public static volatile euyp a;
    private final Set b = new HashSet();

    final Set a() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }
}
