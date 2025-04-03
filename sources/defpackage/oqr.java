package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqr {
    private final List c = new ArrayList();
    public final wb a = new oqp(this);
    public final orc b = new oqq(this);

    public final void a(oqs oqsVar) {
        this.c.add(oqsVar);
    }

    final void b() {
        for (oqs oqsVar : this.c) {
            if (oqsVar.k()) {
                oqsVar.g();
            }
        }
    }
}
