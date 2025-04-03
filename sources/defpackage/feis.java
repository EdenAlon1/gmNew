package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feis {
    public static final Logger a = Logger.getLogger(feis.class.getName());
    public final String b;
    public final AtomicLong c;

    public feis(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        emxf.b(j > 0, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(j);
    }
}
