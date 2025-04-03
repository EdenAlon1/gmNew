package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzf {
    public final AtomicReference a = new AtomicReference();
    public final AtomicInteger b = new AtomicInteger();
    public final Supplier c;

    public dtzf(Supplier supplier) {
        this.c = supplier;
    }

    public final int a() {
        Object obj;
        Thread thread = (Thread) this.a.get();
        if (thread == null || thread != Thread.currentThread()) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        obj = this.c.get();
        return ((Integer) obj).intValue();
    }
}
