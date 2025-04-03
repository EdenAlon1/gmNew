package defpackage;

import j$.time.Duration;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duoe {
    public static final duoe a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    static {
        Duration.ofSeconds(10L);
        a = new duoe();
    }

    private duoe() {
        new HashSet();
    }

    public final synchronized void a(duof duofVar) {
        this.b.add(duofVar);
    }
}
