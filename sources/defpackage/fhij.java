package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhij {
    private final Set a = new LinkedHashSet();

    public final synchronized void a(fhhf fhhfVar) {
        this.a.remove(fhhfVar);
    }

    public final synchronized void b(fhhf fhhfVar) {
        this.a.add(fhhfVar);
    }

    public final synchronized boolean c(fhhf fhhfVar) {
        return this.a.contains(fhhfVar);
    }
}
