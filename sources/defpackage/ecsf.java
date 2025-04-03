package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecsf {
    public final ecrv b;
    public final AtomicInteger a = new AtomicInteger(0);
    public final Map c = new ConcurrentHashMap();
    private final ThreadLocal e = new ecse(this);
    public final List d = new ArrayList();

    public ecsf(String str) {
        this.b = new ecrv(str, Thread.currentThread().getId(), 2);
    }

    final int a() {
        return this.a.get();
    }

    final int b() {
        return this.a.incrementAndGet();
    }

    public final ArrayDeque c() {
        return (ArrayDeque) ((WeakReference) this.e.get()).get();
    }
}
