package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltt<E> implements Iterable<E> {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int intValue;
        synchronized (this.a) {
            intValue = this.b.containsKey(obj) ? ((Integer) this.b.get(obj)).intValue() : 0;
        }
        return intValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
