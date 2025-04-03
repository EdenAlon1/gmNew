package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkhr implements dkrm {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((dkrl) it.next()).p()) {
                it.remove();
            }
        }
    }
}
