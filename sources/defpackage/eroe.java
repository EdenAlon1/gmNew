package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eroe extends eroc {
    @Override // defpackage.eroc
    public final int a(erof erofVar) {
        int i;
        synchronized (erofVar) {
            i = erofVar.remaining - 1;
            erofVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.eroc
    public final void b(erof erofVar, Set set) {
        synchronized (erofVar) {
            if (erofVar.seenExceptions == null) {
                erofVar.seenExceptions = set;
            }
        }
    }
}
