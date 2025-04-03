package defpackage;

import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeom {
    private long f;
    private Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private final UUID b = UUID.randomUUID();
    private final ArrayDeque c = new ArrayDeque();
    public final Set a = new HashSet();

    private final int d() {
        return this.c.size() - 1;
    }

    private final eeol e() {
        emxf.m(!b(), "history is empty, have you called enterInitialState?");
        eeol eeolVar = (eeol) this.c.peekFirst();
        eeolVar.getClass();
        return eeolVar;
    }

    private final boolean f() {
        return this.d.isEmpty();
    }

    public final eeop a() {
        return e().a;
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final eeoh c(eeol eeolVar) {
        boolean z = false;
        if (!b() && a().equals(eeolVar.a)) {
            z = true;
        }
        boolean z2 = z;
        if (b()) {
            this.f = eeolVar.b;
        }
        this.c.addFirst(eeolVar);
        this.a.add(eeolVar.a);
        if (f() && !eeolVar.c()) {
            this.d = Optional.of(eeolVar);
            this.e = Optional.of(Integer.valueOf(d()));
        }
        boolean f = f();
        Optional optional = this.d;
        Optional optional2 = this.e;
        int d = d();
        UUID uuid = this.b;
        int millis = (int) TimeUnit.NANOSECONDS.toMillis(e().b - this.f);
        int i = eeos.d;
        return new eeoh(eeolVar, f, optional, optional2, d, uuid, z2, millis);
    }
}
