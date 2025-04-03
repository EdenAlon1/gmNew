package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dedd {
    public int a = -1;
    final /* synthetic */ dede b;
    private final String c;

    public dedd(dede dedeVar, String str) {
        this.b = dedeVar;
        this.c = str;
    }

    final void a(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        dede dedeVar = this.b;
        dedeVar.d.j(this.c, i);
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            ((decy) it.next()).b(this.a);
        }
    }
}
