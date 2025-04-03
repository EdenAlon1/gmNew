package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgcb {
    private final ArrayBlockingQueue a = new ArrayBlockingQueue(1);
    private boolean b = false;
    private boolean c = false;

    public final Object a(long j) {
        if (this.c) {
            throw new RuntimeException("BlockingChannel can be read only once.");
        }
        this.c = true;
        return this.a.poll(j, TimeUnit.MILLISECONDS);
    }

    public final void b(Object obj) {
        if (this.b) {
            throw new RuntimeException("BlockingChannel can be written only once.");
        }
        this.b = true;
        this.a.offer(obj);
    }
}
