package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egit {
    fapt a;
    final Map b = DesugarCollections.synchronizedMap(new HashMap());
    final List c = DesugarCollections.synchronizedList(new ArrayList());
    final /* synthetic */ egiu d;

    public egit(egiu egiuVar) {
        this.d = egiuVar;
    }

    public final engw a() {
        return engw.n(this.c);
    }

    public final void b(fapt faptVar, Throwable th) {
        this.c.add(((egdt) this.b.remove(faptVar)).e(true != this.d.f.a() ? 15 : 3, th));
    }

    public final void c(fapt faptVar) {
        egdt a = this.d.h.a(faptVar);
        a.d();
        this.b.put(faptVar, a);
    }

    public final void d(fapt faptVar) {
        this.c.add(((egdt) this.b.remove(faptVar)).a());
    }
}
