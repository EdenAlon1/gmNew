package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvl {
    private final csvo e;
    private static final entd d = entd.c("BugleFlogger");
    public static final Level a = Level.FINEST;
    private final AtomicLong f = new AtomicLong(0);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c = new AtomicReference(a);

    public csvl(csvo csvoVar) {
        this.e = csvoVar;
        csvoVar.c();
    }

    public final void a() {
        Level level;
        csvo csvoVar = this.e;
        long j = csvoVar.a.get();
        csvoVar.c();
        if (this.f.get() == j) {
            return;
        }
        this.b.set(((Boolean) cmsk.b.e()).booleanValue());
        AtomicReference atomicReference = this.c;
        try {
            level = Level.parse((String) cmsk.c.e());
        } catch (IllegalArgumentException e) {
            ensz enszVar = (ensz) ((ensz) ((ensz) d.j()).g(e)).h("com/google/android/apps/messaging/shared/util/flogger/configurable/FloggerConfigurableLoggingFlagsCacher", "getValidatedLevel", 72, "FloggerConfigurableLoggingFlagsCacher.java");
            String j2 = cmsk.c.j();
            Object e2 = cmsk.c.e();
            Level level2 = a;
            enszVar.J("Could not parse the value of phenotype flag: name=%s, value=%s. Using DEFAULT_LEVEL=%s.", j2, e2, level2);
            level = level2;
        }
        atomicReference.set(level);
        this.f.set(j);
    }
}
