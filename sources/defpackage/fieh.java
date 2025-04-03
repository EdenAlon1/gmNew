package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fieh implements Iterator {
    final /* synthetic */ fiei a;
    private final int b;
    private int c;
    private boolean d;

    public fieh(fiei fieiVar) {
        this.a = fieiVar;
        fieiVar.b++;
        this.b = fieiVar.a.size();
    }

    private final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        fiei fieiVar = this.a;
        int i = fieiVar.b - 1;
        fieiVar.b = i;
        if (i > 0 || !fieiVar.c) {
            return;
        }
        fieiVar.c = false;
        int size = fieiVar.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (fieiVar.a.get(size) == null) {
                fieiVar.a.remove(size);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        while (i < this.b && this.a.a(i) == null) {
            i++;
        }
        if (i < this.b) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        while (true) {
            int i = this.c;
            if (i >= this.b || this.a.a(i) != null) {
                break;
            }
            this.c++;
        }
        int i2 = this.c;
        if (i2 >= this.b) {
            a();
            throw new NoSuchElementException();
        }
        fiei fieiVar = this.a;
        this.c = i2 + 1;
        return fieiVar.a(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
