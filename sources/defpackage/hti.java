package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hti extends htj implements Iterator, fflg {
    public hti(hsv hsvVar, Iterator it) {
        super(hsvVar, it);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        if (this.c != null) {
            return new hth(this);
        }
        throw new IllegalStateException();
    }
}
