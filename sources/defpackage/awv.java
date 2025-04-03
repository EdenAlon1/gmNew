package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awv extends aug {
    private final AtomicBoolean b;

    public awv(avr avrVar) {
        super(avrVar);
        this.b = new AtomicBoolean(false);
    }

    @Override // defpackage.aug, defpackage.avr, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
