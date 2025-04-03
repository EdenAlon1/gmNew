package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dtrs {
    private static final AtomicInteger a = new AtomicInteger();
    public final int i;
    public final Consumer j;

    public dtrs() {
        this.i = a.getAndIncrement();
        this.j = null;
    }

    public Object d(dtyq dtyqVar, dtuk dtukVar) {
        c(dtyqVar, dtukVar);
        return null;
    }

    public void e(dtyq dtyqVar, dtuk dtukVar, Object obj) {
        b(dtyqVar, dtukVar);
    }

    public final int hashCode() {
        return this.i;
    }

    public dtrs(Consumer consumer) {
        this.i = a.getAndIncrement();
        this.j = consumer;
    }

    public void gb(dtyq dtyqVar) {
    }

    public void b(dtyq dtyqVar, dtuk dtukVar) {
    }

    public void c(dtyq dtyqVar, dtuk dtukVar) {
    }
}
