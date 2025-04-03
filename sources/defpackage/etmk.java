package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmk {
    public static final Logger a = Logger.getLogger(etmk.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private etmk() {
    }

    public static boolean a() {
        return b.get();
    }
}
