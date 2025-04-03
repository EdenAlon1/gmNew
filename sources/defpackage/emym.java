package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emym<T> implements Serializable, emyl {
    private static final long serialVersionUID = 0;
    final emyl a;
    final long b;
    volatile transient Object c;
    volatile transient long d;
    private transient emyy e = new emyy();

    public emym(emyl emylVar, long j) {
        this.a = emylVar;
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = new emyy();
    }

    @Override // defpackage.emyl
    public final T get() {
        long j = this.d;
        long nanoTime = System.nanoTime();
        if (j == 0 || nanoTime - j >= 0) {
            synchronized (this.e) {
                if (j == this.d) {
                    T t = (T) this.a.get();
                    this.c = t;
                    long j2 = nanoTime + this.b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.a.toString() + ", " + this.b + ", NANOS)";
    }
}
