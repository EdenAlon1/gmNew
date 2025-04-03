package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffv extends fffx implements Iterator, fflg {
    public fffv(ffga ffgaVar) {
        super(ffgaVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        ffga ffgaVar = this.a;
        int i = this.b;
        if (i >= ffgaVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        fffw fffwVar = new fffw(ffgaVar, i);
        b();
        return fffwVar;
    }
}
