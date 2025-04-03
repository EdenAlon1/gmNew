package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzi {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService c;
    public final ReferenceQueue b = new ReferenceQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public ekzi(ExecutorService executorService) {
        this.c = executorService;
    }
}
