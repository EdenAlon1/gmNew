package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ench<E> extends encp<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient enoj a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.a = g();
        for (int i = 0; i < readInt; i++) {
            a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (ennx ennxVar : j()) {
            objectOutputStream.writeObject(ennxVar.b());
            objectOutputStream.writeInt(ennxVar.a());
        }
    }

    @Override // defpackage.encp, defpackage.enny
    public final int a(Object obj, int i) {
        if (i == 0) {
            return b(obj);
        }
        emxf.d(i > 0, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        long j = i;
        if (d == -1) {
            this.a.p(obj, i);
            this.b += j;
            return 0;
        }
        int c = this.a.c(d);
        long j2 = c + j;
        emxf.e(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.a.n(d, (int) j2);
        this.b += j;
        return c;
    }

    @Override // defpackage.enny
    public final int b(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.encp
    public final int c() {
        return this.a.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        enoj enojVar = this.a;
        enojVar.d++;
        Arrays.fill(enojVar.a, 0, enojVar.c, (Object) null);
        Arrays.fill(enojVar.b, 0, enojVar.c, 0);
        Arrays.fill(enojVar.e, -1);
        Arrays.fill(enojVar.f, -1L);
        enojVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.encp, defpackage.enny
    public final int d(Object obj, int i) {
        emxf.d(true, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            return 0;
        }
        int c = this.a.c(d);
        if (c > i) {
            this.a.n(d, c - i);
        } else {
            this.a.g(d);
            i = c;
        }
        this.b -= i;
        return c;
    }

    @Override // defpackage.encp
    public final Iterator e() {
        return new ence(this);
    }

    @Override // defpackage.encp
    public final Iterator f() {
        return new encf(this);
    }

    public abstract enoj g();

    @Override // defpackage.encp, defpackage.enny
    public final boolean h(Object obj, int i) {
        endr.c(i, "oldCount");
        endr.c(0, "newCount");
        int d = this.a.d(obj);
        if (d == -1) {
            return i == 0;
        }
        if (this.a.c(d) != i) {
            return false;
        }
        this.a.g(d);
        this.b -= i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new enoc(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.enny
    public final int size() {
        return ermn.g(this.b);
    }
}
