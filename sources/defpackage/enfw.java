package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enfw implements Iterator {
    final /* synthetic */ enfx a;
    private int b;
    private int c;
    private int d;
    private int e;

    public enfw(enfx enfxVar) {
        this.a = enfxVar;
        enfy enfyVar = enfxVar.b;
        this.b = enfyVar.e;
        this.c = -1;
        this.d = enfyVar.d;
        this.e = enfyVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = this.a.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.a.b.f[i];
        this.e--;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        endr.b(this.c != -1);
        enfy enfyVar = this.a.b;
        int i = this.c;
        enfyVar.h(i, engc.b(enfyVar.a[i]));
        int i2 = this.b;
        enfy enfyVar2 = this.a.b;
        if (i2 == enfyVar2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = enfyVar2.d;
    }
}
