package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fipz implements Iterable {
    private final fipy a;
    private final fipy b;

    public fipz(fipy fipyVar, fipy fipyVar2) {
        this.a = fipyVar;
        this.b = fipyVar2;
    }

    @Override // java.lang.Iterable
    public final Iterator<fipy> iterator() {
        return new fiqa(this.a, this.b);
    }
}
