package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hom implements Iterator, fflg {
    public final hok a;

    public hom(hoj hojVar) {
        hoz[] hozVarArr = new hoz[8];
        for (int i = 0; i < 8; i++) {
            hozVarArr[i] = new hpd(this);
        }
        this.a = new hok(hojVar, hozVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
