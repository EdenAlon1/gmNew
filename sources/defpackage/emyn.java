package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emyn<T> implements Serializable, emyl {
    private static final long serialVersionUID = 0;
    final emyl a;
    volatile transient boolean b;
    transient Object c;
    private transient emyy d = new emyy();

    public emyn(emyl emylVar) {
        emylVar.getClass();
        this.a = emylVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new emyy();
    }

    @Override // defpackage.emyl
    public final T get() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    T t = (T) this.a.get();
                    this.c = t;
                    this.b = true;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.b(obj, "Suppliers.memoize(", ")");
    }
}
