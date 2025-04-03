package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyio implements Iterator {
    final /* synthetic */ eyiq a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public eyio(eyiq eyiqVar) {
        this.a = eyiqVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        eyiq eyiqVar = this.a;
        if (i >= eyiqVar.b) {
            return !eyiqVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        eyiq eyiqVar = this.a;
        return i < eyiqVar.b ? (eyin) eyiqVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.a.e();
        int i = this.b;
        eyiq eyiqVar = this.a;
        if (i >= eyiqVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            eyiqVar.c(i);
        }
    }
}
