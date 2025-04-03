package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgk implements evgh {
    public static final fdxi b = new fdxi("com.google.frameworks.client.data.android.metrics.MutableMetricsContext", null);
    public final evbk c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(-1);
    public final ConcurrentLinkedQueue j = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public final AtomicLong l = new AtomicLong(-1);
    public final AtomicReference m = new AtomicReference(null);

    public evgk(evbk evbkVar) {
        this.c = evbkVar;
    }
}
