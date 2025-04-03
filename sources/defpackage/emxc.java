package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emxc<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static emxc h() {
        return emux.a;
    }

    public static emxc i(Object obj) {
        return obj == null ? emux.a : new emxn(obj);
    }

    public static emxc j(Object obj) {
        obj.getClass();
        return new emxn(obj);
    }

    public abstract emxc a(emxc emxcVar);

    public abstract emxc b(emwl emwlVar);

    public abstract Object c();

    public abstract Object d(emyl emylVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();
}
