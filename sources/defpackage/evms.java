package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class evms implements Iterator {
    evmt a;
    evmt b = null;
    int c;
    final /* synthetic */ evmu d;

    public evms(evmu evmuVar) {
        this.d = evmuVar;
        this.a = evmuVar.e.d;
        this.c = evmuVar.d;
    }

    public final evmt a() {
        evmu evmuVar = this.d;
        evmt evmtVar = this.a;
        if (evmtVar == evmuVar.e) {
            throw new NoSuchElementException();
        }
        if (evmuVar.d != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = evmtVar.d;
        this.b = evmtVar;
        return evmtVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        evmt evmtVar = this.b;
        if (evmtVar == null) {
            throw new IllegalStateException();
        }
        this.d.e(evmtVar, true);
        this.b = null;
        this.c = this.d.d;
    }
}
