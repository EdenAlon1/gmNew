package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdyl {
    static final fdym a;

    static {
        fdym fedtVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            fedtVar = (fdym) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(fdym.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            fedtVar = new fedt();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = fedtVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            fdyn.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
