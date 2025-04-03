package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqb {
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public final djrm a(int i) {
        Object obj = this.c.get(new djrq(i));
        if (i < 0) {
            obj = null;
        }
        djrm djrmVar = (djrm) obj;
        if (djrmVar == null || djrn.a(djrmVar).a.length() == 0) {
            return null;
        }
        return djrmVar;
    }

    public final void b(cosw coswVar) {
        this.a.set(coswVar);
    }
}
