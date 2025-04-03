package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiqa implements Iterator {
    private fipy a;
    private final fipy b;

    public fiqa(fipy fipyVar, fipy fipyVar2) {
        this.a = fipyVar;
        this.b = fipyVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        fipy fipyVar = this.a;
        return (fipyVar == null || fipyVar == this.b) ? false : true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        fipy fipyVar = this.a;
        this.a = fipyVar.i;
        return fipyVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
