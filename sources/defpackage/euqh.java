package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euqh implements eusu, eust {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public euqh(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.eusu
    public final void a(Class cls, euwr euwrVar) {
        b(cls, this.c, euwrVar);
    }

    public final synchronized void b(Class cls, Executor executor, euwr euwrVar) {
        euqo.b(euwrVar);
        euqo.b(executor);
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.b.get(cls)).put(euwrVar, executor);
    }

    public final synchronized Set c() {
        throw null;
    }
}
