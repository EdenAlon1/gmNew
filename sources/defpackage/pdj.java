package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdj {
    public final List a = new CopyOnWriteArrayList();

    public static final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pdo) it.next()).a();
        }
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((pdp) it.next()).a());
        }
        return arrayList;
    }
}
