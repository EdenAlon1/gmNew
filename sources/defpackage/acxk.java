package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxk {
    private static final cskc a = cskc.g("Bugle", "SatelliteUtils");
    private final ctwb b;
    private final ctud c;
    private Optional d = Optional.empty();

    public acxk(ctwb ctwbVar, ctud ctudVar) {
        this.b = ctwbVar;
        this.c = ctudVar;
    }

    public final Optional a() {
        if (!c()) {
            a.m("no PhonePermission");
            return Optional.empty();
        }
        if (this.d.isPresent()) {
            return this.d;
        }
        Iterator it = this.b.m().iterator();
        while (it.hasNext()) {
            Optional i = ((ctwi) it.next()).i(false);
            if (i.isPresent()) {
                this.d = i;
                return i;
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoku, java.lang.Object] */
    public final boolean b() {
        Optional a2 = a();
        return a2.isPresent() && !a2.get().x();
    }

    public final boolean c() {
        return this.c.l();
    }

    public final boolean d() {
        if (this.d.isPresent()) {
            return true;
        }
        return this.b.r();
    }
}
