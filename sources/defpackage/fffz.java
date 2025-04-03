package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffz extends fffx implements Iterator, fflg {
    public fffz(ffga ffgaVar) {
        super(ffgaVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        ffga ffgaVar = this.a;
        int i = this.b;
        if (i >= ffgaVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        Object[] objArr = ffgaVar.c;
        objArr.getClass();
        Object obj = objArr[i];
        b();
        return obj;
    }
}
