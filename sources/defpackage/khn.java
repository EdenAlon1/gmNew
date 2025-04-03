package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class khn implements Iterator {
    final kho a;
    int b = 0;

    public khn(kho khoVar) {
        this.a = khoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.d();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        khl khlVar = (khl) this.a.a.get(this.b);
        this.b++;
        return khlVar;
    }
}
