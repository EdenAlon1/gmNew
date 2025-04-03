package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwy extends dzwu {
    public int b;
    private final Set c = new HashSet();
    public final Map a = new HashMap();

    public dzwy(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dzwu dzwuVar = (dzwu) it.next();
            this.c.add(new dzww(this, dzwuVar));
            this.a.put(dzwuVar, null);
        }
    }

    private final synchronized void d() {
        this.b = this.c.size();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((dzww) it.next()).a();
        }
    }

    private final synchronized void m() {
        this.b = -1;
        f();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((dzww) it.next()).b();
        }
    }

    @Override // defpackage.dzwu
    protected final synchronized void a() {
        d();
    }

    @Override // defpackage.dzwu
    protected final synchronized void b() {
        m();
    }

    public dzwy(dzwu... dzwuVarArr) {
        for (int i = 0; i < 2; i++) {
            dzwu dzwuVar = dzwuVarArr[i];
            this.c.add(new dzww(this, dzwuVar));
            this.a.put(dzwuVar, null);
        }
    }
}
