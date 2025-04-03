package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czex {
    public final ctyx c;
    private final Executor e;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Set b = new LinkedHashSet();
    public final String d = "recent_emoji";

    public czex(Executor executor, ctyx ctyxVar) {
        this.e = new ersb(executor);
        this.c = ctyxVar;
        new czev(this).e(new Void[0]);
    }

    public final void a(czew czewVar) {
        this.b.add(czewVar);
    }

    public final void b(String str) {
        while (this.a.remove(str)) {
        }
        this.a.add(0, str);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((czew) it.next()).J(this);
        }
        elfo.f(new Runnable() { // from class: czeu
            @Override // java.lang.Runnable
            public final void run() {
                emww emwwVar = new emww(",");
                czex czexVar = czex.this;
                czexVar.c.l(czexVar.d, emwwVar.b(czexVar.a));
            }
        }, this.e).k(axnw.b(), erpp.a);
    }

    public final void c(czew czewVar) {
        this.b.remove(czewVar);
    }
}
