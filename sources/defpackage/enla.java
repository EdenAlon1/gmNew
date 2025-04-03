package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class enla implements Iterator {
    int a;
    int b = -1;
    enlf c;
    AtomicReferenceArray d;
    enlb e;
    enmd f;
    enmd g;
    final /* synthetic */ enme h;

    public enla(enme enmeVar) {
        this.h = enmeVar;
        this.a = enmeVar.d.length - 1;
        b();
    }

    final enmd a() {
        enmd enmdVar = this.f;
        if (enmdVar == null) {
            throw new NoSuchElementException();
        }
        this.g = enmdVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            enme enmeVar = this.h;
            this.a = i - 1;
            enlf enlfVar = enmeVar.d[i];
            this.c = enlfVar;
            if (enlfVar.b != 0) {
                this.d = this.c.e;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(enlb enlbVar) {
        boolean z;
        try {
            Object c = enlbVar.c();
            Object d = enlbVar.c() == null ? null : enlbVar.d();
            if (d != null) {
                this.f = new enmd(this.h, c, d);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.i();
        }
    }

    final boolean d() {
        enlb enlbVar = this.e;
        if (enlbVar == null) {
            return false;
        }
        while (true) {
            this.e = enlbVar.b();
            enlb enlbVar2 = this.e;
            if (enlbVar2 == null) {
                return false;
            }
            if (c(enlbVar2)) {
                return true;
            }
            enlbVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            enlb enlbVar = (enlb) atomicReferenceArray.get(i);
            this.e = enlbVar;
            if (enlbVar != null && (c(enlbVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        endr.b(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
