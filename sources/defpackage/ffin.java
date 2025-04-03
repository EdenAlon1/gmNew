package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffin implements Iterator, fflg {
    final /* synthetic */ ffio a;
    private String b;
    private boolean c;

    public ffin(ffio ffioVar) {
        this.a = ffioVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.b;
        if (str == null && !this.c) {
            str = this.a.a.readLine();
            this.b = str;
            if (str == null) {
                this.c = true;
            }
        }
        return str != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.b;
        this.b = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
