package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htk extends htj implements Iterator, fflg {
    public htk(hsv hsvVar, Iterator it) {
        super(hsvVar, it);
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = this.d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getKey();
    }
}
